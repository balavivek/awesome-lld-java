package awesome.lld.design.patterns.factory;

/**
 * The PushNotification class implements the Notification interface for push notifications.
 */
public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push notification");
    }
}