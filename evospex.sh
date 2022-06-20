#!/bin/bash
root_dir=$PWD;

target_class_fqn=$1
base_folder=$2;

cd $base_folder;
num_args="$( ls -l in*.xml | wc -l )";
num_outputs="$( ls -l out*.xml | wc -l )";
cd $root_dir;
java -jar target/evospex.jar $target_class_fqn $2 $num_args $num_outputs $3 $4 $5 $6 $7 $8
