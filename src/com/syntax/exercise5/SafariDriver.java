package com.syntax.exercise5;

public class SafariDriver implements RemoteWebDriver{

    String title = "Safari Driver";

    @Override
    public void open() {
        System.out.println("Code to open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Code to close Safari Browser");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL using Safari Browser");
    }
}
