package ru.itis.inf403.lab09;

public class Poodle extends Dog {
    private String coatType; // Тип шерсти

    // Конструктор
    public Poodle(String name, int age) {
        super(name, age, "Poodle");
        this.coatType = "Curly";
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    public void makeSound() {
        System.out.println("Poodle makes a soft yapping sound!");
    }

    public String getInfo() {
        return super.getInfo() + ", Coat Type: " + coatType;
    }
}

