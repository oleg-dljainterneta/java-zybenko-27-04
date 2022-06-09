package com.kolodzheievaZybenko.homework.lesson12;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Person {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final String[] NAMES = {"Anna", "Anastasia", "Katja", "Sasha", "Maria", "Lilia", "Izabel'"};
    private static final String[] SHURNAMES = {"Pypkin", "Ivanova", "Petrova", "Sidorova", "Makarova", "Chehova", "Smirnova"};

    private final String name;
    private final String surname;
    private final int height, age, weight;

    public Person() {
        this.name = NAMES[((int) (Math.random() * NAMES.length))];
        this.surname = SHURNAMES[(int) (Math.random() * SHURNAMES.length)];
        this.age = (int) (Math.random() * (60 - 18) + 18);
        this.weight = (int) (Math.random() * (90 - 50) + 50);
        this.height = (int) (Math.random() * (190 - 155) + 155);
    }

    public static void createPerson(int count) {
        Person[] person = new Person[count];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            System.out.println(i + 1 + " " + person[i]);
        }
    }

    @Override
    public String toString() {
        return "Person " + "(" +
                "name: " + name +
                ", surname: " + surname +
                ", age: " + age +
                ", weight: " + weight +
                ", height: " + height +
                ')';
    }
}