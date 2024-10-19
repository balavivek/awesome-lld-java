package awesome.lld.java.concurrency.concurrentcollections;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventoryApp {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        // Create a fixed thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Add products to the inventory concurrently
        executorService.submit(() -> inventoryManager.addProduct("Product1", 100));
        executorService.submit(() -> inventoryManager.addProduct("Product2", 200));
        executorService.submit(() -> inventoryManager.addProduct("Product3", 300));

        // Update product quantities concurrently
        executorService.submit(() -> inventoryManager.updateProductQuantity("Product1", 150));
        executorService.submit(() -> inventoryManager.updateProductQuantity("Product2", 250));
        executorService.submit(() -> inventoryManager.updateProductQuantity("Product3", 350));

        // Retrieve and print product quantities concurrently
        executorService.submit(() -> System.out.println("Product1 Quantity: " + inventoryManager.getProductQuantity("Product1")));
        executorService.submit(() -> System.out.println("Product2 Quantity: " + inventoryManager.getProductQuantity("Product2")));
        executorService.submit(() -> System.out.println("Product3 Quantity: " + inventoryManager.getProductQuantity("Product3")));

        // Shut down the executor
        executorService.shutdown();
    }
}
