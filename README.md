---
title: Fraction Calculator
description: IntelliJ IDEA project.
---

## Presentation

The program carries out simple actions with common fractions (addition, multiplication, subtraction and division). 
Input data are read from the standard input or from a file. 
When reading from a file, the results writes in a xml-file in the root directory of the project.

## Usage

Executable jar location: `fractionCalculator\target\fractionCalculator-1.0-SNAPSHOT.jar`

To use program in interactive mode, run it without command line arguments 
and enter next type of expression: `nom1/den1 operator nom2/den2`.

Example:
```
java -jar D:\fractionCalculator\target\fractionCalculator-1.0-SNAPSHOT.jar
```

To read data from file, run program with one command line argument: `path_to_file`.

Example:
```
java -jar D:\fractionCalculator\target\fractionCalculator-1.0-SNAPSHOT.jar D:\test.txt
```

Results will be write to `D:\output.xml`