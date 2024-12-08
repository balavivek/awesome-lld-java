package awesome.lld.fundamentals.concurrency.synchronization;

/**
 * The BankAccount class represents a bank account with synchronized methods.
 */
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * Synchronized method to deposit money into the account.
     *
     * @param amount The amount to deposit.
     */
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    /**
     * Synchronized method to withdraw money from the account.
     *
     * @param amount The amount to withdraw.
     */
    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw: " + amount);
        }
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }
}