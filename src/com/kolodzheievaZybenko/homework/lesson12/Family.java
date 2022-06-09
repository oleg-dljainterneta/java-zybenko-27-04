package com.kolodzheievaZybenko.homework.lesson12;

public class Family {

    private final String name;
    private Family mother;
    private Family father;

    Family(String name) {
        this.name = name;
    }


    public Family(String name, Family mother, Family father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "The child's name is- " + name + (mother == null ? ", no mother" : ", mother's name is- " + mother.name) +
                (father == null ? ", no father" : ", father's name is: " + father.name);

    }
}