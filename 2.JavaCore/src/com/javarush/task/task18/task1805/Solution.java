package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());

        Set<Integer> set = new TreeSet<>();
        while (file.available() > 0) {
            set.add(file.read());
        }

        List<Integer> sorted_list = new ArrayList<>(new TreeSet<>(set));
        for (Integer value : sorted_list) {
            System.out.print(value + " ");
        }
        reader.close();
        file.close();
    }
}
