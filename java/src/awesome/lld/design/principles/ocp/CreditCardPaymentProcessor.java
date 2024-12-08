package awesome.lld.design.principles.ocp;

/**
 * The CreditCardPaymentProcessor class implements the PaymentProcessor interface for credit card payments.
 */
public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}