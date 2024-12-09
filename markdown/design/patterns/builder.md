### Introduction to Builder Design Pattern

The Builder Design Pattern is used to construct a complex object step by step. It separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

### Real-Time Scenario: Building a Computer System

Let's consider a real-time scenario where we need to build a computer system. We'll apply the Builder pattern to construct different configurations of a computer system.

#### Computer Class

The `Computer` class represents the complex object that we want to build.

[Computer.java](../../../java/src/awesome/lld/design/patterns/builder/Computer.java)

### Explanation

- **Computer Class:** Represents the complex object with required and optional parameters.
- **ComputerBuilder Class:** Inner static class used to build the `Computer` object step by step.
- **build Method:** Constructs the `Computer` object using the builder.

### Usage Example

Here's how you can use the `ComputerBuilder` to create different configurations of a `Computer` object.

[BuilderPatternExample.java](../../../java/src/awesome/lld/design/patterns/builder/BuilderPatternExample.java)


### Explanation

- **ComputerBuilder:** Used to set the required and optional parameters.
- **build Method:** Creates the `Computer` object with the specified configuration.
- **main Method:** Demonstrates the creation of different `Computer` configurations using the `ComputerBuilder`.

By applying the Builder pattern, we can construct complex objects step by step, making the code more readable and maintainable.