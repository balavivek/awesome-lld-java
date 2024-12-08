### Introduction to Open/Closed Principle (OCP)

The Open/Closed Principle (OCP) is one of the SOLID principles of object-oriented design. It states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. This means you should be able to add new functionality without changing existing code.

### Real-Time Scenario: Payment Processing System

Let's consider a real-time scenario where we have a payment processing system. We'll apply OCP to add new payment methods without modifying existing code.

#### PaymentProcessor Interface

The `PaymentProcessor` interface defines a method for processing payments.

[PaymentProcessor.java](../../../java/src/awesome/lld/design/principles/ocp/PaymentProcessor.java)


#### CreditCardPaymentProcessor Class

The `CreditCardPaymentProcessor` class implements the `PaymentProcessor` interface for credit card payments.

[CreditCardPaymentProcessor.java](../../../java/src/awesome/lld/design/principles/ocp/CreditCardPaymentProcessor.java)

#### PayPalPaymentProcessor Class

The `PayPalPaymentProcessor` class implements the `PaymentProcessor` interface for PayPal payments.

[PayPalPaymentProcessor.java](../../../java/src/awesome/lld/design/principles/ocp/PayPalPaymentProcessor.java)

#### PaymentService Class

The `PaymentService` class uses the `PaymentProcessor` interface to process payments.

[PaymentService.java](../../../java/src/awesome/lld/design/principles/ocp/PaymentService.java)

### Explanation

- **PaymentProcessor Interface:** Defines a contract for processing payments.
- **CreditCardPaymentProcessor Class:** Implements the `PaymentProcessor` interface for credit card payments.
- **PayPalPaymentProcessor Class:** Implements the `PaymentProcessor` interface for PayPal payments.
- **PaymentService Class:** Uses the `PaymentProcessor` interface to process payments.

By applying OCP, you can add new payment methods (e.g., `BitcoinPaymentProcessor`) without modifying existing code, making the system more maintainable and scalable.