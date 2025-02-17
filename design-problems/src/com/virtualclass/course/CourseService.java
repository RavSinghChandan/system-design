package com.virtualclass.course;

import java.util.*;

// Service for Course Management
class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void createCourse(Course course) {
        courses.add(course);
    }

    public Course getCourseDetails(int index) {
        if (index >= 0 && index < courses.size()) {
            return courses.get(index);
        }
        throw new IndexOutOfBoundsException("Course not found");
    }
}
