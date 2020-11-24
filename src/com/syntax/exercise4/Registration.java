package com.syntax.exercise4;

import java.security.PublicKey;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (!email.contains("@yahoo.com")) {
            System.out.println("Email should be only @yahoo.com");
        } else {
            System.out.println("Email is accepted");
            this.email = email;
        }
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("UserName should not be empty");
        } else {
            System.out.println("UserName is accepted");
            this.userName = userName;
        }
    }

    public void setPassword(String password) {
        if (password.isEmpty()) {
            System.out.println("Password should not be empty");
        } else if (password.length() < 6) {
            System.out.println("Password should not be less than 6 characters");
        } else if (password.contains(userName)) {
            System.out.println("Password should not contain user name");
        } else {
            System.out.println("Password is accepted");
            this.password = password;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
