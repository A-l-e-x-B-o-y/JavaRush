package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц, а если передан последний месяц, возвращать первый. Используй методы values и ordinal.
Метод main не участвует в проверке.


Requirements:
1. Реализуй метод public static Month getNextMonth(Month): он должен работать согласно условию.
2. В методе getNextMonth должны использоваться методы ordinal() и values().
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int index = month.ordinal();
        Month[] arrayMonth = Month.values();

        for (int i = 0; i < arrayMonth.length; i++) {
            if (i == index) {
                index++;
                break;
            }
        }

        if (index == 12) index = 0;
        return arrayMonth[index];
    }
}
