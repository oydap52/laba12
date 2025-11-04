package org.example.domain;

public class Postgraduate extends Student {
    private String degree;

    public Postgraduate(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Postgraduate{name='" + name + "', age=" + age + ", degree='" + degree + "'}";
    }
}