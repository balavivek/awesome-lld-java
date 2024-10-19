package awesome.lld.java.oop.abstraction.bank;

/**
 * The SavingsAccount class represents a specific type of bank account that accrues interest.
 * It extends the BankAccount class and provides implementations for withdrawing money and adding interest.
 */
public class SavingsAccount extends BankAccount {
    private double interestRate; // The interest rate for the savings account

    /**
     * Initializes a new instance of the SavingsAccount class with the specified account number, balance, and interest rate.
     *
     * @param accountNumber The unique identifier for the bank account.
     * @param balance The initial balance of the bank account.
     * @param interestRate The interest rate for the savings account.
     */
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    /**
     * Withdraws the specified amount from the savings account if the amount is valid and sufficient balance is available.
     *
     * @param amount The amount to withdraw from the bank account.
     */
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
            System.out.println("Withdrawing " + amount + ". New balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    /**
     * Adds interest to the current balance of the savings account based on the interest rate.
     */
    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added. New balance: " + getBalance());
    }
}