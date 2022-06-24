package com.javarush.task.pro.task03.task0303;

import java.util.Scanner;

/* 
Школа или институт
Есть программа, которая принимает на вход возраст и определяет, нужно в школу или уже пора в институт. Но она работает неправильно. Например, пятилетнего ребенка отправляют в институт! Исправить программу несложно: достаточно в нужном месте поставить фигурные скобки.


Requirements:
1. Программа должна считывать число c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если возраст меньше 18 и больше либо равен 6, нужно вывести только сообщение "нужно ходить в школу".
4. Если возраст больше либо равен 18, нужно вывести только сообщение "пора в институт".
5. Если возраст меньше 6, то ничего выводить не нужно.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            if (age >= 6) {
                System.out.println("нужно ходить в школу");
            }
        } else {
            System.out.println("пора в институт");
        }
        scanner.close();
    }
}