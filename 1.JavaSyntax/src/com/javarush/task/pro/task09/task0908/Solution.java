package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    static String[] hex = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    static String[] binary = new String[] {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";

        if (binaryNumber.equals("")) return "";
        if (binaryNumber == null) return ""; // Проверка на пустую строку
        while (binaryNumber.length() % 4 != 0) { // Добавление 0-ей для кратности числа 4
            binaryNumber = "0" + binaryNumber;
        }

        String[] temp = binaryNumber.split("");
        int[] tempInt = new int[temp.length];
        for (int i = 0; i < temp.length; i++) { // Преобразование массива String в int
            tempInt[i] = Integer.parseInt(temp[i]);
            if (tempInt[i] > 1 || tempInt[i] < 0) return null; // Проверка двоичного числа на 0 и 1
        }

        String[] tempBinary = new String[temp.length / 4];

        int a = 0, b = 4;
        for (int i = 0; i < tempBinary.length; i++) { // Разбиение строки на группы по 4 числа
            tempBinary[i] = "";
            for (int j = a; j < b; j++) {
                tempBinary[i] += temp[j];
            }
            a += 4;
            b += 4;
        }

        for (int i = 0; i < tempBinary.length; i++) {
            for (int j = 0; j < binary.length; j++) {
                if (tempBinary[i].equals(binary[j])) {
                    hexNumber += hex[j];
                    break;
                }
            }
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null || hexNumber.equals("")) return "";

        String[] tempBinary = hexNumber.split("");
        for (int i = 0; i < tempBinary.length; i++) {
            for (int j = 0; j < binary.length; j++) {
                if (tempBinary[i].equals(hex[j])) {
                    binaryNumber += binary[j];
                    break;
                }
            }
        }
        return binaryNumber;
    }
}
