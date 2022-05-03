package com.kolodzheievaZybenko.classwork.lesson4;

public class Box {

  public static void main(String[] args) {

    int widht = 8;
    int height = 3;
    int depth = 9;
    int volume = calculatevolume(widht, height, depth);
    System.out.println(volume);

  }


  public static int calculatevolume(int width, int height, int depth){
  return width * height * depth;

  }

}
