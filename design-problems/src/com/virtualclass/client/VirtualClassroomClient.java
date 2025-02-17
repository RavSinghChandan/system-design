package com.virtualclass.client;

import com.virtualclass.user.UserService;

public class VirtualClassroomClient {
    public static void main(String[] args) {
        // ------------------ Discussion System (Mediator) ------------------
        System.out.println("=== Discussion System ===");
        // ------------------ User Management ------------------
        UserService userService = UserService.getInstance();

       userService.registerUser("Student","Chandan","ravsingh15@gmail.com");
        userService.registerUser("Teacher", "Mr. Singh", "teacher@gmail.com");

        System.out.println("User Authentication: " + userService.authenticateUser("chandan@gmail.com", "password"));

        // ------------------ Course Management ------------------


        // ------------------ Live Class ------------------


        // ------------------ Discussion Forum ------------------

        // ------------------ Notification System ------------------

    }
}

