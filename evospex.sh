#!/bin/bash

# EvoSpex - A Search-based Tool for Postcondition Inference
#
# This script allows to perform the two phases of EvoSpex:
# 1. State generation
# 2. Postcondition Inference
#
# Usage:
# 1. State generation: ./evospex.sh --genStates <classpath> <test_suite> <method>
# 2. Postcondition inference: ./evospex.sh --infer <classpath> <class> <method_states>
root_dir=$PWD;
evospex_jar=$root_dir/target/evospex.jar;
if [ "$1" = "--genStates" ]; then
    # State generation
    subject_cp=$2;
    full_cp=$evospex_jar:$subject_cp;
    test_suite=$3;
    method='"'$4'"';
    cmd=$(echo 'java -cp '$full_cp' evospex.StateGenerator '$test_suite' '$method)
    eval $cmd
    exit 0
fi

if [ "$1" = "--infer" ]; then
    # Postcondition inference
    subject_cp=$2;
    full_cp=$evospex_jar:$subject_cp;
    target_class_fqn=$3;
    method_states=$4;
    cd $method_states;
    num_args="$( ls -l in*.xml | wc -l )";
    num_outputs="$( ls -l out*.xml | wc -l )";
    cd $root_dir
    java -cp $full_cp evospex.EvoSpex $target_class_fqn $method_states $num_args $num_outputs $5 $6 $7 $8
    exit 0
fi

echo './evospex.sh: invalid option: '$1
echo 'usage: ./evospex.sh --genStates <classpath> <test_suite> <method>'
echo '       ./evospex.sh --infer <classpath> <class> <method_states>'
exit 1