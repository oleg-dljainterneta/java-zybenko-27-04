
package com.kolodzheievaZybenko.homework.lesson12;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

import java.io.IOException;

public class FamilyCreate {
    public static void main(String[] args) throws IOException {
        System.out.println("What's your name?");
        String name = ArrayOptions.READER.readLine();

        System.out.println("What is your mom's name?");
        String isMother = ArrayOptions.READER.readLine();
        Family mother = null;
        if (isMother != null && !isMother.isBlank()) {
            mother = new Family(isMother);
        }

        System.out.println("What is your dad's name?");
        String isFather = ArrayOptions.READER.readLine();
        Family father = null;
        if (isFather != null && !isFather.isBlank()) {
            father = new Family(isFather);
        }

        Family allFamily = new Family(name, mother, father);

        System.out.println("Family: " + allFamily);
    }
}
