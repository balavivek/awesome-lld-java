package awesome.lld.design.principles.dip;

/**
 * The PayPalPaymentProcessor class implements the PaymentProcessor interface for processing PayPal payments.
 */
public class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}