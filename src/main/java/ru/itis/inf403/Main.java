package ru.itis.inf403;

import ru.itis.inf403.lab09.Cat;
import ru.itis.inf403.lab09.Dog;
import ru.itis.inf403.lab09.Bird;
import ru.itis.inf403.lab09.GermanShepherd;
import ru.itis.inf403.lab09.Poodle;


public class Main {
    public static void main(String[] args) {
        Dog germanShepherd = new GermanShepherd("Rax", 3);
        Dog poodle = new Poodle("Bella", 2);

        System.out.println(germanShepherd.getInfo());
        germanShepherd.makeSound();

        System.out.println(poodle.getInfo());
        poodle.makeSound();
    }
}
