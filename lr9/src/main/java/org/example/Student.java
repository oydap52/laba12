package org.example;

import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() { return name; }
    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        return grades.values().stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", Группа: " + group + ", Курс: " + course + ", Средний балл: " + String.format("%.2f", getAverageGrade());
    }
}