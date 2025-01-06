package cor.chandan;

public class FarmingHandler implements RequestHandler{
    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if ("Farming".equalsIgnoreCase(request)) {
            System.out.println("Chandan is handling the request: " + request + " with farming expertise.");
        } else if (nextHandler != null) {
            System.out.println("Passing to the next handler...");
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for: " + request);
        }
    }
}
