package awesome.lld.design.principles.lsp;

/**
 * The EmailNotification class implements the Notification interface for sending email notifications.
 */
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email notification: " + message);
    }
}