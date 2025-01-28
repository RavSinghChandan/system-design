package realtime.collab.user;

public  abstract class User {

    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract String getRole();

    public String getEmail() { return email; }
}
