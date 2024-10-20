package awesome.lld.java.concurrency.semaphore;

/**
 * The DatabaseConnection class represents a database connection.
 */
public class DatabaseConnection {
    private String connectionName;

    /**
     * Constructs a new DatabaseConnection.
     *
     * @param connectionName The name of the connection.
     */
    public DatabaseConnection(String connectionName) {
        this.connectionName = connectionName;
    }

    public String getConnectionName() {
        return connectionName;
    }

    public void connect() {
        System.out.println(connectionName + " connected.");
    }

    public void disconnect() {
        System.out.println(connectionName + " disconnected.");
    }
}
