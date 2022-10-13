package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream oldOut = System.out;
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(arrayOutputStream));

        testString.printSomething();

        System.setOut(oldOut);
        System.out.println(arrayOutputStream.toString().toUpperCase());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
