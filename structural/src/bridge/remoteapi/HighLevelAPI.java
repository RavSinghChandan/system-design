package bridge.remoteapi;

public class HighLevelAPI extends RemoteAPI {

    public HighLevelAPI(BackendImplementation backend) {
        super(backend);
    }

    @Override
    public void requestData() {
        // The high-level API delegates the fetching logic to the backend implementation.
        String data = backend.fetchData();
        System.out.println("HighLevelAPI retrieved: " + data);
    }
}
