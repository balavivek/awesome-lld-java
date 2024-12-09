package awesome.lld.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The Subject interface defines methods for attaching, detaching, and notifying observers.
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(String message);
}