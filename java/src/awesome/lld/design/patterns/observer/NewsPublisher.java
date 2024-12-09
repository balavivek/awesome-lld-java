package awesome.lld.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The NewsPublisher class implements the Subject interface and manages a list of observers.
 */
public class NewsPublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void publishArticle(String article) {
        notifyObservers("New article published: " + article);
    }
}