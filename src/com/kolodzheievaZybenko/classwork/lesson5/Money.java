package com.kolodzheievaZybenko.classwork.lesson5;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
/*
будет печатать сумму денег, которую нужно выдать игроку за баллы
        Если у игрока больше 1000 баллов, то выдать ему 50000$
        Если у игрока 500-1000 баллов, то выдать ему 20000$
        Если у игрока 100-500 баллов, то выдать ему 10000$
        Если у игрока меньше 100 баллов, то ничего ему не выдавать
*/

public class Money {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int score = Integer.parseInt(READER.readLine());

        if (score > 1000) {
            System.out.println("50000$");
        } else if (score >= 500 & score < 1000) {
            System.out.println("20000");
        } else if (score >= 100 & score < 500) {
            System.out.println("10000");
        } else {
            System.out.println("no money");
        }

    }
    }
