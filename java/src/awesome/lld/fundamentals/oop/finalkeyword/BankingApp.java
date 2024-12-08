package awesome.lld.fundamentals.oop.finalkeyword;

public class BankingApp {

    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount account = new BankAccount("123456789", 500.0);

        // Print the account number and initial balance
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit money into the account
        account.deposit(200.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money from the account
        account.withdraw(150.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Print the minimum balance and interest rate constants
        System.out.println("Minimum Balance: " + BankConstants.MINIMUM_BALANCE);
        System.out.println("Interest Rate: " + BankConstants.INTEREST_RATE);
    }
}
