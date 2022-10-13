package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> listNames = new HashMap<>();
        Double maxSum = 0.0;

        // read all values from file
        while (file.ready()) {
            String[] array = file.readLine().split(" ");

            if (listNames.containsKey(array[0])) {
                listNames.put(array[0], (listNames.get(array[0]) + Double.parseDouble(array[1])));
                if (listNames.get(array[0]) > maxSum) maxSum = listNames.get(array[0]);
            } else {
                listNames.put(array[0], Double.parseDouble(array[1]));
                if (listNames.get(array[0]) > maxSum) maxSum = listNames.get(array[0]);
            }
        }

        Set<String> names = new TreeSet<>();

        // add to list all names with maximum sum
        for (Map.Entry<String, Double> human : listNames.entrySet()) {
            if (human.getValue().equals(maxSum)) {
                names.add(human.getKey());
            }
        }

        // print on screen
        for (String name : names) {
            System.out.println(name);
        }

        file.close();
    }
}
