package facade.subsystem;

public class OrderSystem {
    public String createOrder(String customerId, String productId, int quantity) {
        System.out.println("Creating order for customer: " + customerId + ", product: " + productId + ", quantity: " + quantity);
        // Simulate order creation (Return a dummy order ID)
        return "ORD12345";
    }

    public void shipOrder(String orderId) {
        System.out.println("Shipping order with ID: " + orderId);
    }
}
