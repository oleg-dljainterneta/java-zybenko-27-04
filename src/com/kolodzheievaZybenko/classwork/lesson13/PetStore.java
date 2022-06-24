package com.kolodzheievaZybenko.classwork.lesson13;

import java.util.ArrayList;
import java.util.List;

public class PetStore extends Animal{
    public PetStore(String color) {
        super(color);
    }

    public static void main(String[] args) {

        Animal cat = new Cat(DEFAULT_COLOR, "siam");
        Animal dog = new Dog();
        Animal cat2 = new Cat("ginger", "no");

        //Animal[] animals1 = new Animal[2];
        List<Animal> animals = new ArrayList<>();

        animals.add(cat);
        animals.add(dog);
        animals.add(cat2);
        animals.add(new Rat("multi"));

        handleAnimals(animals);

    }

    private static void handleAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.speak();

            if (animal instanceof Rat) {
                Rat rat = (Rat) animal;
                rat.steal();
            }
        }
    }
}
