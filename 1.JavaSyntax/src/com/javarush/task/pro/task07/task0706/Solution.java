package com.javarush.task.pro.task07.task0706;

/* 
Странное деление
В методе main вызови метод div() с таким аргументом, чтобы вывод в консоли был "NaN".
Код метода div() изменять нельзя.


Requirements:
1. В методе main() должен вызываться метод div().
2. Результатом вызова метода div() должен быть вывод в консоли "NaN".
3. Код метода div() не изменяй.
*/

public class Solution {
    public static void main(String[] args) {
        div(0.0, 0.0);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
