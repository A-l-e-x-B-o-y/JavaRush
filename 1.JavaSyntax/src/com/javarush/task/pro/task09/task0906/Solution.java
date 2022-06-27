package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        if (decimalNumber <= 0) {
            binaryNumber = "";
        } else {
            while (decimalNumber != 0) {
                binaryNumber = decimalNumber % 2 + binaryNumber;
                decimalNumber /= 2;
            }
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        int decimalNumber = 0;

        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return decimalNumber;
        } else {
            String[] arrayString = binaryNumber.split("");
            int[] arrayByte = new int[arrayString.length];

            for (int i = 0; i < arrayString.length; i++) {
                arrayByte[i] = Integer.parseInt(arrayString[arrayString.length-1-i]);
            }

            for (int i = 0; i < arrayByte.length; i++) {
                decimalNumber = decimalNumber + arrayByte[i] * (int) (Math.pow(2, i));
            }
        }
        return decimalNumber;
    }
}
