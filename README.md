# Awesome LLD Java

Awesome LLD Java is a comprehensive library/framework designed to simplify low-level design (LLD) concepts in Java development. 
This project aims to provide developers with essential tools, patterns, and utilities that enhance the implementation of robust, scalable, and maintainable Java applications. 
By leveraging proven design patterns and best practices, Awesome LLD Java empowers developers to create clean, efficient, and high-quality code while reducing complexity and improving productivity.

**Key Features:**
- **Design Patterns Repository:** A curated collection of common design patterns (e.g., Singleton, Factory, Observer) with practical Java implementations.
- **Modular Architecture:** An extensible structure that encourages modular design, making it easy to integrate with existing projects.
- **Documentation and Examples:** Comprehensive documentation with real-world examples to help developers understand and apply LLD concepts effectively.
- **Code Quality Tools:** Built-in utilities to enforce coding standards, ensuring high code quality and maintainability.
- **Community Contributions:** An open-source approach that invites contributions, fostering collaboration and continuous improvement.

**Target Audience:**
This project is aimed at Java developers ranging from beginners to experienced professionals who are looking to deepen their understanding of low-level design principles and improve their software development practices.

Beginners can start with below topics to learn about basics and practical implementations in Java.

- [Access Modifiers](java/src/awesome/lld/java/oop/accessmodifiers/AccessModifiersExamples.java)
- [Constructors](java/src/awesome/lld/java/oop/constructors/ConstructorsExample.java)
- [Inheritance](java/src/awesome/lld/java/oop/inheritance/InheritanceExamples.java)

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



## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE.md) file for details.