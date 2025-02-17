package com.virtualclass.assignment;

public class Assignment {
    private int id;
    private String title;
    private int score;
    private GradingStrategy gradingStrategy;

    public Assignment(int id, String title, int score, GradingStrategy gradingStrategy) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.gradingStrategy = gradingStrategy;
    }

    public String getGrade() {
        return gradingStrategy.gradeAssignment(score);
    }
}

