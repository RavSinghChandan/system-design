package realtime.collab.user;

public class Editor extends User {
    public Editor(String name, String email) {
        super(name, email);
    }

    @Override
    public String getRole() {
        return "EDITOR";
    }
}
