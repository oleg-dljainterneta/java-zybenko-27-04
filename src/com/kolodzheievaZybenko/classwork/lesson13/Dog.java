package com.kolodzheievaZybenko.classwork.lesson13;

public class Dog extends Animal {
    public Dog() {
        super("black");
    }

    @Override
    public void speak() {
        System.out.println("gav");
        action();
    }

    private void action() {
        System.out.println("������ ���������");
    }
}
