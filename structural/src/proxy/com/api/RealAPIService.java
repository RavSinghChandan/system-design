package proxy.com.api;

public class RealAPIService implements APIService{
    @Override
    public void request(String apiKey) {
        System.out.println("Real API service with API key is  : "+apiKey);
    }
}
