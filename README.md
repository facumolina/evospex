![EvoSpex Logo](https://github.com/facumolina/evospex/blob/main/img/evospex-logo-nobg.png "EvoSpex Logo")

![Maven build and test](https://github.com/facumolina/evospex/actions/workflows/maven.yml/badge.svg)

EvoSpex is a search-based tool for inferring postconditions of Java methods. Given a Java method and a test suite with executions of the method, EvoSpex uses evolutionary computation to automatically infer a postcondition assertion capturing the method's current behavior. EvoSpex relies on a state generation technique to generate program states caracterizing current behavior as well as potentially invalid behavior, and then produces an assertion distinguishing between these program states. The assertions that EvoSpex produce belong to a JML-like specification language. Contributions to this repo are welcome!

Check out our [demo video](https://youtu.be/-yAofyWZduQ)!

## Requirements

* [Apache Maven](https://maven.apache.org/) (tested with version 3.8.5)
* Java >= 8

## Installation

To build and install EvoSpex locally, clone this repository and run the following command:

```bash
mvn clean compile assembly:single
mvn test-compile
```

### Docker installation

Coming soon!

## Using the Tool

Given a Java class containing the target method and a test suite with execution of the method, the use of EvoSpex requires two phases. A state generation phase and an inference phase. The state generation phase generates _valid_ states characterizing the current behavior of the target method and _invalid_ states representing invalid behavior of the target method. 
 
### States Generation

To perform the state generation phase, run the following command:
```bash
./evospex.sh --genStates <cp> <test_suite> "<method>"
```
where ```<cp>``` is the target subject classpath, ```<test_suite>``` is the target test suite fully quallified name and ```"<method>"``` is the target method signature. This phase will produce, in the `states` folder, the files containing the states for the current target method.

### Postcondition Inference

After generating the states, to perform the inference phase and generate the postcondition assertion, run the following command: 

```bash
./evospex.sh --infer <cp> <class> <method_states>
```
where ```<method_states>``` is the folder containing the states produced in the previous phase. The execution will report information of each generation of the evolutionary process (mutations performed, crossovers performed, best fitness value, etc). At the end, the candidate postcondition is reported in the form of an assertion.
 
### Example

As an example, let us consider method [add(int, java.lang.Object)](https://github.com/facumolina/evospex/blob/main/src/examples/java/casestudies/commonscollections/TreeList.java#L227) of class TreeList, took from the [Apache Commons Collections](https://github.com/apache/commons-collections) repository. This method inserts an element in a specific position on an avl-tree based implementation of lists. To generate a postcondition assertion for this method, and using as input the test suite [TreeListRegressionTest0](https://github.com/facumolina/evospex/blob/main/src/test/java/casestudies/commonscollections/TreeListRegressionTest0.java), automatically generated with [Randoop](https://randoop.github.io/randoop/) the two phases can be performed as follows:

```bash
./evospex.sh --genStates target/test-classes/ casestudies.commonscollections.TreeListRegressionTest0 "<casestudies.commonscollections.TreeList: void add(int,java.lang.Object)>"
./evospex.sh --infer target/evospex.jar casestudies.commonscollections.TreeList states/casestudies.commonscollections.TreeList/_void_add\(int,java.lang.Object\)/
```

### Output

EvoSpex reports the postcondition as an assert statement: `assert(...);`. For instance, for the above example, an execution of EvoSpex may return a postcondition such as the following:
```java
assert(
  this.size = \old(this.size) + 1 &&
  #(old(this).root.*(left+right))=this.size-1 &&
  index in this.root.*(left).height &&
  obj in this.root.*(left+right).value
);
```

### EvoSpex Optional Command Line Parameters

<table class="tg">
<thead>
  <tr>
    <th class="tg-73oq">Parameter</th>
    <th class="tg-73oq">Description</th>
    <th class="tg-73oq">Example</th>
    <th class="tg-73oq">Default value</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-73oq">popSize</td>
    <td class="tg-73oq">Evolutionary algorithm population size</td>
    <td class="tg-73oq">popSize=1000</td>
    <td class="tg-73oq">500</td>
  </tr>
 <tr>
    <td class="tg-73oq">gens</td>
    <td class="tg-73oq">Evolutionary algorithm generations</td>
    <td class="tg-73oq">gens=500</td>
    <td class="tg-73oq">100</td>
  </tr>
 <tr>
    <td class="tg-73oq">to</td>
    <td class="tg-73oq">Evolutionary algorithm timeout (in seconds)</td>
    <td class="tg-73oq">to=1800</td>
    <td class="tg-73oq">600</td>
  </tr>
 <tr>
    <td class="tg-73oq">mp</td>
    <td class="tg-73oq">Mutation probability</td>
    <td class="tg-73oq">mp=0.2</td>
    <td class="tg-73oq">0.3</td>
  </tr>
 <tr>
    <td class="tg-73oq">cp</td>
    <td class="tg-73oq">Crossover probability</td>
    <td class="tg-73oq">cp=0.6</td>
    <td class="tg-73oq">0.55</td>
  </tr>
</tbody>
</table>
 
## Evaluation

The evaluation subjects can be found here: [![DOI](https://zenodo.org/badge/DOI/10.5281/zenodo.4458256.svg)](https://doi.org/10.5281/zenodo.4458256)
 
To run EvoSpex on all the subjects you can follow the instructions in this [page](https://github.com/facumolina/evospex-ae#reproducing-the-experiments-in-the-paper).

## Contact
  
If you experience any issues, please submit an issue or contact us at fmolina@dc.exa.unrc.edu.ar!
