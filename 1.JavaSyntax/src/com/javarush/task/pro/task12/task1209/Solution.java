package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        /*paySalary("Гвинно");
        paySalary("Иван");
        paySalary("Фриле");
        paySalary("Гена");
        paySalary("Нифрод");

        System.out.println(alreadyGotSalaryEmployees.toString());
        System.out.println(waitingEmployees.toString());*/

    }

    public static void paySalary(String name) {
        if (name != null) {
            for (String temp : waitingEmployees) {
                if (name.equals(temp)) {
                    alreadyGotSalaryEmployees.add(name);
                    int x = waitingEmployees.indexOf(temp);
                    waitingEmployees.set(x, null);
                }
            }
        }

    }
}
