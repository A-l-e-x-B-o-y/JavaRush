package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String[] array = HEX.split("");
        String hexNumber = "";

        if (decimalNumber <= 0) {
            return "";
        } else {
            while (decimalNumber != 0) {
                int x = decimalNumber % 16;
                for (int i = 0; i < array.length; i++) {
                    if (i == x) {
                        hexNumber = array[i] + hexNumber;
                        break;
                    }
                }
                decimalNumber /= 16;
            }
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        int decimalNumber = 0;
        if (hexNumber == null) {
            return decimalNumber;
        }

        String[] array = HEX.split("");
        String[] hexArray = hexNumber.split("");
        int[] hex = new int[hexArray.length];

        for (int i = 0; i < hexArray.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (hexArray[i].equals(array[j])) {
                    hex[i] = j;
                    break;
                }
            }
        }

        for (int i = 0; i < hex.length; i++) {
            decimalNumber += (hex[hex.length - 1 - i]) * (int) Math.pow(16, i);
        }

        return decimalNumber;
    }
}
