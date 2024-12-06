package cor;

import cor.concreteHandler.ConcreteHandler1;
import cor.concreteHandler.ConcreteHandler2;
import cor.handler.Handler;

public class Client {
    public static void main(String[] args) {
        // Create handlers
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        // Set up the chain
        handler1.setNext(handler2);

        // Client sends requests
        System.out.println("Sending 'Type1' request:");
        handler1.handleRequest("Type1");

        System.out.println("\nSending 'Type2' request:");
        handler1.handleRequest("Type2");

        System.out.println("\nSending 'Unknown' request:");
        handler1.handleRequest("Unknown");
    }
}
