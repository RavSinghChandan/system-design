package bridge.remoteapi;

public class SoapBackend implements BackendImplementation{
    @Override
    public String fetchData() {
        return "Data fetched from SOAP backend database";
    }
}
