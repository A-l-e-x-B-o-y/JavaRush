package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = " любит меня.";

        String name = scanner.nextLine();
        int count = 0;

        while (count < 10) {
            System.out.println(name + text);
            count++;
        }
        scanner.close();
    }
}
