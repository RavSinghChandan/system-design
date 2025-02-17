package com.virtualclass.assignment;

class AdvancedGrading implements GradingStrategy {
    @Override
    public String gradeAssignment(int score) {
        if (score >= 90) return "A";
        if (score >= 75) return "B";
        if (score >= 50) return "C";
        return "F";
    }
}