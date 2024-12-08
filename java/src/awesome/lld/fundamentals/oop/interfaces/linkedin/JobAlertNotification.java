package awesome.lld.fundamentals.oop.interfaces.linkedin;

/**
 * Implementation of a job alert notification.
 */
public class JobAlertNotification implements Notification {
    private String jobTitle;

    /**
     * Constructs a JobAlertNotification with the specified job title.
     *
     * @param jobTitle the title of the job
     */
    public JobAlertNotification(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Sends the job alert notification.
     */
    @Override
    public void send() {
        System.out.println("Sending job alert notification for: " + jobTitle);
    }
}
