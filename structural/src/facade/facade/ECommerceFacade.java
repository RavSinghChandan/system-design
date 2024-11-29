package facade.facade;

import facade.subsystem.InventorySystem;
import facade.subsystem.OrderSystem;
import facade.subsystem.PaymentSystem;

public class ECommerceFacade {

    private InventorySystem inventory;
    private PaymentSystem payment;
    private OrderSystem order;

    public ECommerceFacade() {
        this.inventory = new InventorySystem();
        this.payment = new PaymentSystem();
        this.order = new OrderSystem();
    }

    // Method to place an order
    public void placeOrder(String customerId, String productId, int quantity, String paymentMethod) {
        if (inventory.checkStock(productId)) {
            double totalAmount = quantity * 50.0; // Assuming product price is $50 each
            if (payment.processPayment(paymentMethod, totalAmount)) {
                String orderId = order.createOrder(customerId, productId, quantity);
                order.shipOrder(orderId);
                System.out.println("Order placed successfully! Order ID: " + orderId);
            } else {
                System.out.println("Payment failed! Order could not be processed.");
            }
        } else {
            System.out.println("Product out of stock!");
        }
    }
}
