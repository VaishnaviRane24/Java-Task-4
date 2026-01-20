# Calculator Application - README

## Overview
This is a Java-based calculator application that demonstrates several core programming concepts including method overloading, exception handling, pass-by-value semantics, and modular programming. The calculator performs basic arithmetic operations with user input.

## Features

### Core Operations
- **Addition**: Supports both integer and double types (method overloading)
- **Subtraction**: Integer subtraction
- **Multiplication**: Integer multiplication
- **Division**: Integer division with exception handling for divide-by-zero

### Key Concepts Demonstrated
1. **Method Overloading**: Multiple `add()` methods with different parameter types
2. **Exception Handling**: Custom error handling for division by zero
3. **Pass-by-Value**: Demonstration of Java's pass-by-value behavior
4. **Modular Design**: Reusable methods for each operation
5. **Input Validation**: Protected division operation

## Code Structure

### Main Class: `Calculator.java`
Contains all the calculator logic and main method.

### Methods

| Method | Parameters | Return Type | Description |
|--------|------------|-------------|-------------|
| `add` | `int a, int b` | `int` | Integer addition |
| `add` | `double a, double b` | `double` | Double addition (overloaded) |
| `subtract` | `int a, int b` | `int` | Integer subtraction |
| `multiply` | `int a, int b` | `int` | Integer multiplication |
| `divide` | `int a, int b` | `double` | Division with exception handling |
| `modifyValue` | `int x` | `void` | Demonstrates pass-by-value |

### Exception Handling
- The `divide()` method throws `ArithmeticException` when dividing by zero
- The main method catches and displays the exception message

## Usage

### Compilation
```bash
javac Calculator.java
```

### Execution
```bash
java Calculator
```

### Sample Output
```
-------- Modular Calculator --------
Enter First Number: 14
Enter Second Number: 2
Addition: 16
Subtraction: 12
Multiplication: 28
Division: 7.0
Addition (double): 30.0
Before modifyValue: 5
Inside modifyValue method: 15
After modifyValue: 5
```

### Error Handling Example
If the user enters 0 as the second number:
```
Division: Error: Division by zero is not allowed
```

## Key Learning Points

1. **Method Overloading**: The ability to define multiple methods with the same name but different parameter types
2. **Exception Handling**: Using try-catch blocks to handle runtime errors gracefully
3. **Pass-by-Value**: Demonstrating that Java passes primitive types by value, not by reference
4. **Code Reusability**: Each operation is encapsulated in its own method for maintainability
5. **Type Safety**: Proper type handling and casting in division operations

## Limitations & Possible Enhancements

### Current Limitations
- Only handles integer inputs from user (except for the overloaded double addition)
- No support for decimal input from user
- Limited to basic arithmetic operations
- No memory or history functionality

### Potential Enhancements
1. Add support for floating-point user input
2. Implement additional operations (modulus, power, square root)
3. Add a menu system for operation selection
4. Include calculation history
5. Add GUI interface
6. Support for multiple numbers instead of just two
7. Add unit tests for each operation

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- Basic command-line knowledge
- Text editor or IDE (optional)

## Author
Java Internship Program

## License
This is an educational example. Feel free to modify and use for learning purposes.
