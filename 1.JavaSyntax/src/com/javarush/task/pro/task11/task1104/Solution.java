package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";

        Double number = Double.parseDouble(string);
        System.out.println(Math.round(number));
    }
}
