package com.javarush.task.pro.task12.task1221;

import java.util.ArrayList;
import java.util.List;

/* 
Дженерики и студенты
В классе Faculty есть метод printStudentNames(ArrayList), который принимает список объектов и выводит их имена.
Но на данный момент программа не компилируется.
Твоя задача исправить этот баг. Для этого нужно исправить сигнатуру метода printStudentNames(ArrayList),
чтобы он принимал список объектов только типа Student(используй дженерик).
Метод main не участвует в проверке.

Requirements:
1. Исправь сигнатуру метода printStudentNames, чтобы он принимал список только студентов.
2. Реализацию метода printStudentNames не изменять.
*/

public class Faculty {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Акакий"));
        students.add(new Student("Любослав"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}