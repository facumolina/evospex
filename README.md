![EvoSpex Logo](https://github.com/facumolina/evospex/blob/main/img/evospex-logo-nobg.png "EvoSpex Logo")

EvoSpex is a search-based tool for inferring postconditions of Java methods. Given a Java method, EvoSpex uses evolutionary computation to automatically infer a postcondition assertion capturing the method's current behavior. EvoSpex relies on test generation and a state mutation technique to generate program states caracterizing current behavior as well as potentially invalid behavior, and then produces an assertion distinguishing between these program states. The assertions that EvoSpex produce belongs to a JML-like specification language. Contributions to this repo are welcome!

## Requirements

* Maven
* Java >= 8

## Installation

To build and install EvoSpex locally, clone this repository and run the following commands:

```bash
./setup.sh
mvn clean compile assembly:single
```

## Usage

Given a Java class containing a target method, the use of EvoSpex requires two phases. A state generation phase and an inference phase. The state generation phase generates _valid_ states characterizing the actual method behavior and _invalid_ states representing potentially invalid method behavior. 
 
### States Generation

To perform the state generation phase, run the following command:
```bash
./states_generation.sh <cp> <class> <method>
```
where <cp> is the classpath containing the target class, <class> is the target class fully quallified name and <method> is the target method name. This phase will produce a `states` folder containing the mentioned states for the current subject.

### Inference

After generation the states, to perform the inference phase run the following command. 

```bash
./evospex.sh <cp> <class> <method>
```

## Example

As an example, to generate a postcondition assertion for the method add(int,java.lang.Object) of class AvlTreeList, you can perform the two phases as follows:

```bash
./states_generation.sh lib casestudies.motivation.AvlTreeList add(int,java.lang.Object)
./evospex.sh lib casestudies.motivation.AvlTreeList add(int,java.lang.Object)
```
  
## Output
  
## Evaluation
  
## Contact
  
If you experience any issues, please submit an issue or contact us at fmolina@dc.exa.unrc.edu.ar

