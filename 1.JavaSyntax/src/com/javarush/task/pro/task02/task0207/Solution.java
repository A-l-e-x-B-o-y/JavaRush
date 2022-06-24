package com.javarush.task.pro.task02.task0207;

/* 
Логотип решает все
В переменную tagline нужно записать строку "JustDoIt".
Используй s1, s2, s3 и конкатенацию строк.


Requirements:
1. Не изменяй значения переменных s1, s2, s3.
2. Для инициализации переменной tagline используй s1, s2, s3 и конкатенацию строк.
3. Программа должна выводить на экран значение переменной tagline.
*/

public class Solution {
    public static void main(String[] args) {
        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";

        String tagline = s3 + s1 + s2;
        System.out.println(tagline);
    }
}
