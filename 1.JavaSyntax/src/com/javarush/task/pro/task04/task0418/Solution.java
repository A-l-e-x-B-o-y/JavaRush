package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double glass = 0.5;
        boolean cup = scanner.nextBoolean();

        if (cup == true) {
            System.out.println(Math.round(Math.ceil(glass)));
        } else {
            System.out.println(Math.round(Math.floor(glass)));
        }
        scanner.close();
    }
}