# Test generation for the EvoSpex contracts learning tool 

## Install

- Clone the repository
- Set `EVOSPEX_TEST_GEN` environment variable to the root directory of the repository 
- Change directory to `EVOSPEX_TEST_GEN`

  ```cd $EVOSPEX_TEST_GEN```

## Bounded exhaustive test generation

- Generate tests using the `gen-be-pos-neg-objects.sh` script
  
  - Usage: `./gen-be-pos-neg-objects.sh <project_classpath> <main_class> <regex_method> <scope> <deps...>?`

  - Example: `./gen-be-pos-neg-objects.sh "$EVOSPEX_SF110/2_a4j/build/classes" "net.kencochrane.a4j.beans.Artists" "net.kencochrane.a4j.beans.Artists.getArtist\(\)" 3`
    (Here $EVOSPEX_SF110 points to the SF110 folder in your computer). Resulting positive and negative objects will be stored in folder `$EVOSPEX_TEST_GEN/outputs`.


### List method regexes for a class for bounded exhaustive generation

To figure out the regexes for all the methods of a given class, use the `list-method-regexes.sh` script.

  - Usage: `./list-method-regexes.sh <project_classpath> <main_class> <deps...>?`

  - Example: `./list-method-regexes.sh "$EVOSPEX_SF110/2_a4j/build/classes" "net.kencochrane.a4j.beans.Artists"`

## Test generation using Randoop

- Generate tests using the `gen-randoop-pos-neg-objects.sh` script
  
  - Usage: `./gen-randoop-pos-neg-objects.sh <project_classpath> <main_class> <regex_method> <scope> <deps...>?`

  - Example: `./gen-randoop-pos-neg-objects.sh "$EVOSPEX_SF110/2_a4j/build/classes" "net.kencochrane.a4j.beans.Artists" "net.kencochrane.a4j.beans.Artists.getArtist\(\)" 3`
    (Here $EVOSPEX_SF110 points to the SF110 folder in your computer). Resulting positive and negative objects will be stored in folder `$EVOSPEX_TEST_GEN/outputs`.


### List method regexes for a class for generation using Randoop

To figure out the regexes for all the methods of a given class, use the `list-method-regexes-randoop.sh` script.

  - Usage: `./list-method-regexes-randoop.sh <project_classpath> <main_class> <deps...>?`

  - Example: `./list-method-regexes-randoop.sh "$EVOSPEX_SF110/2_a4j/build/classes" "net.kencochrane.a4j.beans.Artists"`


