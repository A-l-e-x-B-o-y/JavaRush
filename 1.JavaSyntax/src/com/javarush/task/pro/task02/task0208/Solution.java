package com.javarush.task.pro.task02.task0208;

/* 
Пустота и пробелы
Заполни пробелы пустотой... или наоборот.

Используй переменную emptiness, строки с одним пробелом и конкатенацию строк, чтобы записать в переменную fullness строку "пустота пустота пустота".


Requirements:
1. Не изменяй значение переменной emptiness.
2. Переменную fullness нужно инициализировать в одну строку, используя переменную emptiness, строки с одним пробелом и конкатенацию строк.
3. Программа должна выводить на экран значение переменной fullness.
*/

public class Solution {
    public static void main(String[] args) {
        String emptiness = "пустота";

        String fullness = emptiness + " " + emptiness + " " + emptiness;

        System.out.println(fullness);
    }
}
