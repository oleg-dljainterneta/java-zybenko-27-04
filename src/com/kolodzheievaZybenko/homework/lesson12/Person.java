package com.kolodzheievaZybenko.homework.lesson12;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Person {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final String[] NAMES_FEMALE = {"Anna", "Anastasia", "Katja", "Sasha", "Maria", "Lilia", "Izabel'"};
    private static final String[] SHURNAMES_FEMALE = {"Pypkina", "Ivanova", "Petrova", "Sidorova", "Makarova", "Chehova", "Smirnova"};
    private static final String[] NAMES_MALE = {"Oleg", "Igor", "Sergej", "Pavel", "Inakentij", "Vitaly", "Masim"};
    private static final String[] SHURNAMES_MALE = {"Pypkin", "Ivanov", "Petrov", "Sidorov", "Makarov", "Chehov", "Smirnov"};
    public static Sex[] SEXES = {Sex.FEMALE, Sex.MALE};
    private Sex sex;
    private String name;
    private String surname;
    private int height;
    private int weight;
    private int age;

    public Person() {
    }

    public Person(Sex sex, String name, String surname, int age, int height, int weight) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

     public static Person createPersons() {
         Person person = new Person();
         person.sex = generateSex();
         generatePersonNameAndSurname(person);
         person.age = generatePersonAge();
         person.height = generatePersonHeight(generatePersonAge());
         person.weight = 12;
         return person;
     }
    private static String chooseParam(String[] params) {
        int index = (int) (Math.random() * params.length);
        return params[index];
    }

    private static Sex generateSex() {
        int index = (int) (Math.random() * 2);
        return SEXES[index];
    }

    public static int generatePersonAge() {
        return (int) (Math.random() * 90);
    }

    private static void generatePersonNameAndSurname(Person person) {
        switch (person.sex) {
            case FEMALE -> {
                person.name = chooseParam(NAMES_FEMALE);
                person.surname = chooseParam(SHURNAMES_FEMALE);
            }
            case MALE -> {
                person.name = chooseParam(NAMES_MALE);
                person.surname = chooseParam(SHURNAMES_MALE);
            }
        }
    }
    private static int generatePersonHeight(int age) {
       int height =0;
        int min = 0;
        int max = 0;
        if (age > 18) {
            min =165;
            max = 190;
        } else if (age>12) {
            min =150;
            max = 1165;
        } else if (age>8) {
            min =127;
            max = 150;
        } else if (age>5) {
            min =110;
            max = 127;
        } else if (age>3) {
            min =96;
            max = 110;
        } else if (age>1) {
            min =75;
            max = 96;
        }
        height = (int) (Math.random() * (max - min) + min);
        return height;
    }



    @Override
    public String toString() {
        return "Person " + "(" + " Sex: " + sex + ", name: " + name + ", surname: " + surname + ", age: " + age +
                ", weight: " + weight + " kg " + ", height: " + height + " cm)";
    }
}