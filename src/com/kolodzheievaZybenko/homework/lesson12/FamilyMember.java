package com.kolodzheievaZybenko.homework.lesson12;

public class FamilyMember {

    private final String name;
    private FamilyMember mother;
    private FamilyMember father;

    FamilyMember(String name) {
        this.name = name;
    }

    public FamilyMember(String name, FamilyMember mother, FamilyMember father) {
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