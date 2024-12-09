package ru.itis.inf403.lab09;

public class Dog extends Animal {
    private String breed;

    // Конструктор
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public String getInfo() {
        return super.getInfo() + ", Breed: " + breed;
    }
}