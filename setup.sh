#!/bin/bash
mvn install:install-file -Dfile=lib/dynalloy.jar -DgroupId=rfm.dynalloy -DartifactId=dynalloy -Dversion=1.0.1 -Dpackaging=jar
mvn install:install-file -Dfile=lib/canonicalizer.jar -DgroupId=dc.unrc -DartifactId=canonicalizer -Dversion=1.0.1 -Dpackaging=jar
