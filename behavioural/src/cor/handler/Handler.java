package cor.handler;

public interface Handler {
    void setNext(Handler nextHandler);
    void handleRequest(String request);
}
