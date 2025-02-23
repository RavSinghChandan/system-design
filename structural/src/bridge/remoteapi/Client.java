package bridge.remoteapi;

public class Client {
    public static void main(String[] args) {

        BackendImplementation restBackend  = new RestBackend();
        RemoteAPI restAPI = new HighLevelAPI(restBackend);
        restAPI.requestData();

        BackendImplementation soapBackend = new SoapBackend();
        RemoteAPI soapAPI = new HighLevelAPI(soapBackend);
        soapAPI.requestData();
    }
}
