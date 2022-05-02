package com.kolodzheieva.classwork.lesson3;

public class TypeCasting {

  public static void main(String[] args) {

    byte b = 127;
    System.out.println("byte " + b);

    short sh = b;
    System.out.println("short " + sh);

    int i = 131;
    System.out.println("int " + i);

    b = (byte) i;
    System.out.println("byte " + b);

    b = 127;

    b = (byte) (b + 1);

    System.out.println("byte + 1 " + b);

    float f = 34.67f;

    byte floatToByte = (byte) f;
    System.out.println("floatToByte " + floatToByte);

  }
}
