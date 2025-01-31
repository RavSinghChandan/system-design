package instagram.user;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    private User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public static class Builder {
        private int id;
        private String name;
        private String email;
        private String password;

        public Builder setId(int id) { this.id = id; return this; }
        public Builder setName(String name) { this.name = name; return this; }
        public Builder setEmail(String email) { this.email = email; return this; }
        public Builder setPassword(String password) { this.password = password; return this; }

        public User build() { return new User(id, name, email, password); }
    }
}
