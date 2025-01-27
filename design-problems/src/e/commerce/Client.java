package e.commerce;

import e.commerce.inventory.InventoryItem;
import e.commerce.inventory.InventoryService;
import e.commerce.notification.NotificationFacade;
import e.commerce.payment.Payment;
import e.commerce.payment.PaymentGateway;
import e.commerce.product.Product;
import e.commerce.user.User;
import e.commerce.user.UserFactory;

public class Client {
    public static void main(String[] args) {

        // User Management
        User admin = UserFactory.createUser("admin", "Rav Singh", "admin@aurawithrav.com");
        User customer = UserFactory.createUser("customer", "Mohan Singh", "mohan@gmail.com");

        admin.showDetails();
        customer.showDetails();

        // Product Management
        Product product = new Product.ProductBuilder()
                .setName("palm-reading")
                .setCategory("astrology")
                .setPrice(1000.0)
                .build();
        System.out.println("Product: " + product.getName() + ", Price: Rs. " + product.getPrice());

        // Inventory
        InventoryService inventoryService = new InventoryService();
        inventoryService.addItem(new InventoryItem("palm-reading", 10));

        // Payment
        Payment payment = new Payment("Pay Rs.", 1000.0);
        PaymentGateway gateway = new PaymentGateway();
        gateway.makePayment(payment);

        // Notifications
        NotificationFacade notification = new NotificationFacade();
        notification.sendEmail("Order placed successfully!");
        notification.sendSMS("Your order has been shipped (pdf file of complete Astrological chart  ).");
    }

}
