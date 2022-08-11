package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        List<String> listValues = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        url = url.substring(url.indexOf("?")+1);

        for (String info : url.split("&")) {
            if (info.contains("=")) {
                if (info.contains("obj")) {
                    listValues.add(info.substring(info.indexOf("=")+1));
                }
                info = info.substring(0, info.indexOf("="));
                list.add(info);
            } else {
                list.add(info);
            }
        }

        for (String string : list) {
            System.out.print(string + " ");
        }
        System.out.println();

        for (String value : listValues) {
            try {
                alert(Double.parseDouble(value));
            } catch (Exception e) {
                alert(value);
            }
        }

        /*for (String value : listValues) {
            if (value.matches("\\d*\\.\\d+")) {
                alert(Double.parseDouble(value));
            } else {
                alert(value);
            }
        }*/
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
