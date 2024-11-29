package facade.client;

import facade.facade.ECommerceFacade;

public class Client {
    public static void main(String[] args) {
        ECommerceFacade ecommerce = new ECommerceFacade();

        // Customer placing an order
        ecommerce.placeOrder("CUST001", "PROD1001", 2, "CreditCard");
    }

}
