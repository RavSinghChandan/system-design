package realtime.collab.user;

public class Viewer extends User {

    public Viewer(String name, String email) {
        super(name, email);
    }

    @Override
    public String getRole() {
        return "VIEWER";
    }
}