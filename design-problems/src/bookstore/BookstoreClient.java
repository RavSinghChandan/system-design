package bookstore;


import bookstore.book.Book;
import bookstore.book.BookBuilder;
import bookstore.inventory.InventoryItem;
import bookstore.inventory.InventoryService;
import bookstore.notification.NotificationFacade;
import bookstore.order.Order;
import bookstore.order.OrderService;
import bookstore.payment.Payment;
import bookstore.payment.PaymentService;
import bookstore.user.Admin;
import bookstore.user.Customer;
import bookstore.user.User;

public class BookstoreClient {

    public static void main(String[] args) {

        // User Services
        User admin = new Admin("admin1", "admin@bookstore.com");
        User customer = new Customer("customer1", "customer@bookstore.com");
        admin.displayRole();
        customer.displayRole();

        // Book Services
        Book book = new BookBuilder().setTitle("Effective Java").setAuthor("Joshua Bloch").setPrice(45.99).build();
        book.displayInfo();
        // Order Services
        Order order = new Order(1,"Chandan Kumar","Customer");
        OrderService orderService = new OrderService();
        orderService.placeOrder(order);

        // Payment Services
        Payment payment = new Payment(22.0);
        PaymentService paymentService = new PaymentService();
        paymentService.makePayment(payment);

        // Inventory Services
        InventoryItem inventoryItem = new InventoryItem("Book1",10);
        InventoryService inventoryService = new InventoryService();
        inventoryService.addItem(inventoryItem);

        // Notification Services
        NotificationFacade notificationFacade = new NotificationFacade();
        notificationFacade.sendAll();

        System.out.println("Bookstore system executed successfully!");

    }
}