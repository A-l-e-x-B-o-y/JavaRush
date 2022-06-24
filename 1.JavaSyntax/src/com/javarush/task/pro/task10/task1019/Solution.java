package com.javarush.task.pro.task10.task1019;

import java.util.Calendar;

/* 
Текущий год
В классе Solution есть поле currentYear, которое должно инициализироваться значением текущего года(Calendar.getInstance().get(Calendar.YEAR)) при создании нового объекта типа Solution.
Тебе нужно найти ошибку и исправить её, чтобы при создании объекта класса Solution поле currentYear правильно инициализировалось.

Requirements:
1. В классе Solution должно быть приватное не статическое поля currentYear типа int.
2. В классе Solution должен быть геттер getCurrentYear для поля currentYear.
3. При создании объекта класса Solution, currentYear должно инициализироваться значением текущего года (используй метод Calendar.getInstance().get(Calendar.YEAR)).
*/

public class Solution {

    private int currentYear;

    public Solution() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCurrentYear());
        System.out.println(solution.currentYear);
    }
}
