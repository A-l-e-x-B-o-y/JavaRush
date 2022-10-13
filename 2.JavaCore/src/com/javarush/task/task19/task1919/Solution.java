package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> workers = new TreeMap<>();

        while (file.ready()) {
            String worker = file.readLine();
            String[] array = worker.split(" ");

            if (workers.containsKey(array[0])) {
                workers.put(array[0], workers.get(array[0]) + Double.parseDouble(array[1]));
            } else {
                workers.put(array[0], Double.parseDouble(array[1]));
            }
        }

        for (Map.Entry<String, Double> entry : workers.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        file.close();
    }
}
