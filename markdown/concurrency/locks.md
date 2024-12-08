# Locks (ReentrantLock) in Java Documentation

This project demonstrates the usage of `ReentrantLock` in Java to ensure thread safety when multiple threads access shared resources. It includes a real-time example of a bank account with methods protected by `ReentrantLock` to handle deposits and withdrawals.

## Examples

### 1. BankAccount Example

The `BankAccount` class represents a bank account with methods protected by `ReentrantLock` to ensure thread safety.

**Code:**
- [BankAccount.java](../../java/src/awesome/lld/fundamentals/concurrency/locks/BankAccount.java)

### 2. BankTransaction Example

The `BankTransaction` class performs deposit and withdrawal operations on a `BankAccount`. It implements the `Runnable` interface to allow its instances to be executed by a thread.

**Code:**
- [BankTransaction.java](../../java/src/awesome/lld/fundamentals/concurrency/locks/BankTransaction.java)

### 3. BankingApp Example

The `BankingApp` class creates multiple threads to perform transactions on the shared `BankAccount`.

**Code:**
- [BankingApp.java](../../java/src/awesome/lld/fundamentals/concurrency/locks/BankingApp.java)

## How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Compile the Java files using your preferred IDE or command line.
4. Run the `BankingApp` class to see the `ReentrantLock` in action.

## Key Concepts

- **ReentrantLock:** Provides more flexible locking operations than `synchronized` methods and statements.
- **Thread Safety:** Ensures that shared resources are accessed by only one thread at a time.
- **Critical Section:** A part of the program that accesses shared resources and must not be executed by more than one thread at a time.
- **Lock and Unlock:** The `lock.lock()` method is called before the critical section, and `lock.unlock()` is called in the `finally` block to ensure the lock is released even if an exception occurs.

By using `ReentrantLock`, you can have more control over the locking mechanism in your multi-threaded applications, ensuring thread safety and preventing data corruption or inconsistency.