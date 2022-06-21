![EvoSpex Logo](https://github.com/facumolina/evospex/blob/main/img/evospex-logo-nobg.png "EvoSpex Logo")

EvoSpex is a search-based tool for inferring postconditions of Java methods. Given a Java method, EvoSpex uses evolutionary computation to automatically infer a postcondition assertion capturing the method's current behavior. EvoSpex relies on test generation and a state mutation technique to generate program states caracterizing current behavior as well as potentially invalid behavior, and then produces an assertion distinguishing between these program states. The assertions that EvoSpex produce belongs to a JML-like specification language. Contributions to this repo are welcome!

## Requirements

* [Apache Maven](https://maven.apache.org/) (tested with version 3.8.5)
* Java >= 8

## Installation

To build and install EvoSpex locally, clone this repository and run the following commands:

```bash
./setup.sh
mvn clean compile assembly:single
```

## Usage

Given a Java class containing the target method, the use of EvoSpex requires two phases. A state generation phase and an inference phase. The state generation phase generates _valid_ states characterizing the current behavior of the target method and _invalid_ states representing invalid behavior of the target method. 
 
### States Generation

To perform the state generation phase, run the following command:
```bash
./state-generation.sh <cp> <class> "<method>"
```
where <cp> is the target subject classpath, <class> is the target class fully quallified name and "<method>" is the target method signature. This phase will produce the `states` folder containing the states for the current target method.

### Postcondition Assertion Inference

After generating the states, to generate perform the inference phase and generate the postcondition assertion run the following command. 

```bash
./evospex.sh <cp> <class> <method_states>
```
where "<method_states>" is the folder containing the states produced in the previous phase. The execution will report information of each generation of the evolutionary process (mutations performed, crossovers performed, best fitness value, etc). At the end, the candidate postcondition is reported in the form of an assertion.
 
## Example

As an example, let's consider the method [add(int,java.lang.Object)](https://github.com/facumolina/evospex/blob/main/src/examples/casestudies/motivation/AvlTreeList.java#L86) of class AvlTreeList, which inserts an element in a specific position on an avl-tree based implementation of lists. To generate a postcondition assertion for such method, you can perform the two phases as follows:

```bash
./state-generation.sh <working_dir>/target/evospex.jar casestudies.motivation.AvlTreeList "add(int,java.lang.Object)"
./evospex.sh <working_dir>/target/evospex.jar casestudies.motivation.AvlTreeList states/casestudies.motivation.AvlTreeList/add(int,java.lang.Object)/
```

Note: you can list all the possible target methods of a class by running the script `./state-generation/list-method-regexes-randoop.sh <cp> <class>`. 

## Output
  
## Evaluation

The evaluation subjects can be found here: [![DOI](https://zenodo.org/badge/DOI/10.5281/zenodo.4458256.svg)](https://doi.org/10.5281/zenodo.4458256)
 
Then, to run EvoSpex on all the subjects you can follow the instructions in this [page](https://github.com/facumolina/evospex-ae#reproducing-the-experiments-in-the-paper). 
 
## Contact
  
If you experience any issues, please submit an issue or contact us at fmolina@dc.exa.unrc.edu.ar!

