package proxy.com.api;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class APIProxy implements APIService{

    private final APIService realService;
    private final Map<String, Long> requestTimestamps;
    private final long timeWindow = TimeUnit.SECONDS.toMillis(5); // 5 seconds window
    private final int maxRequests = 3; // Max 3 requests per time window

    public APIProxy(APIService realService) {
        this.realService = realService;
        this.requestTimestamps = new HashMap<>();
    }

    @Override
    public void request(String apiKey) {

        long currentTime = System.currentTimeMillis();

        // Check request limits
        requestTimestamps.putIfAbsent(apiKey, 0L);
        long lastRequestTime = requestTimestamps.get(apiKey);

        if ((currentTime - lastRequestTime) < timeWindow) {
            System.out.println("Rate limit exceeded for API Key: " + apiKey);
            return;
        }

        // Log request details
        System.out.println("Logging: API request received from API Key: " + apiKey);

        // Process request through real service
        realService.request(apiKey);

        // Update timestamp
        requestTimestamps.put(apiKey, currentTime);
    }
    }

