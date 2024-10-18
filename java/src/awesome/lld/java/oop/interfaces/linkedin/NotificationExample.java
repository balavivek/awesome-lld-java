package awesome.lld.java.oop.interfaces.linkedin;

/**
 * Main class to demonstrate the usage of different notification implementations.
 */
public class NotificationExample {
    public static void main(String[] args) {
        // Create and send a message notification
        Notification messageNotification = new MessageNotification("You have a new message from John.");
        messageNotification.send();

        // Create and send a connection request notification
        Notification connectionRequestNotification = new ConnectionRequestNotification("Jane Doe");
        connectionRequestNotification.send();

        // Create and send a job alert notification
        Notification jobAlertNotification = new JobAlertNotification("Software Engineer at LinkedIn");
        jobAlertNotification.send();
    }
}
