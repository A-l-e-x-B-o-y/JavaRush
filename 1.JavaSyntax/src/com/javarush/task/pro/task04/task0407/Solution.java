package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.

Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.


Requirements:
1. Программа должна вывести в консоль сумму всех чисел от 1 до 100 включительно, не кратных 3.
2. В программе необходимо использовать цикл while.
3. В программе необходимо использовать оператор continue.
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1, count = 0;

        while (i < 101) {
            if (i % 3 == 0) {
                i++;
                continue;
            } else {
                count += i;
            }
            i++;
        }
        System.out.println(count);
    }
}