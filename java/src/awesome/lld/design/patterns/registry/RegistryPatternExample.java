package awesome.lld.design.patterns.registry;

public class RegistryPatternExample {
    public static void main(String[] args) {
        // Register services
        ServiceRegistry.registerService("email", new EmailService());
        ServiceRegistry.registerService("sms", new SMSService());

        // Retrieve and execute services
        Service emailService = ServiceRegistry.getService("email");
        emailService.execute();

        Service smsService = ServiceRegistry.getService("sms");
        smsService.execute();
    }
}