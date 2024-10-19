### Introduction to Callable and Future in Java

The `Callable` and `Future` interfaces in Java provide a way to execute tasks asynchronously and retrieve their results. Unlike `Runnable`, `Callable` can return a result and throw a checked exception.

### Real-Time Scenario: Fetching Data from Multiple APIs

Let's consider a real-time scenario where an application needs to fetch data from multiple APIs concurrently. We'll use `Callable` to define tasks that fetch data and `Future` to retrieve the results.

#### DataFetcher Class

The `DataFetcher` class implements the `Callable` interface to define a task that fetches data from an API.

[DataFetcher.java](../../java/src/awesome/lld/java/concurrency/callablefuture/DataFetcher.java)


#### DataFetchApp Class

The `DataFetchApp` class demonstrates the usage of `Callable` and `Future` to fetch data from multiple APIs concurrently.

[DataFetchApp.java](../../java/src/awesome/lld/java/concurrency/callablefuture/DataFetchApp.java)

### Explanation

- **Callable\<T\>:** An interface similar to `Runnable`, but it can return a result and throw a checked exception.
- **Future\<T\>:** Represents the result of an asynchronous computation. Methods include `get()` to retrieve the result and `isDone()` to check if the task is completed.
- **ExecutorService.submit(Callable\<T\> task):** Submits a `Callable` task for execution and returns a `Future` representing the pending result.

### Key Concepts

- **Asynchronous Execution:** Tasks are executed concurrently, and results can be retrieved once they are available.
- **Result Retrieval:** Use `Future.get()` to retrieve the result of a `Callable` task.
- **Exception Handling:** `Callable` can throw checked exceptions, which can be handled when retrieving the result.

By using `Callable` and `Future`, you can execute tasks asynchronously and retrieve their results, making your applications more efficient and responsive.