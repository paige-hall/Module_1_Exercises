package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;



    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        double grade = ((double) earnedMarks / possibleMarks) * 100;
        if (grade >= 90) {
            letterGrade = "A";
        } else if (grade >= 80 && grade <= 89) {
            letterGrade = "B";
        } else if (grade >= 70 && grade <=79) {
            letterGrade = "C";
        } else if (grade >= 60 && grade <= 69) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
}


