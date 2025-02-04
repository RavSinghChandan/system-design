package bookstore.user;

public class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Admin");
    }
}
