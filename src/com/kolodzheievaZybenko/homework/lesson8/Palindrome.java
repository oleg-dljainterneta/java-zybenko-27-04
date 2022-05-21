package com.kolodzheievaZybenko.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

  public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    System.out.println("Enter a sentence or word");
    String input = READER.readLine();
    System.out.println("isPalindrome? - " + isPalindrome(input));

  }

  public static boolean isPalindrome(String string) {
    int n = string.length();
    for (int i = 0; i < (n / 2); ++i) {
      if (string.charAt(i) != string.charAt(n - i - 1)) {
        return false;
      }
    }
    return true;
  }

}