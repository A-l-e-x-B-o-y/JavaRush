package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
Для решения этой задачи нужно:

Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения (отбросить дробную часть, округлив вниз до целого числа).
В качестве значения pi используй 3.14.

Пример ввода:
5

Пример вывода:
78


Requirements:
1. Программа должна считывать целое число c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран площадь круга радиусом radius, приведенную к целому числу.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double S = 3.14 * radius * radius;

        System.out.println((int) S);
        scanner.close();
    }
}