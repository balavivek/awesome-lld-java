package awesome.lld.design.principles.ocp;

public class CreditCardClient {

    public static void main(String[] args) {

        // Create a PayPal Credit Card processor
        PaymentProcessor paymentProcessor = new CreditCardPaymentProcessor();

        // Create a payment service with the Credit Card processor
        PaymentService paymentService = new PaymentService(paymentProcessor);

        // Process a payment
        paymentProcessor.processPayment(50);

    }
}
