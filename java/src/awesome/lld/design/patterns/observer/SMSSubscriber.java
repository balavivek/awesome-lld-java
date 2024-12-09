package awesome.lld.design.patterns.observer;

/**
 * The SMSSubscriber class implements the Observer interface for SMS subscribers.
 */
public class SMSSubscriber implements Observer {
    private String phoneNumber;

    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("SMS to " + phoneNumber + ": " + message);
    }
}