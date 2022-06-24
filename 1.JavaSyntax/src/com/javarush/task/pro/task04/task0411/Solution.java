package com.javarush.task.pro.task04.task0411;

/* 
Четные числа
Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
Каждое значение нужно выводить с новой строки.


Requirements:
1. Программа должна выводить текст на экран.
2. Программа должна выводить чётные числа от 1 до 15. Каждое значение вывести с новой строки.
3. В программе необходимо использовать цикл for.
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}