package com.javarush.task.pro.task04.task0401;

/* 
Я никогда не буду работать за копейки
Используя цикл while вывести на экран сто раз цитату (переменная quote):
«Я никогда не буду работать за копейки. Амиго»

Каждое значение вывести с новой строки.


Requirements:
1. Программа должна выводить текст на экран.
2. Программа должна выводить на экран 100 раз содержимое переменной quote.
3. В программе необходимо использовать цикл while.
*/

public class Solution {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int count = 0;

        while (count < 100) {
            System.out.println(quote);
            count++;
        }

    }
}