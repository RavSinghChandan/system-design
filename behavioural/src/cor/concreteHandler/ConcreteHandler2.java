package cor.concreteHandler;

import cor.handler.Handler;

public class ConcreteHandler2 implements Handler {

    private Handler nextHandler;

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if ("Type2".equals(request)) {
            System.out.println("ConcreteHandler2 processed the request: " + request);
        } else {
            System.out.println("ConcreteHandler2 passed the request: " + request);
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                System.out.println("End of chain. No handler processed the request: " + request);
            }
        }
    }
}
