package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1000000, preMin = 1000000;

        while (scanner.hasNextInt()) {
            int temp;
            int number = scanner.nextInt();
            if (min > number) {
                temp = min;
                min = number;

                if (preMin > temp) {
                    preMin = temp;
                }
            } else if (number < preMin & preMin > min) {
                if (number == min) continue;
                preMin = number;
            }
        }
        System.out.println(preMin);
        scanner.close();
    }
}