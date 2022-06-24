package com.javarush.task.pro.task02.task0210;

/* 
С каждым разом огромнее
В переменную hugeAmount нужно записать число 100500.
Используй переменные bigAmount, greatAmount и преобразование строки в число.
Для объявления и инициализации hugeAmount используй одну команду.


Requirements:
1. Не изменяй значения переменных bigAmount и greatAmount.
2. Для инициализации переменной hugeAmount используй bigAmount, greatAmount и метод Integer.parseInt(String).
3. Программа должна выводить на экран переменную hugeAmount.
*/

public class Solution {

    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount);

        System.out.println(hugeAmount);
    }
}
