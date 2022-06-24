package com.javarush.task.pro.task02.task0211;

/* 
Получение длины строки
В методе main на экран выводятся значения трех строк.
Внеси изменения в код, чтобы вместо значений строк вывелась длина каждой строки.


Requirements:
1. Не изменяй значение переменной emptyString.
2. У трех строк, переданных в метод println, нужно вызвать метод length.
3. Программа должна вывести на экран три числа, каждое - с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        String emptyString = "";

        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}
