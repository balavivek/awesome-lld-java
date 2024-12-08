package awesome.lld.fundamentals.concurrency.blockingqueue;


import java.time.LocalDateTime;

/**
 * The LogMessage class represents a log message with a timestamp and message content.
 */
public class LogMessage {
    private LocalDateTime timestamp;
    private String message;

    /**
     * Constructs a new LogMessage.
     *
     * @param message The content of the log message.
     */
    public LogMessage(String message) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + message;
    }
}
