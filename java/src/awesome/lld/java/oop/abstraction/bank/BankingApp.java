package awesome.lld.java.oop.abstraction.bank;

public class BankingApp {

    public static void main(String[] args) {

        // Create a new SavingsAccount object with account number "123456789", initial balance of 1000.0, and interest rate of 5.0
        SavingsAccount savingsAccount = new SavingsAccount("123456789", 1000.0, 5.0);

        // Print the account number of the savings account
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());

        // Print the initial balance of the savings account
        System.out.println("Initial Balance: " + savingsAccount.getBalance());

        // Deposit 500.0 into the savings account
        savingsAccount.deposit(500.0);

        // Print the balance after the deposit
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());

        // Withdraw 200.0 from the savings account
        savingsAccount.withdraw(200.0);

        // Print the balance after the withdrawal
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());

        // Add interest to the savings account balance
        savingsAccount.addInterest();
    }
}
