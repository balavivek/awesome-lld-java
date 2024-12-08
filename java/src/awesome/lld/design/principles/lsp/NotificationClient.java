package awesome.lld.design.principles.lsp;

public class NotificationClient {

    public static void main(String[] args) {

        NotificationService emailNotification = new NotificationService(new EmailNotification());
        emailNotification.sendNotification("Email Sent ! ");

        NotificationService pushNotification = new NotificationService(new PushNotification());
        pushNotification.sendNotification("Push Sent ! ");

        NotificationService smsNotification = new NotificationService(new SMSNotification());
        smsNotification.sendNotification("SMS Sent ! ");

    }
}
