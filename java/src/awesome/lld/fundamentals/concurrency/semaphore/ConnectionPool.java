package awesome.lld.fundamentals.concurrency.semaphore;

import java.util.concurrent.Semaphore;
import java.util.ArrayList;
import java.util.List;

/**
 * The ConnectionPool class manages a pool of database connections using a Semaphore.
 */
public class ConnectionPool {
    private final Semaphore semaphore;
    private final List<DatabaseConnection> connections;

    /**
     * Constructs a new ConnectionPool.
     *
     * @param poolSize The number of connections in the pool.
     */
    public ConnectionPool(int poolSize) {
        semaphore = new Semaphore(poolSize);
        connections = new ArrayList<>();
        for (int i = 1; i <= poolSize; i++) {
            connections.add(new DatabaseConnection("Connection " + i));
        }
    }

    /**
     * Acquires a connection from the pool.
     *
     * @return A DatabaseConnection.
     * @throws InterruptedException If the current thread is interrupted.
     */
    public DatabaseConnection acquireConnection() throws InterruptedException {
        semaphore.acquire();
        synchronized (connections) {
            return connections.remove(0);
        }
    }

    /**
     * Releases a connection back to the pool.
     *
     * @param connection The DatabaseConnection to release.
     */
    public void releaseConnection(DatabaseConnection connection) {
        synchronized (connections) {
            connections.add(connection);
        }
        semaphore.release();
    }
}
