package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream oldOut = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        testString.printSomething();
        stringToByteArray(byteArrayOutputStream);
        System.setOut(oldOut);

        System.out.println(byteArrayOutputStream);
    }

    private static void stringToByteArray(ByteArrayOutputStream byteArray) {
        String[] arrayStrings = byteArray.toString().split("\\n");
        byteArray.reset();

        for (int i = 1; i < arrayStrings.length+1; i++) {
            if (i % 2 == 0) {
                System.out.println(arrayStrings[i-1]);
                System.out.println("JavaRush - курсы Java онлайн");
            } else {
                System.out.println(arrayStrings[i-1]);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
