package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader(args[0]);
        int[] list = new int[256];

        while (file.ready()) {
            int symbol = file.read();
            list[symbol] += 1;
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] > 0) {
                System.out.println((char) i + " " + list[i]);
            }
        }

        file.close();
    }
}
