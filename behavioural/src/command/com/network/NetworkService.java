package command.com.network;

public class NetworkService {

    public void sendGetRequest(String url){
        System.out.println("Sending GET Request with URL : "+url);
    }
    public void sendPostRequest(String url, String data){
        System.out.println("Sending POST Request with URL "+url+" and Data : "+data);
    }
}
