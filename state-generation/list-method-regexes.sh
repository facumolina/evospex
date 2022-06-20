#!/bin/bash

# Important: Set EVOSPEX_TEST_GEN environment variable to the root directory of this repo first! 

# Set if not enough memory
# maxmem=-Xmx8G

if [ -z ${EVOSPEX_TEST_GEN+x} ]; then 
    echo "Error: EVOSPEX_TEST_GEN environment variable must be set before executing $0"
    exit -1
fi


if [ "$#" -lt 2 ]; then
    echo "Error: Illegal number of parameters"
    echo "Usage: $0 <project_classpath> <main_class> <deps...>?"
    exit -1
fi



project_classpath=$1
main_class=$2
regex_method=$3
scope=3

be_test_classes="--testclass=$main_class"
class_names="$main_class"
for var in "${@:5}"; do
    be_test_classes+=" --testclass=$var"
    class_names+=" $var"
done

mutator_dir=$EVOSPEX_TEST_GEN
pushd $EVOSPEX_TEST_GEN > /dev/null


# Variables with fixed values
be_jar=$mutator_dir/lib/randoop-all-3.0.6.jar
mutator_inputs=$mutator_dir/inputs
mutator_outputs=$mutator_dir/outputs
outdir_tests=$mutator_dir/tests

echo "> Listing methods for classes: $class_names"
package=${main_class%.*}
class=${main_class##*.}

# IMPORTANT: Test generation fixed values
timelimit=60
outputlimit2ph=5000
# What if we set the much larger than scope?
maxBEit=$((scope+scope))
maxsize=$((maxBEit+maxBEit))
# END OF IMPORTANT: Test generation values

# Guess these are not important
testlimit=50000000
testlimit2ph=10000000

literals=${mutator_dir}/literals/literals${scope}.txt
canprop=${mutator_dir}/properties/scope${scope}.canonicalizer.properties

# Ignore methods that are known to not work well with be generation
omitmethods="toString|hashCode|equals|clone|compareTo|javax.swing.*|ASTNode.dump|ASTNode.getTree|ASTNode.display|ASTNode.createTree|dk.statsbiblioteket.summa.common.util.PriorityQueue.getComparator|java.lang.Iterable.forEach|java.lang.Iterable.spliterator|java.util.List.spliterator|java.util.Collection.stream|java.util.AbstractList.subList|java.util.List.sort|jahuwaldt.plot.LinearAxisScale.findGoodLimits"

be_config_flags=$(tr '\n' ' ' < be-config.txt)

resfile="be-out.tmp"
tmpfile="tmp-out-tmp.tmp"

cmd="java -ea $maxmem -cp ${be_jar}:${project_classpath} randoop.main.Main gentests $be_test_classes --serialize-in-out-class=${main_class} --serialize-in-out-folder=$mutator_inputs --junit-package-name=$package --junit-output-dir=$outdir_tests --timelimit=$timelimit --max-BE-inputs=$testlimit --max-BE-second-phase-seqs=$testlimit2ph --literals-level=ALL --literals-file=$literals --max-BE-iterations=$maxBEit --max-BE-second-phase-outputs=$outputlimit2ph --canonicalizer-cfg=$canprop --omitmethods=\"$omitmethods\" --BEmaxsize=$maxsize $be_config_flags --only-list-methods"

bash -c "$cmd" > $resfile

echo ""
echo "> Method regexes:"

methods_start=$(grep -n "USING METHODS" $resfile | cut -d":" -f1)
tail -n +$((methods_start+1)) $resfile > $tmpfile

sed -i '/<init>/d' $tmpfile
sed -i 's/(/\\(/g' $tmpfile
sed -i 's/)/\\)/g' $tmpfile
sed -i 's/\[/\\\[/g' $tmpfile

cat $tmpfile

rm $resfile $tmpfile

popd > /dev/null



