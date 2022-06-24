package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
Считай с клавиатуры три целых числа.
Выведи на экран их среднее арифметическое.

Пример ввода:

51
101
201
Пример вывода:

117
Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
Используй деление без остатка.


Requirements:
1. Программа должна считывать с клавиатуры три целых числа.
2. Программа должна выводить на экран среднее арифметическое считанных чисел.
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((a + b + c) / 3);
        scanner.close();
    }
}
