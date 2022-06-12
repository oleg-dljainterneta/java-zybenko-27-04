package com.kolodzheievaZybenko.homework.lesson12;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

public class PersonCreate {

    public static void main(String[] args) {
        System.out.println("Enter the number of people");
        int count = ArrayOptions.readNumber();
        Person.createPerson(count);
    }

}