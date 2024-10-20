package awesome.lld.java.concurrency.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * The LogProcessor class takes log messages from the BlockingQueue and processes them.
 */
public class LogProcessor implements Runnable {
    private BlockingQueue<LogMessage> queue;

    /**
     * Constructs a new LogProcessor.
     *
     * @param queue The BlockingQueue to take log messages from.
     */
    public LogProcessor(BlockingQueue<LogMessage> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                LogMessage logMessage = queue.take(); // Take log message from the queue
                if ("END".equals(logMessage.getMessage())) {
                    break; // End of logging
                }
                System.out.println("Processing: " + logMessage);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}