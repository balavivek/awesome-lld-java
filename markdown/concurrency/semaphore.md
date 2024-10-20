### Introduction to Semaphores in Java

Semaphores are part of the `java.util.concurrent` package and are used to control access to a shared resource by multiple threads. They can be used to implement various synchronization policies, such as limiting the number of threads that can access a resource simultaneously.

### Real-Time Scenario: Database Connection Pool

Let's consider a real-time scenario where we have a database connection pool that limits the number of concurrent connections to a database. We'll use a `Semaphore` to manage the pool.

#### DatabaseConnection Class

The `DatabaseConnection` class represents a database connection.

[DatabaseConnection.java](src/concurrency/semaphore/DatabaseConnection.java)



#### ConnectionPool Class

The `ConnectionPool` class manages a pool of database connections using a `Semaphore`.

[ConnectionPool.java](src/concurrency/semaphore/ConnectionPool.java)



#### ConnectionPoolApp Class

The `ConnectionPoolApp` class demonstrates the usage of `Semaphore` to manage a database connection pool.

[ConnectionPoolApp.java](src/concurrency/semaphore/Connection

### Explanation

- **Semaphore:** A synchronization aid that restricts the number of threads that can access a resource.
- **acquire():** Acquires a permit from the semaphore, blocking if necessary until one is available.
- **release():** Releases a permit, returning it to the semaphore.

### Key Concepts

- **Resource Limiting:** Semaphores can limit the number of threads accessing a resource.
- **Thread Safety:** Ensures that shared resources are accessed in a thread-safe manner.

By using `Semaphore`, you can efficiently manage access to shared resources, ensuring thread safety and proper synchronization.