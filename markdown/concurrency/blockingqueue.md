### Introduction to Blocking Queues in Java

Blocking Queues are part of the `java.util.concurrent` package and are designed to handle producer-consumer scenarios. They provide thread-safe operations for adding and removing elements, and can block the calling thread until the operation can be performed.

### Real-Time Scenario: Logging System

Let's consider a real-time scenario where we have a logging system that collects log messages from various parts of an application and processes them asynchronously. We'll use a `BlockingQueue` to manage the log messages.

#### LogMessage Class

The `LogMessage` class represents a log message with a timestamp and message content.

[LogMessage.java](../../java/src/awesome/lld/fundamentals/concurrency/blockingqueue/LogMessage.java)


#### Logger Class

The `Logger` class generates log messages and puts them into the `BlockingQueue`.

[Logger.java](../../java/src/awesome/lld/fundamentals/concurrency/blockingqueue/Logger.java)


#### LogProcessor Class

The `LogProcessor` class takes log messages from the `BlockingQueue` and processes them.

[LogProcessor.java](../../java/src/awesome/lld/fundamentals/concurrency/blockingqueue/LogProcessor.java)

#### LoggingApp Class

The `LoggingApp` class demonstrates the usage of `BlockingQueue` with logger and log processor threads.

[LoggingApp.java](../../java/src/awesome/lld/fundamentals/concurrency/blockingqueue/LoggingApp.java)

### Explanation

- **BlockingQueue\<E\>:** An interface that supports operations that wait for the queue to become non-empty when retrieving an element and wait for space to become available in the queue when storing an element.
- **ArrayBlockingQueue\<E\>:** A bounded blocking queue backed by an array.
- **put(E e):** Inserts the specified element into the queue, waiting if necessary for space to become available.
- **take():** Retrieves and removes the head of the queue, waiting if necessary until an element becomes available.

### Key Concepts

- **Producer-Consumer Pattern:** A common concurrency pattern where producers generate data and consumers process it.
- **Blocking Operations:** Operations that wait for certain conditions to be met before proceeding, ensuring proper synchronization between threads.

By using `BlockingQueue`, you can efficiently manage data exchange between producer and consumer threads, ensuring thread safety and proper synchronization.