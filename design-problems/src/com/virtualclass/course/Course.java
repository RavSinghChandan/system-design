package com.virtualclass.course;

import java.util.ArrayList;
import java.util.List;

// Concrete Course Class
class Course implements CourseComponent {
    private String courseName;
    private List<CourseComponent> modules = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addModule(CourseComponent module) {
        modules.add(module);
    }

    @Override
    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        for (CourseComponent module : modules) {
            module.showCourseDetails();
        }
    }
}
