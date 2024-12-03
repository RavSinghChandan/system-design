package proxy.client;

import proxy.proxy.Proxy;
import proxy.subject.Subject;

public class Client {
    public static void main(String[] args) {
        // Creating proxy object
        Subject proxy = new Proxy();

        // Client interacts with proxy
        proxy.request();
    }
}
