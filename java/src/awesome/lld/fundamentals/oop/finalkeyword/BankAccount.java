package awesome.lld.fundamentals.oop.finalkeyword;

/**
 * The BankAccount class represents a bank account with a final account number.
 */
public class BankAccount {
    private final String accountNumber; // Final account number
    private double balance;

    /**
     * Initializes a new instance of the BankAccount class with the specified account number and initial balance.
     *
     * @param accountNumber The account number of the bank account.
     * @param initialBalance The initial balance of the bank account.
     */
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    /**
     * Retrieves the account number of the bank account.
     *
     * @return The account number of the bank account.
     */
    public final String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Retrieves the balance of the bank account.
     *
     * @return The balance of the bank account.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposits the specified amount into the bank account.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /**
     * Withdraws the specified amount from the bank account.
     *
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
