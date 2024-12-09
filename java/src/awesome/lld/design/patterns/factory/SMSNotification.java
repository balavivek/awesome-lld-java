package awesome.lld.design.patterns.factory;

/**
 * The SMSNotification class implements the Notification interface for SMS notifications.
 */
public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}