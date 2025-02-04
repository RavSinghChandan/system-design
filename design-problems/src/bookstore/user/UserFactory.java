package bookstore.user;

// UserFactory.java
public class UserFactory {
    public static User createUser(String type, String name, String email) {
        if (type.equalsIgnoreCase("admin")) {
            return new Admin(name, email);
        } else if (type.equalsIgnoreCase("customer")) {
            return new Customer(name, email);
        }
        return null;
    }
}