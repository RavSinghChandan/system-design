package bridge.remoteapi;
//concrete implementor
public class RestBackend implements BackendImplementation{
    @Override
    public String fetchData() {
        return "Data fetched from REST Back-end ";
    }
}
