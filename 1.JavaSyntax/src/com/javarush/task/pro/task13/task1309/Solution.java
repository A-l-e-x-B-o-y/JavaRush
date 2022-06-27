package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
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
