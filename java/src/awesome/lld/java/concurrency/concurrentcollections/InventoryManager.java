package awesome.lld.java.concurrency.concurrentcollections;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * The InventoryManager class manages the inventory of products using a ConcurrentHashMap.
 */
public class InventoryManager {
    private ConcurrentMap<String, Integer> inventory = new ConcurrentHashMap<>();

    /**
     * Adds a product to the inventory with the specified quantity.
     *
     * @param product The product to add.
     * @param quantity The quantity of the product.
     */
    public void addProduct(String product, int quantity) {
        inventory.put(product, quantity);
    }

    /**
     * Updates the quantity of the specified product.
     *
     * @param product The product to update.
     * @param quantity The new quantity of the product.
     */
    public void updateProductQuantity(String product, int quantity) {
        inventory.put(product, quantity);
    }

    /**
     * Retrieves the quantity of the specified product.
     *
     * @param product The product to retrieve.
     * @return The quantity of the product.
     */
    public int getProductQuantity(String product) {
        return inventory.getOrDefault(product, 0);
    }

    /**
     * Removes the specified product from the inventory.
     *
     * @param product The product to remove.
     */
    public void removeProduct(String product) {
        inventory.remove(product);
    }
}
