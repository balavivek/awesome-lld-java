package awesome.lld.design.principles.lsp;

/**
 * The NotificationService class uses the Notification interface to send notifications.
 */
public class NotificationService {
    private Notification notification;

    /**
     * Constructs a new NotificationService.
     *
     * @param notification The Notification to use for sending notifications.
     */
    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    /**
     * Sends a notification.
     *
     * @param message The message to send.
     */
    public void sendNotification(String message) {
        notification.send(message);
    }
}