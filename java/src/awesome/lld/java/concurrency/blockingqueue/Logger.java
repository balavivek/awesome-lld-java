package awesome.lld.java.concurrency.blockingqueue;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
     * The Logger class generates log messages and puts them into the BlockingQueue.
     */
public class Logger implements Runnable {
    private BlockingQueue<LogMessage> queue;

    /**
     * Constructs a new Logger.
     *
     * @param queue The BlockingQueue to put log messages into.
     */
    public Logger(BlockingQueue<LogMessage> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                LogMessage logMessage = new LogMessage("Log message " + i);
                System.out.println("Logging: " + logMessage);
                queue.put(logMessage); // Put log message into the queue
                TimeUnit.SECONDS.sleep(1); // Simulate time taken to generate log message
            }
            queue.put(new LogMessage("END")); // Indicate end of logging
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
