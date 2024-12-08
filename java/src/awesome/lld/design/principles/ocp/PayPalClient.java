package awesome.lld.design.principles.ocp;

public class PayPalClient {

    public static void main(String[] args) {

        // Create a PayPal payment processor
        PaymentProcessor paymentProcessor = new PayPalPaymentProcessor();

        // Create a payment service with the PayPal processor
        PaymentService paymentService = new PaymentService(paymentProcessor);

        // Process a payment
        paymentService.processPayment(100);
    }
}
