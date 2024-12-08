package awesome.lld.fundamentals.concurrency.callablefuture;

import java.util.concurrent.Callable;

/**
 * The DataFetcher class represents a task that fetches data from an API.
 */
public class DataFetcher implements Callable<String> {
    private String apiUrl; // The URL of the API to fetch data from

    /**
     * Constructs a new DataFetcher.
     *
     * @param apiUrl The URL of the API to fetch data from.
     */
    public DataFetcher(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    /**
     * The call method is executed when the task is run.
     * It simulates fetching data from the API by sleeping for 2 seconds.
     *
     * @return A string representing the fetched data.
     * @throws Exception if the task is interrupted.
     */
    @Override
    public String call() throws Exception {
        // Simulate fetching data from the API
        Thread.sleep(2000);
        return "Data from " + apiUrl;
    }
}