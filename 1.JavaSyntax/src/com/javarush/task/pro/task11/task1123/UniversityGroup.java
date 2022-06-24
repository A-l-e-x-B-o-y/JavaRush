package com.javarush.task.pro.task11.task1123;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Почувствуй себя деканом
У нас есть группа в университете и метод, который должен отчислять конкретного студента, но он почему-то не работает.
Твоя задача — найти ошибку и исправить, чтобы метод exclude смог отчислить студента.

Requirements:
1. В классе UniversityGroup должно быть публичное не статическое поле students типа List<String>.
2. В классе UniversityGroup должен быть публичный не статический метод exclude(String) с типом возвращаемого значения void.
3. Метод exclude должен удалять из списка переданного студента.
*/

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        List<String> copyList = new ArrayList<String>(students);

        for (String student : copyList) {
            if (student.equals(excludedStudent)) {
                students.remove(student);
            }
        }
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
        universityGroup.students.forEach(System.out::println);
    }
}