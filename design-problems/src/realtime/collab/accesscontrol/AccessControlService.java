package realtime.collab.accesscontrol;

public class AccessControlService {

    private AccessProxy proxy = new AccessProxy();

    public boolean checkAccess(String role, String action) {
        return proxy.hasAccess(role, action);
    }
}
