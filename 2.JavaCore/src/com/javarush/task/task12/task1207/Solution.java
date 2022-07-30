package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(5);
        print((Integer) 10);
    }

    public static void print(int a) {
        System.out.println("int");
    }

    public static void print(Integer a) {
        System.out.println("Integer");
    }
}
