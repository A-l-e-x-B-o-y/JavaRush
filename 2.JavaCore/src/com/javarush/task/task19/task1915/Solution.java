package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file = new FileOutputStream(reader.readLine());
        PrintStream oldOut = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        testString.printSomething();
        System.setOut(oldOut);

        char[] list = byteArrayOutputStream.toString().toCharArray();
        for (int i = 0; i < list.length; i++) {
            file.write(list[i]);
        }
        System.out.println(byteArrayOutputStream);
        file.close();
        reader.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

