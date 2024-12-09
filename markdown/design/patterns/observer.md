### Introduction to Behavioral Design Patterns

Behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects. They help in defining how objects interact and communicate with each other.

### Real-Time Scenario: Observer Pattern

Let's consider a real-time scenario where we need to implement a notification system that updates subscribers when a new article is published. We'll apply the Observer pattern to achieve this.

#### Observer Interface

The `Observer` interface defines a method for updating subscribers.

[Observer.java](../../../java/src/awesome/lld/design/patterns/observer/Observer.java)


#### Concrete Observer Classes

We will create two concrete classes, `EmailSubscriber` and `SMSSubscriber`, that implement the `Observer` interface.

[EmailSubscriber.java](../../../java/src/awesome/lld/design/patterns/observer/EmailSubscriber.java)


[SMSSubscriber.java](../../../java/src/awesome/lld/design/patterns/observer/SMSSubscriber.java)



#### Subject Interface

The `Subject` interface defines methods for attaching, detaching, and notifying observers.


[Subject.java](../../../java/src/awesome/lld/design/patterns/observer/Subject.java)

#### Concrete Subject Class

The `NewsPublisher` class implements the `Subject` interface and manages a list of observers.

[NewsPublisher.java](../../../java/src/awesome/lld/design/patterns/observer/NewsPublisher.java)



### Usage Example

Here's how you can use the `NewsPublisher` to notify subscribers when a new article is published.

[ObserverPatternExample.java](../../../java/src/awesome/lld/design/patterns/observer/ObserverPatternExample.java)


### Explanation

- **Observer Interface:** Defines the `update` method for updating subscribers.
- **EmailSubscriber and SMSSubscriber Classes:** Implement the `Observer` interface.
- **Subject Interface:** Defines methods for attaching, detaching, and notifying observers.
- **NewsPublisher Class:** Manages a list of observers and notifies them when a new article is published.
- **ObserverPatternExample Class:** Demonstrates the usage of the Observer pattern to notify subscribers.

By applying the Observer pattern, we can create a flexible and scalable notification system, making the code easier to maintain and extend.