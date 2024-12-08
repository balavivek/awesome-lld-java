package awesome.lld.design.principles.ocp;

/**
 * The PaymentService class uses the PaymentProcessor interface to process payments.
 */
public class PaymentService {
    private PaymentProcessor paymentProcessor;

    /**
     * Constructs a new PaymentService.
     *
     * @param paymentProcessor The PaymentProcessor to use for processing payments.
     */
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    /**
     * Processes a payment.
     *
     * @param amount The amount to process.
     */
    public void processPayment(double amount) {
        paymentProcessor.processPayment(amount);
    }
}