package awesome.lld.design.patterns.registry;

/**
 * The EmailService class implements the Service interface for email services.
 */
public class EmailService implements Service {
    @Override
    public void execute() {
        System.out.println("Executing Email Service");
    }
}