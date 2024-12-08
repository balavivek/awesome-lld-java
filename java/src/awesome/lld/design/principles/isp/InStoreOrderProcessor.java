package awesome.lld.design.principles.isp;

/**
 * The InStoreOrderProcessor interface extends OrderProcessor and adds methods specific to in-store orders.
 */
public interface InStoreOrderProcessor extends OrderProcessor {
    void processInStorePayment();
}