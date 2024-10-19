# Volatile Keyword in Java Documentation

This project demonstrates the usage of the `volatile` keyword in Java to ensure visibility of changes to variables across multiple threads. It includes a real-time example of a counter with a `volatile` variable to handle concurrent increments.

## Examples

### 1. Counter Example

The `Counter` class represents a simple counter with a `volatile` variable to ensure visibility of changes across threads.

**Code:**
- [Counter.java](../../java/src/awesome/lld/java/concurrency/volatilekeyword/Counter.java)

### 2. CounterIncrementer Example

The `CounterIncrementer` class increments the counter. It implements the `Runnable` interface to allow its instances to be executed by a thread.

**Code:**
- [CounterIncrementer.java](../../java/src/awesome/lld/java/concurrency/volatilekeyword/CounterIncrementer.java)

### 3. VolatileExampleApp Example

The `VolatileExampleApp` class creates multiple threads to increment the shared counter.

**Code:**
- [VolatileExampleApp.java](../../java/src/awesome/lld/java/concurrency/volatilekeyword/VolatileExampleApp.java)

## How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Compile the Java files using your preferred IDE or command line.
4. Run the `VolatileExampleApp` class to see the `volatile` keyword in action.

## Key Concepts

- **Volatile Keyword:** Ensures visibility of changes to a variable across threads.
- **Thread Safety:** Ensures that shared resources are accessed correctly by multiple threads.
- **Visibility Guarantee:** Changes made by one thread to a `volatile` variable are visible to other threads.

By using the `volatile` keyword, you can ensure that changes to a variable are visible across multiple threads, providing a simple mechanism for thread-safe operations.