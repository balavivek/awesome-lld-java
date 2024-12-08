### Introduction to Single Responsibility Principle (SRP)

The Single Responsibility Principle (SRP) is one of the SOLID principles of object-oriented design. It states that a class should have only one reason to change, meaning it should have only one job or responsibility.

### Real-Time Scenario: User Management System

Let's consider a real-time scenario where we have a user management system. We'll apply SRP to separate the responsibilities of user data handling and user authentication.

#### User Class

The `User` class represents a user entity with basic user information.

[User.java](../../../java/src/awesome/lld/design/principles/srp/User.java)

[UserRepository.java](../../../java/src/awesome/lld/design/principles/srp/UserRepository.java)

#### UserAuthenticator Class

The `UserAuthenticator` class handles user authentication.

[UserAuthenticator.java](../../../java/src/awesome/lld/design/principles/srp/UserAuthenticator.java)

### Explanation

- **User Class:** Represents the user entity and holds user information.
- **UserRepository Class:** Manages user data storage and retrieval.
- **UserAuthenticator Class:** Handles user authentication.

By applying SRP, each class has a single responsibility, making the code easier to maintain and extend.