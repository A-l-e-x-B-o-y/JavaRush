package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.

Пример вывода:
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ


Requirements:
1. Программа должна выводить текст на экран.
2. Программа должна выводить прямоугольник высотой 5 и шириной 10, заполненный буквами 'Q'.
3. В программе необходимо использовать вложенные циклы while (цикл в цикле).
4. Вывод на экран должен происходить в цикле while.
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;

        while (i < 5) {
            int j = 0;
            while (j < 10) {
                System.out.print("Q");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}