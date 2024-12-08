package awesome.lld.design.principles.isp;

/**
 * The OnlineOrderProcessor interface extends OrderProcessor and adds methods specific to online orders.
 */
public interface OnlineOrderProcessor extends OrderProcessor {
    void processOnlinePayment();
}