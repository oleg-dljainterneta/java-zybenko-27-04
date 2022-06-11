
package com.kolodzheievaZybenko.homework.lesson12;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

import java.io.IOException;

public class FamilyCreate {
    public static void main(String[] args) throws IOException {
        System.out.println("What's your name?");
        String name = ArrayOptions.READER.readLine();
        System.out.println("What is your mom's name?");
        String Mother = ArrayOptions.READER.readLine();
        FamilyMember mother = null;
        if (Mother != null && !Mother.isBlank()) {
            mother = new FamilyMember(Mother);
        }

        System.out.println("What is your dad's name?");
        String isFather = ArrayOptions.READER.readLine();
        FamilyMember father = null;
        if (isFather != null && !isFather.isBlank()) {
            father = new FamilyMember(isFather);
        }

        FamilyMember allFamilyMember = new FamilyMember(name, mother, father);

        System.out.println("Family: " + allFamilyMember);
    }
}
