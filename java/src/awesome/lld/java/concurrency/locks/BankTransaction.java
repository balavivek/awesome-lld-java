package awesome.lld.java.concurrency.locks;

/**
 * The BankTransaction class performs deposit and withdrawal operations on a BankAccount.
 * This class implements the Runnable interface to allow its instances to be executed by a thread.
 */
public class BankTransaction implements Runnable {
    private BankAccount account; // The bank account on which the transaction will be performed
    private boolean deposit; // Flag to indicate if the transaction is a deposit (true) or a withdrawal (false)
    private double amount; // The amount of money to deposit or withdraw

    /**
     * Constructs a new BankTransaction.
     *
     * @param account The bank account on which the transaction will be performed.
     * @param deposit True if the transaction is a deposit, false if it is a withdrawal.
     * @param amount The amount of money to deposit or withdraw.
     */
    public BankTransaction(BankAccount account, boolean deposit, double amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    /**
     * The run method is executed when the thread is started.
     * It performs the deposit or withdrawal operation on the bank account.
     */
    @Override
    public void run() {
        if (deposit) {
            account.deposit(amount); // Perform deposit
        } else {
            account.withdraw(amount); // Perform withdrawal
        }
    }
}