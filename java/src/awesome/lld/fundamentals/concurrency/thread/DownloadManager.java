package awesome.lld.fundamentals.concurrency.thread;

/**
 * The DownloadManager class manages multiple file downloads using threads.
 */
public class DownloadManager {
    public static void main(String[] args) {
        String[] files = {"file1.txt", "file2.txt", "file3.txt"};

        for (String file : files) {
            Thread thread = new Thread(new FileDownloader(file));
            thread.start();
        }
    }
}
