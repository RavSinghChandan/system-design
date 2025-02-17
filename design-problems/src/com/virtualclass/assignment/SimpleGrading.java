package com.virtualclass.assignment;

public class SimpleGrading implements GradingStrategy {
    @Override
    public String gradeAssignment(int score) {
        return score >= 50 ? "Pass" : "Fail";
    }
}
