package cor.chandan;

public class VastuConsultancyHandler implements RequestHandler{
    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if ("Vastu Consultancy".equalsIgnoreCase(request)) {
            System.out.println("Chandan is handling the request: " + request + " with Vastu Shastra advice.");
        } else if (nextHandler != null) {
            System.out.println("Passing to the next handler...");
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for: " + request);
        }
    }
}
