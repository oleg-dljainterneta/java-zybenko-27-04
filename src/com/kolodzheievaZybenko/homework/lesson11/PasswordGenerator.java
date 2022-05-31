package com.kolodzheievaZybenko.homework.lesson11;

import java.util.Random;

public class PasswordGenerator {
    public final static String[] LOWER_CASES = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public final static String[] UPPER_CASES = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public final static String[] NUMS_LIST = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    public final static String[] SYMBOLS_ARRAY = {"_"};

    public static String genRandomPwd(int pwd_len) {

        int lower = pwd_len / 3;
        int upper = (pwd_len - lower) / 2;
        int num = (pwd_len - lower) / 3;
        int symbol = pwd_len - lower - upper - num;

        StringBuilder pwd = new StringBuilder();
        Random random = new Random();
        int position = 0;
        while ((lower + upper + num + symbol) > 0) {
            if (lower > 0) {
                position = random.nextInt(pwd.length() + 1);

                pwd.insert(position, LOWER_CASES[random.nextInt(LOWER_CASES.length)]);
                lower--;
            }
            if (upper > 0) {
                position = random.nextInt(pwd.length() + 1);

                pwd.insert(position, UPPER_CASES[random.nextInt(UPPER_CASES.length)]);
                upper--;
            }
            if (num > 0) {
                position = random.nextInt(pwd.length() + 1);

                pwd.insert(position, NUMS_LIST[random.nextInt(NUMS_LIST.length)]);
                num--;
            }
            if (symbol > 0) {
                position = random.nextInt(pwd.length() + 1);

                pwd.insert(position, SYMBOLS_ARRAY[random.nextInt(SYMBOLS_ARRAY.length)]);
                symbol--;
            }
        }
        return pwd.toString();
    }

    public static void main(String[] args) {
        System.out.println(genRandomPwd(8));
    }
}