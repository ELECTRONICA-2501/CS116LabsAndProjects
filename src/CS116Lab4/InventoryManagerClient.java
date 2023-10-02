package CS116Lab4;

public class InventoryManagerClient {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager(10);

        // Adding sample products
        manager.addProduct(new Product(101, "Laptop", 899.99, 5));
        manager.addProduct(new Product(102, "Smartphone", 499.99, 10));
        manager.addProduct(new Product(103, "Tablet", 299.99, 8));

        // Display all products
        System.out.println("All Products:");
        manager.displayProducts();

        // Search for a product by ID
        int searchId = 102;
        int foundIndex = manager.binarySearch(searchId);
        if (foundIndex != -1) {
            System.out.println("Product found: " + manager.findProduct(searchId));
        } else {
            System.out.println("Product with ID " + searchId + " not found.");
        }
    }
}
