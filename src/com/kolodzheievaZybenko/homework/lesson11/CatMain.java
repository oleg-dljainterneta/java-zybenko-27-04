package com.kolodzheievaZybenko.homework.lesson11;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat("Leo", 5, 5, "Hernja");
        System.out.println(cat1);
        Cat cat2 = new Cat("Lucky", 5, 8, "Olen'");
        System.out.println(cat2);
        System.out.println(cat1.equals(cat2));
    }
}
