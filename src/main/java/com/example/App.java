package com.example;

public class App {
    public static String greet(String name) {
        if (name == null || name.isBlank()) return "Hello, World";
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        String name = (args != null && args.length > 0) ? args[0] : "World";
        System.out.println(greet(name));
    }
}
