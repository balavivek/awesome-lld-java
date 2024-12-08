package awesome.lld.fundamentals.concurrency.locks;


public class BankingApp {

    public static void main(String[] args) {
        // Create a new BankAccount with an initial balance of 1000.0
        BankAccount account = new BankAccount(1000.0);

        // Create threads to perform deposit and withdrawal transactions on the bank account
        Thread t1 = new Thread(new BankTransaction(account, true, 200.0)); // Deposit 200.0
        Thread t2 = new Thread(new BankTransaction(account, false, 150.0)); // Withdraw 150.0
        Thread t3 = new Thread(new BankTransaction(account, true, 300.0)); // Deposit 300.0
        Thread t4 = new Thread(new BankTransaction(account, false, 500.0)); // Withdraw 500.0

        // Start the threads to perform the transactions
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
