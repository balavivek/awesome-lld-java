package awesome.lld.design.principles.isp;

/**
 * The InStoreOrderProcessorImpl class implements the InStoreOrderProcessor interface for processing in-store orders.
 */
public class InStoreOrderProcessorImpl implements InStoreOrderProcessor {
    @Override
    public void processOrder() {
        System.out.println("Processing in-store order");
    }

    @Override
    public void processInStorePayment() {
        System.out.println("Processing in-store payment");
    }
}