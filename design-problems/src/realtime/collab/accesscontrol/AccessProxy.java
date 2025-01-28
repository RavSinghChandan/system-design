package realtime.collab.accesscontrol;

public class AccessProxy {

    public boolean hasAccess(String role, String action) {
        return switch (role.toUpperCase()) {
            case "ADMIN" -> true;
            case "EDITOR" -> action.equals("edit");
            case "VIEWER" -> action.equals("view");
            default -> false;
        };
    }
}
