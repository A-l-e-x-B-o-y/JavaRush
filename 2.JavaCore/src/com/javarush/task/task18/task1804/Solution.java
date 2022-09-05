package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());

        while (file.available() > 0) {
            int data = file.read();
            Integer value = map.get(data);
            if (value != null) {
                map.put(data, value+1);
            } else {
                map.put(data, 1);
            }
        }

        int value = 1000;
        for (Map.Entry<Integer, Integer> mapSearch : map.entrySet()) {
            if (mapSearch.getValue() < value) value = mapSearch.getValue();
        }

        for (Map.Entry<Integer, Integer> mapSearch : map.entrySet()) {
            if (mapSearch.getValue() == value) System.out.print(mapSearch.getKey() + " ");;
        }

        reader.close();
        file.close();
    }
}
