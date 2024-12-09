package ru.itis.inf403.lab09;

import ru.itis.inf403.lab09.Bird;
import ru.itis.inf403.lab09.Dog;
import ru.itis.inf403.lab09.Cat;
import ru.itis.inf403.lab09.GermanShepherd;
import ru.itis.inf403.lab09.Poodle;

public class Animal {
    protected String name;
    protected int age;

    public Animal() {}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}