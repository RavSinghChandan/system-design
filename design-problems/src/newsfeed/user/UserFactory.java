package newsfeed.user;

public class UserFactory {

    public static User createUser(String type, int userId, String name) {
        return switch (type.toLowerCase()) {
            case "admin" -> new Admin(userId, name);
            case "influencer" -> new Influencer(userId, name);
            default -> new User(userId, name);
        };
    }
}