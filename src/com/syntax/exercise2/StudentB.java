package com.syntax.exercise2;

public class StudentB extends Marks {

    double subject1Mark, subject2Mark, subject3Mark, subject4Mark;

    public StudentB(double subject1Mark, double subject2Mark, double subject3Mark, double subject4Mark) {
        this.subject1Mark = subject1Mark;
        this.subject2Mark = subject2Mark;
        this.subject3Mark = subject3Mark;
        this.subject4Mark = subject4Mark;
    }

    @Override
    double getPercentage() {
        return (subject1Mark+subject2Mark+subject3Mark+subject4Mark)/4;
    }
}