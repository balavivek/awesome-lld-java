package awesome.lld.design.patterns.singleton;

/**
 * The Logger class implements the Singleton pattern to manage logging.
 */
public class Logger {
    // The single instance of the class
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Initialize the logger
    }

    /**
     * Returns the single instance of the class.
     *
     * @return The single instance of Logger.
     */
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Logs a message.
     *
     * @param message The message to log.
     */
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}