package adapter.client;

import adapter.adaptee.Adaptee;
import adapter.adapter.Adapter;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter target = new Adapter(adaptee);
        target.request();

    }
}
