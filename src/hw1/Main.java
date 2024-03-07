package hw1;

import hw1.child.*;
import hw1.parent.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Herring("Luck", "Black"));
        animals.add(new Kangaroo("Adolf", "Orange"));
        animals.add(new Pelican("Ben", "Flui"));
        animals.add(new Cat("Urban", "Grey"));
        animals.add(new Dog("Spike", "Black"));
        animals.add(new Duck("White with black points", 2));
        animals.add(new Herring("Luck", "Red"));

        for(Animal animal: animals) {
            animal.toFly();
        }
        System.out.println();
        for(Animal animal: animals) {
            animal.toGo();
        }
        System.out.println();
        for(Animal animal: animals) {
            animal.toSwim();
        }


    }
}
