package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 2147483647, max = 2147483647;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < min) {
                min = number;
            }
        }
        if (min == max) {
            System.out.println(max);
        } else {
            System.out.println(min);
        }
        scanner.close();
    }
}