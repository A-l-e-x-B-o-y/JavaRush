package com.javarush.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Прощай, Паскаль
В методе main найди и удали язык программирования Pascal из списка programmingLanguages.

Requirements:
1. В методе main должен удаляться Pascal из списка programmingLanguages.
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        for (int i = 0; i < programmingLanguages.size(); i++) {
            if (programmingLanguages.get(i).equals("Pascal")) {
                programmingLanguages.remove(i);
                i--;
            }
        }

        //System.out.println(programmingLanguages.toString());
    }
}
