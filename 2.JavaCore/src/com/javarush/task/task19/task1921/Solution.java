package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));

        while (file.ready()) {
            StringBuilder stringBuilder = new StringBuilder();
            String string = file.readLine();
            String[] array = string.split(" ");

            int year = 0;
            int month = 0;
            int day = 0;

            for (String word : array) {
                if (word.matches("\\D+")) {
                    stringBuilder.append(word + " ");
                } else if (word.matches("\\d+") && day == 0) {
                    day = Integer.parseInt(word);
                } else if (word.matches("\\d+") && month == 0) {
                    month = Integer.parseInt(word);
                } else if (word.matches("\\d+") && year == 0) {
                    year = Integer.parseInt(word);
                }
            }

            PEOPLE.add(new Person(stringBuilder.replace(stringBuilder.length()-1, stringBuilder.length(), "").toString(),
                    (new Date(year-1900, month-1, day))));
        }

        file.close();
    }
}
