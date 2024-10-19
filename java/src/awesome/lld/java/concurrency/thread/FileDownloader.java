package awesome.lld.java.concurrency.thread;

/**
 * The FileDownloader class simulates downloading a file.
 */
public class FileDownloader implements Runnable {
    private String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Starting download: " + fileName);
        try {
            Thread.sleep(3000); // Simulate time taken to download
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed download: " + fileName);
    }
}
