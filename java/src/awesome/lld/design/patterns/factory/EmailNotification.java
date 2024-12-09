package awesome.lld.design.patterns.factory;

/**
 * The EmailNotification class implements the Notification interface for email notifications.
 */
public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification");
    }
}