package com.virtualclass.user;

class Teacher implements User {
    private String name;
    private String email;

    public Teacher(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getEmail() { return email; }

    @Override
    public String getRole() { return "Teacher"; }
}

