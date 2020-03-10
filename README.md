# instance-generator

> Library capable of generating instances of models (Java POJOs) with field 
(instance variables) matching pre-defined regular expressions.

[![CircleCI](https://circleci.com/gh/ciprianivanov/instance-generator.svg?style=svg)](https://circleci.com/gh/ciprianivanov/instance-generator)
<a href="https://codeclimate.com/github/ciprianivanov/instance-generator/maintainability"><img src="https://api.codeclimate.com/v1/badges/9b3979379fcf42ccbc29/maintainability" /></a>
<a href="https://codeclimate.com/github/ciprianivanov/instance-generator/test_coverage"><img src="https://api.codeclimate.com/v1/badges/9b3979379fcf42ccbc29/test_coverage" /></a>

## Table of content

- [Capabilities](#capabilities)
- [How it works](#how-it-works)
- [Usage](#usage)
- [Future capabilities](#future-capabilities)
- [Technologies](#technologies)

## Capabilities

TBC

## How it works

The library uses regular expressions to generate model fields (instance variables) value.
Each field regular expression is supplied via a field level annotation and the data
associated with the annotation is read using reflection.

## Usage

TBC

### Model preparation

Let's consider the following `Payment` POJO class:

```java
public class Payment {
    
    private String id;
    private String amount;
    private String sender;
    private String receiver;
    private Boolean repeated;
    
    //getters and setters
}
```

Suppose we want to generate an instance of said class with default values for the fields.
In order to be able to do that the model fields should be annotated with the instance-generator
specific annotation `@Autovalue`:

```java
public class Payment {

    @AutoValue(pattern = "[0-9]{9}")
    private String id;

    @AutoValue(pattern = "[0-9]{5,6}\\.[0-9]{2}")
    private String amount;

    @AutoValue(pattern = "[A-Z]{5}")
    private String sender;

    @AutoValue(pattern = "(BO|BA)")
    private String receiver;

    @AutoValue(pattern = "true")
    private Boolean repeated;

    //getters and setters
}
```
The pattern value of the annotation is where out regex goes.

And that's generally it! We can obtain an instance of this specific class with field values matching the 
`pattern` value of the annotation.

### Instance generation

The instance generation call is very simple:

```java
InstanceGenerator.of(Payment.class)
```

Resulting in the following instance:

```text
Payment {
 id=324132662, 
 amount=86006.57, 
 sender='IBQRP', 
 receiver='BO', 
 repeated='true' 
}
```

## Future capabilities

Please be aware that the library is in incipient stages of development, new major features
and improvements are to be expected. Including, but not limited to:

* Ability to supply field generation rule (still regex) using external resources (JSON, YML, XML etc.)
* Ability to generate models in in itself from Swagger and GraphQL API definition files
* instance-generator Maven plugin for seamless build lifecycle integration
* ...

## Technologies

TBC
