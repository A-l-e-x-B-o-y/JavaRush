package com.javarush.task.pro.task02.task0212;

/* 
Попрошу регистр на меня не повышать!
В методе main на экран выводятся три строки.
Внеси изменения в код, чтобы все буквы в этих строках стали заглавными.


Requirements:
1. Не изменяй значения переменных caps и usa.
2. У трех строк, переданных в метод println, вызови метод toUpperCase.
3. Вывод программы должен содержать три строки.
*/

public class Solution {

    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";

        System.out.println(usa.toUpperCase());
        System.out.println("Винни Пух".toUpperCase());
        System.out.println(caps.toUpperCase() + "they know I mean business".toUpperCase());
    }
}
