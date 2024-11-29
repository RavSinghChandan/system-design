package facade.subsystem;

public class InventorySystem {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for product: " + productId);
        // Simulate stock check (For simplicity, assuming product is in stock)
        return true;
    }

    public void updateStock(String productId, int quantity) {
        System.out.println("Updating stock for product: " + productId + " with quantity: " + quantity);
    }
}
