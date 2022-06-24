package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.


Requirements:
1. Программа должна считывать две строки c клавиатуры.
2. Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
3. Если строки разные, то программа должна вывести сообщение "строки разные".
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();

        if (text1.equals(text2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
        scanner.close();
    }
}
