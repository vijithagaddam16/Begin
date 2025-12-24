package com.example;

public class Test {
    private int id;
    private String name;

    public Test() {
        this(0, "default");
    }

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{id=" + id + ", name='" + name + "'}";
    }

    public static void main(String[] args) {
        Test example = new Test(1, "Sample");
        System.out.println(example);
    }
}