package awesome.lld.design.principles.lsp;

/**
 * The SMSNotification class implements the Notification interface for sending SMS notifications.
 */
public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}