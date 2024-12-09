### Introduction to Factory Design Pattern

The Factory Design Pattern is used to create objects without specifying the exact class of object that will be created. It provides a way to encapsulate the instantiation logic and makes the code more modular and scalable.

### Real-Time Scenario: Notification System

Let's consider a real-time scenario where we need to send different types of notifications (e.g., Email, SMS, Push). We'll apply the Factory pattern to create instances of different notification types.

#### Notification Interface

The `Notification` interface defines a common interface for all notifications.

[Notification.java](../../../java/src/awesome/lld/design/patterns/factory/Notification.java)


#### Concrete Notification Classes

We will create three concrete classes, `EmailNotification`, `SMSNotification`, and `PushNotification`, that implement the `Notification` interface.

[EmailNotification.java](../../../java/src/awesome/lld/design/patterns/factory/EmailNotification.java)

[SMSNotification.java](../../../java/src/awesome/lld/design/patterns/factory/SMSNotification.java)

[PushNotification.java](../../../java/src/awesome/lld/design/patterns/factory/PushNotification.java)



#### NotificationFactory Class

The `NotificationFactory` class will be used to create instances of different notification types based on the input.

[NotificationFactory.java](../../../java/src/awesome/lld/design/patterns/factory/NotificationFactory.java)



### Usage Example

Here's how you can use the `NotificationFactory` to create and send different types of notifications.

[FactoryPatternExample.java](../../../java/src/awesome/lld/design/patterns/factory/FactoryPatternExample.java)

### Explanation

- **Notification Interface:** Defines a common interface for all notifications.
- **EmailNotification, SMSNotification, and PushNotification Classes:** Implement the `Notification` interface.
- **NotificationFactory Class:** Provides a method to create instances of different notification types based on the input.
- **FactoryPatternExample Class:** Demonstrates the creation and usage of different notification types using the `NotificationFactory`.

By applying the Factory pattern, we can create objects in a more flexible and scalable way, making the code easier to maintain and extend.