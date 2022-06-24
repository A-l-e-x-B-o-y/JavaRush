package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
Давай разделим ящик колы на кабинет программистов. Для этого напишем программу, в которой:

Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике. Второе - количество людей в кабинете.
Вывести на экран результат деления первого числа на второе.
Результатом должно быть вещественное число.
Пример ввода:
3
2

Пример вывода:
1.5


Requirements:
1. Программа должна считывать целые числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран вещественное число - результат деления первого введенного целого числа на второе.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBottle = scanner.nextInt();
        int people = scanner.nextInt();

        double sum = (countBottle * 1.0) / people;
        System.out.println(sum);
        scanner.close();
    }
}