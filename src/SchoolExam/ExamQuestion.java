package SchoolExam;

import java.util.Random;

public class ExamQuestion {
    private int number;
    private char grade;

    public ExamQuestion(int number, char grade) {
        this.grade = grade;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }


    public void setRandomGrade() {
        Random rand = new Random();
        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};

        char done = grades[rand.nextInt(grades.length)];
        setGrade(done);
    }

    public String toString() {
        return number + " " + grade;
    }
}
