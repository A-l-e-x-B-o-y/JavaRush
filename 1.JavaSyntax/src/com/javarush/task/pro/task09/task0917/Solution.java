package com.javarush.task.pro.task09.task0917;

/* 
String pool
Метод equal(String, String) сравнивает строки по ссылке, используя оператор ==.
Нужно сделать так, чтобы метод возвращал true, если содержимое строк одинаковое, и false — если разное, не используя метод equals().

Requirements:
1. Нужно, чтобы в методе equal(String, String) строки сравнивались по содержимому, но используя оператор ==.
2. Нужно, чтобы метод equal(String, String) возвращал true, если строки одинаковые.
3. Нужно, чтобы метод equal(String, String) возвращал false, если строки разные.
4. Метод equals() использовать нельзя.
*/

public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        String first1 = first.intern();
        String second1 = second.intern();
        if (first1 == second1) return true;
        else return false;
    }
}