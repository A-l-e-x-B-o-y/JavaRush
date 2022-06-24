package com.javarush.task.pro.task02.task0202;

/* 
Полнометражная картина
В переменной centimeters записано количество сантиметров.
В переменную meters нужно записать количество полных метров в centimeters (1 метр = 100 см).
Для вычисления используй переменную centimeters и оператор деления.
Для объявления и инициализации meters используй одну команду.


Requirements:
1. Не изменяй значение переменной centimeters.
2. Для вычисления meters должны использоваться centimeters и оператор деления.
3. Программа должна выводить на экран значение переменной meters.
*/

public class Solution {

    public static void main(String[] args) {
        int centimeters = 243;

        int meters = centimeters / 100; //напишите тут ваш код

        System.out.println(meters);
    }
}