package com.javarush.task.pro.task08.task0802;

/* 
Утильный класс: часть 2
Исправь методы класса Solution, используя класс Math:

sqrt(double) — должен возвращать квадратный корень переданного аргумента.
cbrt(double) — должен возвращать кубический корень переданного аргумента.
pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.

Requirements:
1. Реализуй метод sqrt(double) согласно условию.
2. Реализуй метод cbrt(double) согласно условию.
3. Реализуй метод pow(int, int) согласно условию.
*/

public class Solution {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        return Math.pow(number, power);
    }
}
