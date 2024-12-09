package ru.itis.inf403.lab09;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    public String getInfo() {
        return super.getInfo() + ", Color: " + color;
    }
}