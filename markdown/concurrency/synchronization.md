# Synchronization in Java Documentation

This project demonstrates the usage of synchronization in Java to ensure thread safety when multiple threads access shared resources. It includes a real-time example of a bank account with synchronized methods to handle deposits and withdrawals.

## Examples

### 1. BankAccount Example

The `BankAccount` class represents a bank account with synchronized methods to ensure thread safety.

**Code:**
- [BankAccount.java](../../java/src/awesome/lld/fundamentals/concurrency/synchronization/BankAccount.java)

### 2. BankTransaction Example

The `BankTransaction` class performs deposit and withdrawal operations on a `BankAccount`. It implements the `Runnable` interface to allow its instances to be executed by a thread.

**Code:**
- [BankTransaction.java](../../java/src/awesome/lld/fundamentals/concurrency/synchronization/BankTransaction.java)

### 3. BankingApp Example

The `BankingApp` class creates multiple threads to perform transactions on the shared `BankAccount`.

**Code:**
- [BankingApp.java](../../java/src/awesome/lld/fundamentals/concurrency/synchronization/BankingApp.java)

## How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Compile the Java files using your preferred IDE or command line.
4. Run the `BankingApp` class to see the synchronization in action.

## Key Concepts

- **Thread Safety:** Ensures that shared resources are accessed by only one thread at a time.
- **Critical Section:** A part of the program that accesses shared resources and must not be executed by more than one thread at a time.
- **Synchronization:** Prevents thread interference and memory consistency errors by controlling the access of multiple threads to shared resources.

By using synchronization, you can ensure that your multi-threaded applications work correctly and efficiently without data corruption or inconsistency.