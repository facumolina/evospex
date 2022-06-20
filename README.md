# EvoSpex

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

Given a Java class containing a target method, the use of EvoSpex requires two phases. A state generation phase and an inference phase. 

### States Generation

The state generation phase can be performed with the following command:
```bash
./states_generation.sh <cp> <class> <method>
```
where <cp> is the classpath containing the target class, <class> is the target class fully quallified name and <method> is the target method name. 

### Inference

The inference phase is performed as follows. 

```bash
./evospex.sh <cp> <class> <method>
```

## Example
  
## Output
  
## Evaluation
  
## Contact
  
If you experience any issues, please submit an issue or contact us at fmolina@dc.exa.unrc.edu.ar

