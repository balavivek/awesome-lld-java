package awesome.lld.design.patterns.registry;

/**
 * The SMSService class implements the Service interface for SMS services.
 */
public class SMSService implements Service {
    @Override
    public void execute() {
        System.out.println("Executing SMS Service");
    }
}