# Interface Examples in Java

This project demonstrates the usage of interfaces in Java through two examples: `StackExample` and `NotificationExample`. These examples illustrate how interfaces can be used to define contracts that different classes can implement, promoting loose coupling and flexibility in your code.

## Examples

### 1. Stack Example

The `StackExample` demonstrates the implementation of a stack using two different data structures: an array and a linked list. Both implementations adhere to the `Stack` interface, which defines the basic operations of a stack.

- **ArrayStack:** Implements the stack using an array.
- **LinkedListStack:** Implements the stack using a linked list.

**Code:**
- [StackExample.java](java/src/awesome/lld/java/oop/interfaces/stack/StackExample.java)

### 2. Notification Example

The `NotificationExample` demonstrates a real-time scenario related to LinkedIn social media, where different types of notifications (e.g., message notifications, connection requests, and job alerts) are implemented using the `Notification` interface.

- **MessageNotification:** Sends a message notification.
- **ConnectionRequestNotification:** Sends a connection request notification.
- **JobAlertNotification:** Sends a job alert notification.

**Code:**
- [NotificationExample.java](java/src/awesome/lld/java/oop/interfaces/linkedin/NotificationExample.java)

## How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Compile the Java files using your preferred IDE or command line.
4. Run the `StackExample` and `NotificationExample` classes to see the interface implementations in action.

## Key Concepts

- **Interfaces:** Define a contract that implementing classes must follow.
- **Loose Coupling:** Changes to the implementation of a class won't affect other classes as long as they adhere to the interface contract.
- **Abstraction:** Interfaces provide a level of abstraction by defining a common set of methods that different classes can implement in their own unique ways.