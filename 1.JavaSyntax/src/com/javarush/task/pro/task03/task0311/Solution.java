package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.


Requirements:
1. Программа должна считывать два числа c клавиатуры.
2. Если числа равны, то программа должна вывести сообщение "числа равны".
3. Если числа не равны, то программа должна вывести сообщение "числа не равны".
4. Точность сравнения должна достигать одной миллионной (0.000001).
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (Math.abs(a - b) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
        scanner.close();
    }
}