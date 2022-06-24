package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
Чтобы выполнить эту задачу, тебе нужно:

Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива и вывести в консоль.

Requirements:
1. В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов и заполни числами с клавиатуры.
2. В методе main(String[]) выведи в консоль минимальное число среди элементов массива.
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println(min);
        scanner.close();
    }
}
