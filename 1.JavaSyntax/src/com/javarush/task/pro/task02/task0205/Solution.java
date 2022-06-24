package com.javarush.task.pro.task02.task0205;

/* 
Когда-то было 32 зуба
Используя только оператор декремента, измени значение переменной toothCounter, чтобы на экран вывелось число 23.

Requirements:
1. Не изменяй команду объявления переменной toothCounter.
2. К переменной toothCounter нужно применить несколько команд декремента, чтобы она изменила значение на 23.
3. Программа должна выводить на экран переменную toothCounter со значением 23.
*/

public class Solution {

    public static void main(String[] args) {
        int toothCounter = 32;

        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        System.out.println(toothCounter);
    }
}
