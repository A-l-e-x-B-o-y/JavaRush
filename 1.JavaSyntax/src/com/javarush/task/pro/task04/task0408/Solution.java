package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = -2147483648, max = -2147483648;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > max) {
                if (number % 2 == 0) {
                    max = number;
                }
            }
        }
        if (max == min) {
            System.out.println(min);
        } else {
            System.out.println(max);
        }
        scanner.close();
    }
}