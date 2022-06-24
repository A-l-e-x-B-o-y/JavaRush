package com.javarush.task.pro.task02.task0203;

/* 
Последняя цифра числа
В переменной number записано число.
В переменную lastDigit нужно записать последнюю цифру этого числа.
Для вычисления используй переменную number и оператор «остаток от деления».
Для объявления и инициализации lastDigit используй одну команду.

Подсказка: делить нужно на 10.


Requirements:
1. Не изменяй значение переменной number.
2. Для вычисления lastDigit должны использоваться number и оператор «остаток от деления».
3. Программа должна выводить на экран значение переменной lastDigit.
*/

public class Solution {

    public static void main(String[] args) {
        int number = 546;

        int lastDigit = number % 10;

        System.out.println(lastDigit);
    }
}