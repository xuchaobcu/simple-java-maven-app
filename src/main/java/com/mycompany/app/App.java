package com.mycompany.app;

/**
 * Hello Devops!
 */
public class App
{

    private final String message = "Hello Devops!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
