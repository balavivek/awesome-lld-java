package awesome.lld.java.concurrency.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class LoggingApp {
    public static void main(String[] args) {
        // Create a BlockingQueue with a capacity of 5
        BlockingQueue<LogMessage> queue = new ArrayBlockingQueue<>(5);

        // Create logger and log processor threads
        Thread loggerThread = new Thread(new Logger(queue));
        Thread logProcessorThread = new Thread(new LogProcessor(queue));

        // Start the threads
        loggerThread.start();
        logProcessorThread.start();

        // Wait for the threads to finish
        try {
            loggerThread.join();
            logProcessorThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}