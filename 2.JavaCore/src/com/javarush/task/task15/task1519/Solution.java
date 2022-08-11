package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value = reader.readLine();
        int tempValue = 0;

        while (!(reader.equals(value))) {
            if (value.equals("exit")) break;
            if (value.matches("\\d*\\.\\d+") || value.matches("-\\d*\\.\\d+")) {
                    print(Double.parseDouble(value));
            } else if (value.matches("\\d*") || value.matches("-\\d*"))   {
                tempValue = Integer.parseInt(value);

                if (tempValue > 0 && tempValue < 128) {
                    print((short) tempValue);
                } else if (tempValue <= 0 || tempValue >= 128) {
                    print(tempValue);
                }
            }else {
                print(value);
            }

            value = reader.readLine();
        }

        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
