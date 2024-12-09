package ru.itis.inf403.lab09;

public class Bird extends Animal{
    private String species;

    public Bird(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void makeSound() {
        System.out.println("Chirp! Chirp!");
    }

    public String getInfo() {
        return super.getInfo() + ", Species: " + species;
    }
}



