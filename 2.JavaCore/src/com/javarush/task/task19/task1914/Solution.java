package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream oldOut = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        testString.printSomething();
        System.setOut(oldOut);

        String[] list = byteArrayOutputStream.toString().split(" ");

        switch (list[1]) {
            case "+" :
                System.out.println(byteArrayOutputStream.toString().concat(String.valueOf(Integer.parseInt(list[0]) + Integer.parseInt(list[2]))));
                break;
            case "-" :
                System.out.println(byteArrayOutputStream.toString().concat(String.valueOf(Integer.parseInt(list[0]) - Integer.parseInt(list[2]))));
                break;
            case "*" :
                System.out.println(byteArrayOutputStream.toString().concat(String.valueOf(Integer.parseInt(list[0]) * Integer.parseInt(list[2]))));
                break;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

