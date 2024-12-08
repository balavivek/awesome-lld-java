package awesome.lld.design.principles.dip;

/**
 * The CreditCardPaymentProcessor class implements the PaymentProcessor interface for processing credit card payments.
 */
public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}