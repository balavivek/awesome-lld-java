package awesome.lld.design.patterns.observer;

/**
 * The EmailSubscriber class implements the Observer interface for email subscribers.
 */
public class EmailSubscriber implements Observer {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Email to " + email + ": " + message);
    }
}