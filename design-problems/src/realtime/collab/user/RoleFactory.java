package realtime.collab.user;

public class RoleFactory {

    public static User createUser(String role, String name, String email) {
        return switch (role.toUpperCase()) {
            case "ADMIN" -> new Admin(name, email);
            case "EDITOR" -> new Editor(name, email);
            case "VIEWER" -> new Viewer(name, email);
            default -> throw new IllegalArgumentException("Invalid role: " + role);
        };
    }
}
