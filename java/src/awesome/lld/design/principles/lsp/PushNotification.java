package awesome.lld.design.principles.lsp;

/**
 * The PushNotification class implements the Notification interface for sending push notifications.
 */
public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}