#!/bin/bash

# This script allows to perform the states generation phase for a given subject:
subject_cp=$1
class=$2
method=$3

export EVOSPEX_TEST_GEN=$(pwd)/state-generation

echo '>> States Generation phase'
echo 'target class: '$class
echo 'target method: '$method
echo 'classpath: '$subject_cp
echo ''

echo '> Generating states...'
pushd $EVOSPEX_TEST_GEN > /dev/null
./gen-randoop-pos-neg-objects.sh $subject_cp $class $method 4
popd > /dev/null
mkdir -p states/$class/$method/
mv $EVOSPEX_TEST_GEN/outputs/* states/$class/$method/
echo 'states saved in 'states/$class/$method
echo ''

echo 'Done!'
