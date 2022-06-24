package com.javarush.task.pro.task08.task0804;

/* 
Randomizer
В этой задаче тебе предстоит реализовать метод generateNumber(), который будет возвращать случайное число от 0 до 99.
В методе generateNumber() используй метод Math.random().

Requirements:
1. В классе Solution должен быть публичный статический метод generateNumber() с типом возвращаемого значения int.
2. Реализуй метод generateNumber() согласно условию.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        int x = (int) (Math.random() * 100);
        return  x;
    }
}
