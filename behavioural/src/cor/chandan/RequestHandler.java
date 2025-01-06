package cor.chandan;

public interface RequestHandler {
    void setNextHandler(RequestHandler nextHandler);
    void handleRequest(String request);
}
