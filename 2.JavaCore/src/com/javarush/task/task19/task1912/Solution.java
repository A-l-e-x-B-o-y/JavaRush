package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream oldOut = System.out;
        ByteArrayOutputStream byteArrayInputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayInputStream));

        testString.printSomething();
        System.setOut(oldOut);

        System.out.println(byteArrayInputStream.toString().replaceAll("te", "??"));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
