package com.javarush.task.pro.task03.task0309;

import java.util.Scanner;

/* 
Ищем максимум
У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них. Если числа одинаковые, то выводится любое.
Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.


Requirements:
1. Программа должна считывать два числа c клавиатуры.
2. Вместо оператора if-else в программе нужно использовать тернарный оператор.
3. Функционал программы не должен измениться.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int result = numberA > numberB ? numberA : numberB;
        System.out.println(result);
        scanner.close();
    }
}
