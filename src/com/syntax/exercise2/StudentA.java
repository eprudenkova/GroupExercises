package com.syntax.exercise2;

public class StudentA extends Marks {

    double subject1Mark, subject2Mark, subject3Mark;

    public StudentA(double subject1Mark, double subject2Mark, double subject3Mark) {
        this.subject1Mark = subject1Mark;
        this.subject2Mark = subject2Mark;
        this.subject3Mark = subject3Mark;
    }

    @Override
    double getPercentage() {
        return (subject1Mark+subject2Mark+subject3Mark)/3;
    }
}
