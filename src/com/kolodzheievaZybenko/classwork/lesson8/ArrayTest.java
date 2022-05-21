package com.kolodzheievaZybenko.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayTest {

  public static void main(String[] args) throws IOException {

    // створити масив
    int size = 5;
    int[] numbers = new int[size];
    int[] newNumbers = {1, 2, 3, 4, 5};

    System.out.println(numbers);

    // заповнюємо масив
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 10;
    }

    // виводимо масив
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    String[] students = {"Tania", "Kostia", "Olena", "Olenaka", "Anton", "Andriy"};
    // перебрати всі елементи масиву
    for (String student : students) {
      System.out.println(student + ", hi!");
    }
    System.out.println(students);

    String[] studentsBackup = new String[students.length];
    for (int index = 0; index < students.length; index++) {
      studentsBackup[index] = students[index];
    }
    System.out.println(studentsBackup);

    students[0] = "Katia";
    students[2] = "Serhii";

    for (String[] strings : Arrays.asList(students, studentsBackup)) {
      System.out.println(Arrays.toString(strings));
    }

    for (int i = 0; i < studentsBackup.length; i++) {
      System.out.println(studentsBackup[i]);
    }
    String[] fruit = new String[3];
    System.out.println(fruit);
    fillArray(fruit);
    System.out.println(Arrays.toString(fruit));
  }

  public static void fillArray(String[] array) throws IOException {
    System.out.println(array);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < array.length; i++) {
      array[i] = reader.readLine();
    }
  }
}
