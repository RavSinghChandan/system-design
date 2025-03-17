package command.com.network;

public class Client {
    public static void main(String[] args) {
        NetworkService networkService = new NetworkService();
        RequestInvoker invoker = new RequestInvoker();

        // Create commands
        NetworkCommand getRequest = new SendGetRequestCommand(networkService, "https://example.com/api/data");

       // SendPostRequestCommand postRequest = new SendPostRequestCommand(networkService, "https://example.com/api/upload",
         //       "{ 'name': 'John' }");

        // Queue requests
        invoker.addRequest(getRequest);
        // invoker.addRequest((NetworkCommand) postRequest);

        // Execute queued requests
        invoker.executeRequests();
    }
}
