package org.example.model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String department;
    //sdfadadf

    public Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
}
