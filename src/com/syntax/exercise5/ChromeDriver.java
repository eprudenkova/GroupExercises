package com.syntax.exercise5;

public class ChromeDriver implements RemoteWebDriver {

    String title="Chrome Driver";

    @Override
    public void open() {
        System.out.println("Code to open Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Code to close Chrome Browser");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL using Chrome Browser");
    }
}
