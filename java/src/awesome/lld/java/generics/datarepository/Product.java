package awesome.lld.java.generics.datarepository;


/**
 * The Product class represents a product entity.
 */
public class Product {
    private String productName;
    private double price;

    /**
     * Constructs a new Product.
     *
     * @param productName The name of the product.
     * @param price The price of the product.
     */
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{productName='" + productName + "', price=" + price + "}";
    }
}
