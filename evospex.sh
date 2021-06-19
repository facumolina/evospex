#!/bin/bash
root_dir=$PWD;
base_folder=$2;

target_class_fqn=$1
target_class_sn=$(sed 's/.*\.//' <<< $1)
model_dir='src/test/resources/objects'
model_file=$model_dir/$target_class_sn/model/$target_class_sn.als

cd $base_folder;
num_args="$( ls -l in*.xml | wc -l )";
num_outputs="$( ls -l out*.xml | wc -l )";
cd $root_dir;
java -jar target/evospex-jar-with-dependencies.jar $model_file $2 $num_args $num_outputs $3 $4 $5 $6 $7 $8
