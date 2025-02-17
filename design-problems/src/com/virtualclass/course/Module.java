package com.virtualclass.course;

// Concrete Module Class (Composite Pattern)
class Module implements CourseComponent {

    private String moduleName;

    public Module(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public void showCourseDetails() {
        System.out.println("  Module: " + moduleName);
    }
}

