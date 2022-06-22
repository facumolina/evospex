#!/bin/bash

# This script allows to perform the postcondition assertion inference phase by running EvoSpex.
root_dir=$PWD;
subject_cp=$1
target_class_fqn=$2
method_states=$3

# Count arguments and outputs
cd $method_states;
num_args="$( ls -l in*.xml | wc -l )";
num_outputs="$( ls -l out*.xml | wc -l )";
cd $root_dir;

# Run EvoSpex
java -cp $subject_cp -jar target/evospex.jar $target_class_fqn $method_states $num_args $num_outputs $3 $4 $5 $6 $7 $8
