package awesome.lld.java.concurrency.semaphore;


public class ConnectionPoolApp {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool(3);

        Runnable task = () -> {
            try {
                DatabaseConnection connection = pool.acquireConnection();
                connection.connect();
                Thread.sleep(2000); // Simulate database operation
                connection.disconnect();
                pool.releaseConnection(connection);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Create and start multiple threads to simulate concurrent access
        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }
    }
}
