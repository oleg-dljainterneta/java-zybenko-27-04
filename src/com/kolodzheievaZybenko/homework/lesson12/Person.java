package com.kolodzheievaZybenko.homework.lesson12;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Objects;

public class Person {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final String[] NAMES_FEMALE = {"Anna", "Anastasia", "Katja", "Sasha", "Maria", "Lilia", "Izabel'"};
    private static final String[] SHURNAMES_FEMALE = {"Pypkina", "Ivanova", "Petrova", "Sidorova", "Makarova", "Chehova", "Smirnova"};

    private static final String[] NAMES_MALE = {"Oleg", "Igor", "Sergej", "Pavel", "Inakentij", "Vitaly", "Masim"};

    private static final String[] SHURNAMES_MALE = {"Pypkin", "Ivanov", "Petrov", "Sidorov", "Makarov", "Chehov", "Smirnov"};
    private static final String[] SEX = {"Male", "Female"};
    private final String name, surname, sex;
    private String height, weight;
    private int age;


    public Person() {
        this.sex = SEX[((int) (Math.random() * SEX.length))];
        String[] heightWeightArray = heightWeight(age, Integer.parseInt(sex), NAMES_FEMALE, NAMES_MALE, SHURNAMES_FEMALE, SHURNAMES_MALE);
        this.name = heightWeightArray[2];
        this.surname = heightWeightArray[3];
        this.age = (int) (Math.random() * (90 - 1) + 1);
        int weight = Integer.parseInt(heightWeightArray[1]);
        int height = Integer.parseInt(heightWeightArray[0]);
        this.weight = String.valueOf(weight);
        this.height = String.valueOf(height);

    }

    public static void createPerson(int count) {
        Person[] person = new Person[count];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            System.out.println(i + 1 + " " + person[i]);
        }
    }

    public static String[] heightWeight(int age, int sex, String[] namesFemale, String[] namesMale, String[] surnameFemale, String[] surnameMale) {
        String informationSurname = null;
        String informationName = null;
        int height = 0;
        int weight = 0;
        if (age > 18 && Objects.equals(sex, "Male")) {
            height = (int) (Math.random() * (190 - 165) + 165);
            weight = (int) (Math.random() * (100 - 60) + 60);
            informationSurname = surnameMale[((int) (Math.random() * surnameMale.length))];
            informationName = namesMale[((int) (Math.random() * namesMale.length))];
        } else if (age > 18 && Objects.equals(sex, "Female")) {
            height = (int) (Math.random() * (190 - 165) + 165);
            weight = (int) (Math.random() * (100 - 60) + 60);
            informationSurname = surnameFemale[((int) (Math.random() * surnameFemale.length))];
            informationName = namesFemale[((int) (Math.random() * namesFemale.length))];
        } else if (age > 12 && Objects.equals(sex, "Male")) {
            height = (int) (int) (Math.random() * (165 - 150) + 150);
            weight = (int) (Math.random() * (60 - 40) + 40);
            informationSurname = surnameMale[((int) (Math.random() * surnameMale.length))];
            informationName = namesMale[((int) (Math.random() * namesMale.length))];
        } else if (age > 12 && Objects.equals(sex, "Female")) {
            height = (int) (int) (Math.random() * (165 - 150) + 150);
            weight = (int) (Math.random() * (60 - 40) + 40);
            informationSurname = surnameFemale[((int) (Math.random() * surnameFemale.length))];
            informationName = namesFemale[((int) (Math.random() * namesFemale.length))];
        } else if (age > 8 && Objects.equals(sex, "Male")) {
            height = (int) (Math.random() * (150 - 127) + 127);
            weight = (int) (Math.random() * (40 - 25) + 25);
            informationSurname = surnameMale[((int) (Math.random() * surnameMale.length))];
            informationName = namesMale[((int) (Math.random() * namesMale.length))];
        } else if (age > 8 && Objects.equals(sex, "Female")) {
            height = (int) (Math.random() * (150 - 127) + 127);
            weight = (int) (Math.random() * (40 - 25) + 25);
            informationSurname = surnameFemale[((int) (Math.random() * surnameFemale.length))];
            informationName = namesFemale[((int) (Math.random() * namesFemale.length))];
        } else if (age > 5 && Objects.equals(sex, "Male")) {
            height = (int) (Math.random() * (127 - 110) + 110);
            weight = (int) (Math.random() * (25 - 18) + 18);
            informationSurname = surnameMale[((int) (Math.random() * surnameMale.length))];
            informationName = namesMale[((int) (Math.random() * namesMale.length))];
        } else if (age > 5 && Objects.equals(sex, "Female")) {
            height = (int) (Math.random() * (127 - 110) + 110);
            weight = (int) (Math.random() * (25 - 18) + 18);
            informationSurname = surnameFemale[((int) (Math.random() * surnameFemale.length))];
            informationName = namesFemale[((int) (Math.random() * namesFemale.length))];
        } else if (age > 3 && Objects.equals(sex, "Male")) {
            height = (int) (Math.random() * (110 - 96) + 96);
            weight = (int) (Math.random() * (18 - 13) + 13);
            informationSurname = surnameMale[((int) (Math.random() * surnameMale.length))];
            informationName = namesMale[((int) (Math.random() * namesMale.length))];
        } else if (age > 3 && Objects.equals(sex, "Female")) {
            height = (int) (Math.random() * (110 - 96) + 96);
            weight = (int) (Math.random() * (18 - 13) + 13);
            informationSurname = surnameFemale[((int) (Math.random() * surnameFemale.length))];
            informationName = namesFemale[((int) (Math.random() * namesFemale.length))];
        } else if (age >= 1 && Objects.equals(sex, "Male")) {
            height = (int) (Math.random() * (96 - 75) + 75);
            weight = (int) (Math.random() * (13 - 9) + 9);
            informationSurname = surnameMale[((int) (Math.random() * surnameMale.length))];
            informationName = namesMale[((int) (Math.random() * namesMale.length))];
        } else if (age >= 1 && Objects.equals(sex, "Female")) {
            height = (int) (Math.random() * (96 - 75) + 75);
            weight = (int) (Math.random() * (13 - 9) + 9);
            informationSurname = surnameFemale[((int) (Math.random() * surnameFemale.length))];
            informationName = namesFemale[((int) (Math.random() * namesFemale.length))];
        }
        String[] heightWeight = new String[]{String.valueOf(height), String.valueOf(weight), String.valueOf(informationName), String.valueOf(informationSurname)};

        return heightWeight;
    }


    @Override
    public String toString() {
        return "Person " + "(" + " Sex: " + sex + ", name: " + name + ", surname: " + surname + ", age: " + age +
                ", weight: " + weight + " kg " + ", height: " + height + " cm)";
    }
}