package com.virtualclass.user;

// Singleton Service for User Management
public class UserService {
    private static UserService instance;

    private UserService() {}

    public static synchronized UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public User registerUser(String type, String name, String email) {
        return UserFactory.createUser(type, name, email);
    }

    public boolean authenticateUser(String email, String password) {
        // Mock authentication logic
        return email.endsWith("@domain.com") && password.equals("password123");
    }
}
