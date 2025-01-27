package e.commerce.order;

import e.commerce.product.Category;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<OrderObserver> observers = new ArrayList<>();

    public void placeOrder(Order order) {
        System.out.println("Order placed: " + order.getOrderId());
        notifyObservers(order);
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Order order) {
        for (OrderObserver observer : observers) {
            observer.update(order);
        }
    }
}
