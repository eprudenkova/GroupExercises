package com.syntax.exercise5;

public class FirefoxDriver implements RemoteWebDriver{

    String title = "Firefox Driver";

    @Override
    public void open() {
        System.out.println("Code to open Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Code to close Firefox Browser");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL using Firefox Browser");
    }
}
