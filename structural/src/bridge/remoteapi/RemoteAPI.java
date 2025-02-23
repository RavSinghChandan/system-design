package bridge.remoteapi;
// High level abstraction :
public abstract class RemoteAPI {

    public BackendImplementation backend;

    public RemoteAPI(BackendImplementation backend){
        this.backend= backend;
    }
    public abstract void  requestData();
}
