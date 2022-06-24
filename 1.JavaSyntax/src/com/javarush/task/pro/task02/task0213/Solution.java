package com.javarush.task.pro.task02.task0213;

/* 
Причешем резюме
Метод main выводит на экран четыре строки. Все они - яркий пример злоупотребления заглавными буквами.
Внеси изменения в код, чтобы все буквы в этих строках стали строчными.


Requirements:
1. Не изменяй значения переменных title, degree и career.
2. У четырех строк, переданных в метод println, нужно вызвать метод toLowerCase.
3. Вывод программы должен содержать четыре строки.
*/

public class Solution {

    public static void main(String[] args) {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        //напишите тут ваш код
        System.out.println("RESUME".toLowerCase());
        System.out.println("TITLE: ".toLowerCase() + title.toLowerCase());
        System.out.println("DEGREE: ".toLowerCase() + degree.toLowerCase());
        System.out.println("CAREER: ".toLowerCase() + career.toLowerCase());
    }
}
