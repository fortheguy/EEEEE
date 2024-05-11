package spring.test.controller;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Student() {
    }

    public void setAge(int age) {
        this.age = age;
    }
}
