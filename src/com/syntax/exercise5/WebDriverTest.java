package com.syntax.exercise5;

public class WebDriverTest {
    public static void main(String[] args) {
        RemoteWebDriver webDriver1 = new ChromeDriver();
        System.out.println(webDriver1.getTitle());
        webDriver1.open();
        webDriver1.navigate();
        webDriver1.close();
//        webDriver1.getScreenShot();

        RemoteWebDriver webDriver2 = new FirefoxDriver();
        System.out.println(webDriver2.getTitle());
        webDriver2.open();
        webDriver2.navigate();
        webDriver2.close();

        RemoteWebDriver webDriver3 = new SafariDriver();
        System.out.println(webDriver3.getTitle());
        webDriver3.open();
        webDriver3.navigate();
        webDriver3.close();

    }
}
