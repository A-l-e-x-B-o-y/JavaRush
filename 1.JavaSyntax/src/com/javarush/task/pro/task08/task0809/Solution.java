package com.javarush.task.pro.task08.task0809;

/* 
Counter
В классе Solution реализуй метод printNumbers(), который выводит числа от 1 до 10 включительно с паузой между выводом
каждого числа — 1,3 миллисекунды. В этом тебе поможет метод sleep(long, int) класса Thread, который должен сработать 9 раз.

Requirements:
1. Реализуй метод printNumbers() согласно условию.

*/
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            if (i == 10) continue;
            Thread.sleep(1, 300000);
        }
    }
}
