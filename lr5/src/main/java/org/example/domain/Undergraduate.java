package org.example.domain;

public class Undergraduate extends Student {
    private String course;

    public Undergraduate(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(", курс = " + course);
    }

//    @Override
//    public String toString() {
//        return "Undergraduate{name='" + name + "', age=" + age + ", course='" + course + "'}";
//    }
}