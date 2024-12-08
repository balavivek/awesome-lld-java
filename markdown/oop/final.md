# BankingApp Documentation

This project demonstrates basic banking operations using a `BankAccount` class and constants defined in the `BankConstants` class.

## Examples

### 1. BankAccount Example

The `BankAccount` class represents a bank account with a final account number that cannot be changed once initialized. It also includes methods for depositing and withdrawing money.

**Code:**
- [BankAccount.java](../../java/src/awesome/lld/fundamentals/oop/finalkeyword/BankAccount.java)

### 2. BankConstants Example

The `BankConstants` class defines some final constants used in the application, such as the minimum balance and interest rate.

**Code:**
- [BankConstants.java](../../java/src/awesome/lld/fundamentals/oop/finalkeyword/BankConstants.java)

## How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Compile the Java files using your preferred IDE or command line.
4. Run the `BankingApp` class to see the banking operations in action.

## Key Concepts

- **Final Fields:** The `final` keyword is used to make the `accountNumber` field in the `BankAccount` class immutable.
- **Final Methods:** The `getAccountNumber` method in the `BankAccount` class is marked as `final` to prevent it from being overridden.
- **Constants:** The `BankConstants` class uses `final` to define constants that cannot be changed.
- **Final Classes:** The `BankConstants` class itself is marked as `final` to prevent inheritance.