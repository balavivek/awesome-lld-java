package awesome.lld.fundamentals.oop.interfaces.linkedin;

/**
 * Implementation of a connection request notification.
 */
public class ConnectionRequestNotification implements Notification {
    private String requesterName;

    /**
     * Constructs a ConnectionRequestNotification with the specified requester name.
     *
     * @param requesterName the name of the person sending the connection request
     */
    public ConnectionRequestNotification(String requesterName) {
        this.requesterName = requesterName;
    }

    /**
     * Sends the connection request notification.
     */
    @Override
    public void send() {
        System.out.println("Sending connection request notification from: " + requesterName);
    }
}
