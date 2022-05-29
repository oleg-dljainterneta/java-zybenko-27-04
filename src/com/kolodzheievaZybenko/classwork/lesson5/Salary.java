package com.kolodzheievaZybenko.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Написать программу для расчета зарплаты за год
        Известна ставка в месяц
        Если у сотрудника опыт более пяти лет, то добавить ему бонус 100$
*/

public class Salary {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("enter salary per month");
        int salaryPerMonth = Integer.parseInt(READER.readLine());
        System.out.println("enter number of month");
        int numberOfMonths = Integer.parseInt(READER.readLine());
        System.out.println("enter experience");
        int experience = Integer.parseInt(READER.readLine());
        System.out.println(salary(numberOfMonths, experience, salaryPerMonth));

    }

    public static int salary(int numberOfMonths, int experience, int salaryPerMonth) {
        int totalYearSalary;
        int yearSalary = numberOfMonths * salaryPerMonth;
        if (experience >= 5 & experience <10) {
            totalYearSalary = yearSalary + 100;
        } else if (experience >= 10) {
            totalYearSalary = yearSalary + 500;
        } else {
            return yearSalary;
        }
        return totalYearSalary;
    }
}