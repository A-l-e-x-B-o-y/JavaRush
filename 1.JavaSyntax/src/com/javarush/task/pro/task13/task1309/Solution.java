package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение -
его средняя оценка. Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их средней оценкой в коллекцию grades.
Значения можешь выбрать любые.

Requirements:
1. В классе Solution нужно инициализировать публичное статическое поле grades типа HashMap<String, Double>.
2. В классе Solution должен быть публичный статический метод addStudents с типом возвращаемого значения void.
3. Метод addStudents должен добавлять 5 студентов со средней оценкой в поле grades.
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Петров", 4.6);
        grades.put("Иванов", 4.1);
        grades.put("Сидоров", 3.4);
        grades.put("Васечькин", 4.9);
        grades.put("Крюков", 4.5);
    }
}
