package realtime.collab.accesscontrol;

public class PermissionsDecorator {

    public boolean addPermission(String role, String permission) {
        System.out.println(role + " granted " + permission + " permission.");
        return true;
    }
}
