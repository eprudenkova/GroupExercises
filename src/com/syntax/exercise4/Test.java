package com.syntax.exercise4;

class Test {
    public static void main(String[] args) {
        Registration user = new Registration();
        user.setEmail("anna@gmail.com");
        user.setEmail("anna@yahoo.com");
        user.setUserName("");
        user.setUserName("Anna");
        user.setPassword("");
        user.setPassword("123");
        user.setPassword("1234Anna");
        user.setPassword("1234abcd");
    }
}
