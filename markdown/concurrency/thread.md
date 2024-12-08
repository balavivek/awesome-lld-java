# Threads in Java Documentation

This project demonstrates the creation and usage of threads in Java using both the `Thread` class and the `Runnable` interface. It also includes a real-time example of downloading files using multiple threads.

## Examples

### 1. MyThread Example

The `MyThread` class extends the `Thread` class to create a new thread.

**Code:**
- [MyThread.java](../../java/src/awesome/lld/fundamentals/concurrency/thread/MyThread.java)

### 2. MyRunnable Example

The `MyRunnable` class implements the `Runnable` interface to create a new thread.

**Code:**
- [MyRunnable.java](../../java/src/awesome/lld/fundamentals/concurrency/thread/MyRunnable.java)

### 3. FileDownloader Example

The `FileDownloader` class simulates downloading a file using a thread.

**Code:**
- [FileDownloader.java](../../java/src/awesome/lld/fundamentals/concurrency/thread/FileDownloader.java)

### 4. DownloadManager Example

The `DownloadManager` class manages multiple file downloads using threads.

**Code:**
- [DownloadManager.java](../../java/src/awesome/lld/fundamentals/concurrency/thread/DownloadManager.java)

## How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Compile the Java files using your preferred IDE or command line.
4. Run the `DownloadManager` class to see the file download simulation in action.

## Key Concepts

- **Concurrency:** Multiple threads run simultaneously, improving performance.
- **Thread Lifecycle:** A thread goes through various states like New, Runnable, Running, Blocked, and Terminated.
- **Synchronization:** Ensures that multiple threads can access shared resources without conflicts.

By using threads, you can perform multiple tasks concurrently, making your applications more efficient and responsive.