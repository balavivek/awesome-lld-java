### Introduction to Interface Segregation Principle (ISP)

The Interface Segregation Principle (ISP) is one of the SOLID principles of object-oriented design. It states that no client should be forced to depend on methods it does not use. In other words, it's better to have multiple specific interfaces rather than a single general-purpose interface.

### Real-Time Scenario: E-commerce Order Processing System

Let's consider a real-time scenario where we have an e-commerce order processing system. We'll apply ISP to ensure that different types of order processing can be handled by specific interfaces without forcing clients to implement methods they don't need.

#### OrderProcessor Interface

The `OrderProcessor` interface defines methods for processing orders.

[OrderProcessor.java](../../../java/src/awesome/lld/design/principles/isp/OrderProcessor.java)


#### OnlineOrderProcessor Interface

The `OnlineOrderProcessor` interface extends `OrderProcessor` and adds methods specific to online orders.

[OnlineOrderProcessor.java](../../../java/src/awesome/lld/design/principles/isp/OnlineOrderProcessor.java)


#### InStoreOrderProcessor Interface

The `InStoreOrderProcessor` interface extends `OrderProcessor` and adds methods specific to in-store orders.

[InStoreOrderProcessor.java](../../../java/src/awesome/lld/design/principles/isp/InStoreOrderProcessor.java)


#### OnlineOrderProcessorImpl Class

The `OnlineOrderProcessorImpl` class implements the `OnlineOrderProcessor` interface for processing online orders.

[OnlineOrderProcessorImpl.java](../../../java/src/awesome/lld/design/principles/isp/OnlineOrderProcessorImpl.java)


#### InStoreOrderProcessorImpl Class

The `InStoreOrderProcessorImpl` class implements the `InStoreOrderProcessor` interface for processing in-store orders.

[InStoreOrderProcessorImpl.java](../../../java/src/awesome/lld/design/principles/isp/InStoreOrderProcessorImpl.java)


### Explanation

- **OrderProcessor Interface:** Defines a general contract for processing orders.
- **OnlineOrderProcessor Interface:** Extends `OrderProcessor` and adds methods specific to online orders.
- **InStoreOrderProcessor Interface:** Extends `OrderProcessor` and adds methods specific to in-store orders.
- **OnlineOrderProcessorImpl Class:** Implements the `OnlineOrderProcessor` interface for processing online orders.
- **InStoreOrderProcessorImpl Class:** Implements the `InStoreOrderProcessor` interface for processing in-store orders.

By applying ISP, we ensure that clients only depend on the methods they need, making the system more modular and easier to maintain.