package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
Тебе нужно написать программу, которая:

Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.

Requirements:
1. Программа должна считывать число N и за ним еще N чисел.
2. В классе должен быть метод public static void main(String[]).
3. Нельзя добавлять новые методы в класс Solution.
4. Программа должна выводить введенные N чисел в обратном порядке, если N чётное.
5. Программа должна выводить введенные N чисел в том же порядке, если N нечётное.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        if (N > 0) {
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
        }

        if (N % 2 == 0) {
            for (int i = N-1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = 0; i < N; i++) {
                System.out.println(array[i]);
            }
        }

        scanner.close();
    }
}