package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void greetWithName() {
        assertEquals("Hello, Alice", App.greet("Alice"));
    }

    @Test
    void greetWithNull() {
        assertEquals("Hello, World", App.greet(null));
    }

    @Test
    void greetWithBlank() {
        assertEquals("Hello, World", App.greet("   "));
    }
}
