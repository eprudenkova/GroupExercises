package com.syntax.exercise2;

public class MarksTest {
    public static void main(String[] args) {
        Marks studentA = new StudentA(80, 90, 95);
        Marks studentB = new StudentB(88, 92, 75, 95);
        Marks[] students = {studentA, studentB};
        for (Marks student : students) {
            System.out.println("Averadge mark is "+student.getPercentage());
        }
    }
}
