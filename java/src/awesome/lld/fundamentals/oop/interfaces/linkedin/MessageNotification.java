package awesome.lld.fundamentals.oop.interfaces.linkedin;

/**
 * Implementation of a message notification.
 */
public class MessageNotification implements Notification {
    private String message;

    /**
     * Constructs a MessageNotification with the specified message.
     *
     * @param message the message to be sent
     */
    public MessageNotification(String message) {
        this.message = message;
    }

    /**
     * Sends the message notification.
     */
    @Override
    public void send() {
        System.out.println("Sending message notification: " + message);
    }
}
