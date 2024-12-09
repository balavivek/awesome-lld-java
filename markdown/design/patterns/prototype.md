### Introduction to Prototype Design Pattern

The Prototype Design Pattern is used to create a duplicate object while keeping performance in mind. This pattern involves implementing a prototype interface that tells to create a clone of the current object. The Prototype pattern is used when the creation of an object is costly or complex.

### Real-Time Scenario: Document Cloning System

Let's consider a real-time scenario where we need to clone documents. We'll apply the Prototype pattern to create copies of different types of documents.

#### Document Interface

The `Document` interface defines a method for cloning documents.

[Document.java](../../../java/src/awesome/lld/design/patterns/prototype/Document.java)


#### Concrete Document Classes

We will create two concrete classes, `WordDocument` and `ExcelDocument`, that implement the `Document` interface.

[WordDocument.java](../../../java/src/awesome/lld/design/patterns/prototype/WordDocument.java)

[ExcelDocument.java](../../../java/src/awesome/lld/design/patterns/prototype/ExcelDocument.java)

### Usage Example

Here's how you can use the `Document` interface and its concrete implementations to clone documents.

[PrototypePatternExample.java](../../../java/src/awesome/lld/design/patterns/prototype/PrototypePatternExample.java)


### Explanation

- **Document Interface:** Defines the `clone` method for cloning documents.
- **WordDocument and ExcelDocument Classes:** Implement the `Document` interface and provide their own cloning logic.
- **PrototypePatternExample Class:** Demonstrates the cloning of `WordDocument` and `ExcelDocument` objects.

By applying the Prototype pattern, we can create copies of complex objects efficiently, making the code more flexible and maintainable.