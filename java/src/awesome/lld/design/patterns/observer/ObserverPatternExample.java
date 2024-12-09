package awesome.lld.design.patterns.observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();

        Observer emailSubscriber = new EmailSubscriber("example@example.com");
        Observer smsSubscriber = new SMSSubscriber("123-456-7890");

        newsPublisher.attach(emailSubscriber);
        newsPublisher.attach(smsSubscriber);

        newsPublisher.publishArticle("Observer Pattern in Java");
    }
}