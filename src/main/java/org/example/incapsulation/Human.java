package org.example.incapsulation;

public class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age , Human obj) {
        Human obj1 = obj;
        obj1.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
