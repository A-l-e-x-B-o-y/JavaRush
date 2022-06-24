package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.

Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2

b) при вводе чисел 2 2 2 получим вывод 2 2 2

Requirements:
1. Программа должна считывать три числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести их на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 == number2) {
            if (number2 == number3) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else {
                System.out.println(number1 + " " + number2);
            }
        } else if (number2 == number3) {
            if (number1 == number2) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else {
                System.out.println(number3 + " " + number2);
            }
        } else if (number1 == number3) {
            if (number1 == number2) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else {
                System.out.println(number3 + " " + number1);
            }
        }
        scanner.close();
    }
}
