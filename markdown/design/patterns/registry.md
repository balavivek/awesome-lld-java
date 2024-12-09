### Introduction to Registry Design Pattern

The Registry Design Pattern is used to store and retrieve instances of classes. It provides a global point of access to a set of instances, which can be useful for managing shared resources or services.

### Real-Time Scenario: Service Registry

Let's consider a real-time scenario where we need to manage different services in an application. We'll apply the Registry pattern to store and retrieve instances of these services.

#### Service Interface

The `Service` interface defines a common interface for all services.

[Service.java](../../../java/src/awesome/lld/design/patterns/registry/Service.java)


#### Concrete Service Classes

We will create two concrete classes, `EmailService` and `SMSService`, that implement the `Service` interface.

[EmailService.java](../../../java/src/awesome/lld/design/patterns/registry/EmailService.java)

[SMSService.java](../../../java/src/awesome/lld/design/patterns/registry/SMSService.java)

#### ServiceRegistry Class

The `ServiceRegistry` class will be used to register and retrieve instances of services.

[ServiceRegistry.java](../../../java/src/awesome/lld/design/patterns/registry/ServiceRegistry.java)


### Usage Example

Here's how you can use the `ServiceRegistry` to register and retrieve instances of services.

[RegistryPatternExample.java](../../../java/src/awesome/lld/design/patterns/registry/RegistryPatternExample.java)


### Explanation

- **Service Interface:** Defines a common interface for all services.
- **EmailService and SMSService Classes:** Implement the `Service` interface.
- **ServiceRegistry Class:** Provides methods to register and retrieve instances of services.
- **RegistryPatternExample Class:** Demonstrates the registration and retrieval of services using the `ServiceRegistry`.

By applying the Registry pattern, we can manage shared resources or services efficiently, making the code more modular and maintainable.