### Introduction to Dependency Inversion Principle (DIP)

The Dependency Inversion Principle (DIP) is one of the SOLID principles of object-oriented design. It states that high-level modules should not depend on low-level modules. Both should depend on abstractions. Additionally, abstractions should not depend on details. Details should depend on abstractions.

### Real-Time Scenario: Payment Processing System

Let's consider a real-time scenario where we have a payment processing system. We'll apply DIP to ensure that the high-level payment service does not depend directly on low-level payment processors.

#### PaymentProcessor Interface

The `PaymentProcessor` interface defines a method for processing payments.

[PaymentProcessor.java](../../../java/src/awesome/lld/design/principles/dip/PaymentProcessor.java)


#### PayPalPaymentProcessor Class

The `PayPalPaymentProcessor` class implements the `PaymentProcessor` interface for processing PayPal payments.

[PayPalPaymentProcessor.java](../../../java/src/awesome/lld/design/principles/dip/PayPalPaymentProcessor.java)


#### CreditCardPaymentProcessor Class

The `CreditCardPaymentProcessor` class implements the `PaymentProcessor` interface for processing credit card payments.

[CreditCardPaymentProcessor.java](../../../java/src/awesome/lld/design/principles/dip/CreditCardPaymentProcessor.java)


#### PaymentService Class

The `PaymentService` class uses the `PaymentProcessor` interface to process payments.

[PaymentService.java](../../../java/src/awesome/lld/design/principles/dip/PaymentService.java)


### Explanation

- **PaymentProcessor Interface:** Defines a contract for processing payments.
- **PayPalPaymentProcessor Class:** Implements the `PaymentProcessor` interface for processing PayPal payments.
- **CreditCardPaymentProcessor Class:** Implements the `PaymentProcessor` interface for processing credit card payments.
- **PaymentService Class:** Uses the `PaymentProcessor` interface to process payments.

By applying DIP, the `PaymentService` class depends on the `PaymentProcessor` abstraction rather than concrete implementations. This makes the system more flexible and easier to extend with new payment processors.