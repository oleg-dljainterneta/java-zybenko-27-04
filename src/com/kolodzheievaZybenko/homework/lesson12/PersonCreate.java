package com.kolodzheievaZybenko.homework.lesson12;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

public class PersonCreate {

    public static void main(String[] args) {
        System.out.println("Enter the number of people");
        int count = ArrayOptions.readNumber();
        Person[] people=new Person[count];
        for (int i = 0; i < people.length; i++) {
            people[i]=Person.createPersons();
        }
        for (Person person:people){
            System.out.println(person);
        }
    }

}
/*
public static String[] heightWeight(int age, String[] sex, String[] namesFemale, String[] namesMale, String[] surnameFemale, String[] surnameMale) {
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
        }*/
