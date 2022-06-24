package com.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* 
ArrayList vs HashMap
В классе Solution есть метод getProgrammingLanguages, который возвращает список языков программирования.
Тебе нужно переписать этот метод, чтобы он возвращал HashMap<Integer, String>. Ключом в этой коллекции будет индекс элемента в ArrayList.

Requirements:
1. В классе Solution должен быть публичный статический метод getProgrammingLanguages с типом возвращаемого значения HashMap<Integer, String>.
2. Метод getProgrammingLanguages() должен возвращать HashMap заполненным в соответствии с списком.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> languages = new HashMap<>();
        ArrayList<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");

        for (int i = 0; i < programmingLanguages.size(); i++) {
            languages.put(i, programmingLanguages.get(i));
        }

        return languages;
    }

}
