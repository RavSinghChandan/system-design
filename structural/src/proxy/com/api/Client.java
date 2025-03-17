package proxy.com.api;

public class Client {
    public static void main(String[] args) throws InterruptedException{

        APIService apiProxy = new APIProxy(new RealAPIService());

        // Simulate API requests
        String userApiKey = "USER123";
        apiProxy.request(userApiKey); // Allowed
        apiProxy.request(userApiKey); // Blocked (Rate Limit)

        Thread.sleep(6000); // Wait for rate-limit reset
        apiProxy.request(userApiKey); // Allowed again
    }
}
