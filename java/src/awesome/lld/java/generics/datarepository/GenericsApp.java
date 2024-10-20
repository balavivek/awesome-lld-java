package awesome.lld.java.generics.datarepository;


public class GenericsApp {

    public static void main(String[] args) {
        // Create a DataRepository for User objects
        DataRepository<User> userRepository = new DataRepository<>();
        userRepository.addData(new User("Alice", 30));
        userRepository.addData(new User("Bob", 25));

        // Retrieve and print all users
        System.out.println("Users:");
        for (User user : userRepository.getAllData()) {
            System.out.println(user);
        }

        // Create a DataRepository for Product objects
        DataRepository<Product> productRepository = new DataRepository<>();
        productRepository.addData(new Product("Laptop", 999.99));
        productRepository.addData(new Product("Smartphone", 699.99));

        // Retrieve and print all products
        System.out.println("Products:");
        for (Product product : productRepository.getAllData()) {
            System.out.println(product);
        }
    }
}
