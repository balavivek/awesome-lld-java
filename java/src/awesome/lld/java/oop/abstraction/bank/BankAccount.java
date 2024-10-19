package awesome.lld.java.oop.abstraction.bank;

/**
 * The BankAccount class is an abstract class that serves as a blueprint for creating different types of bank accounts.
 * It encapsulates common properties and behaviors that all bank accounts share, such as account number, balance,
 * and basic operations like deposit and withdraw. This class is designed to be extended by more specific types of
 * bank accounts, such as savings accounts or checking accounts.
 */
public abstract class BankAccount {
    private String accountNumber; // Stores the unique identifier for the bank account
    private double balance; // Stores the current balance of the bank account

    /**
     * Initializes a new instance of the BankAccount class with the specified account number and balance.
     *
     * @param accountNumber The unique identifier for the bank account.
     * @param balance The initial balance of the bank account.
     */
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Retrieves the account number associated with the bank account.
     *
     * @return The account number of the bank account.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Retrieves the current balance of the bank account.
     *
     * @return The current balance of the bank account.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the bank account to the specified amount.
     *
     * @param amount The new balance to set for the bank account.
     */
    public void setBalance(double amount) {
        balance = amount;
    }

    /**
     * Adds the specified amount to the current balance of the bank account. The amount must be greater than zero.
     *
     * @param amount The amount to deposit into the bank account.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /**
     * Abstract method that must be implemented by subclasses to define how money is withdrawn from the bank account.
     * The implementation should handle the logic for checking if the withdrawal amount is valid and updating the balance accordingly.
     *
     * @param amount The amount to withdraw from the bank account.
     */
    public abstract void withdraw(double amount);
}