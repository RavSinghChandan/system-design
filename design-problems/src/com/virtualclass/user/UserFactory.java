package com.virtualclass.user;

public class UserFactory {
    public static User createUser(String type, String name, String email) {
        return switch (type.toLowerCase()) {
            case "student" -> new Student(name, email);
            case "teacher" -> new Teacher(name, email);
            case "admin" -> new Admin(name, email);
            default -> throw new IllegalArgumentException("Invalid user type");
        };
    }
}
