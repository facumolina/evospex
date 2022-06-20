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
randoop_jar=$mutator_dir/lib/randoop-all-4.3.0.jar
mutator_inputs=$mutator_dir/inputs
mutator_outputs=$mutator_dir/outputs
outdir_tests=$mutator_dir/tests

echo "> Listing methods for classes: $class_names"
package=${main_class%.*}
class=${main_class##*.}

# Ignore methods that are known to not work well with be generation
omitmethods="toString|hashCode|equals|clone|compareTo|javax.swing.*|ASTNode.dump|ASTNode.getTree|ASTNode.display|ASTNode.createTree|dk.statsbiblioteket.summa.common.util.PriorityQueue.getComparator|java.lang.Iterable.forEach|java.lang.Iterable.spliterator|java.util.List.spliterator|java.util.Collection.stream|java.util.AbstractList.subList|java.util.List.sort|jahuwaldt.plot.LinearAxisScale.findGoodLimits"

resfile="randoop-out.tmp"
tmpfile="randoop-out-tmp.tmp"

cmd="java -ea $maxmem -cp ${randoop_jar}:${project_classpath} randoop.main.Main gentests $be_test_classes --list-methods-and-exit" 
bash -c "$cmd" > $resfile

echo ""
echo "> Method regexes:"

methods_start=$(grep -n "USING METHODS" $resfile | cut -d":" -f1)
tail -n +$((methods_start+1)) $resfile > $tmpfile

sed -i '/<init>/d' $tmpfile
sed -i 's/(/\\(/g' $tmpfile
sed -i 's/)/\\)/g' $tmpfile
sed -i 's/\[/\\\[/g' $tmpfile
sed -i 's/\]/\\\]/g' $tmpfile

cat $tmpfile

rm $resfile $tmpfile

popd > /dev/null



