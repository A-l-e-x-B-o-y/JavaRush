package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
В этой задаче тебе нужно:

Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив array.
Найти максимальное число среди элементов массива.

Requirements:
1. В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов, и заполни числами с клавиатуры.
2. В методе main(String[]) выведи в консоль максимальное число среди элементов массива.
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println(max);
        scanner.close();
    }
}
