package awesome.lld.design.patterns.factory;

public class FactoryPatternExample {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification emailNotification = factory.createNotification("EMAIL");
        emailNotification.notifyUser();

        Notification smsNotification = factory.createNotification("SMS");
        smsNotification.notifyUser();

        Notification pushNotification = factory.createNotification("PUSH");
        pushNotification.notifyUser();
    }
}