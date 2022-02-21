#!/bin/bash
mvn install:install-file -Dfile=lib/canonicalizer.jar -DgroupId=dc.unrc -DartifactId=canonicalizer -Dversion=1.0.1 -Dpackaging=jar
