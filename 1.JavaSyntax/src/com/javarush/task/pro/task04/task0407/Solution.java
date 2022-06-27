package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
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