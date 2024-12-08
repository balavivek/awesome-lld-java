package awesome.lld.design.principles.isp;

/**
 * The OnlineOrderProcessorImpl class implements the OnlineOrderProcessor interface for processing online orders.
 */
public class OnlineOrderProcessorImpl implements OnlineOrderProcessor {
    @Override
    public void processOrder() {
        System.out.println("Processing online order");
    }

    @Override
    public void processOnlinePayment() {
        System.out.println("Processing online payment");
    }
}