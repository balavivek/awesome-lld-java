package awesome.lld.java.concurrency.callablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * The DataFetchApp class demonstrates the usage of Callable and Future
 * to fetch data from multiple APIs concurrently.
 */
public class DataFetchApp {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // List of API URLs to fetch data from
        List<String> apiUrls = List.of("https://api1.example.com", "https://api2.example.com", "https://api3.example.com");

        // List to hold Future objects
        List<Future<String>> futures = new ArrayList<>();

        // Submit data fetching tasks to the executor
        for (String apiUrl : apiUrls) {
            Future<String> future = executorService.submit(new DataFetcher(apiUrl));
            futures.add(future);
        }

        // Retrieve and print the results
        for (Future<String> future : futures) {
            try {
                System.out.println(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Shut down the executor
        executorService.shutdown();
    }
}