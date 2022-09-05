package com.javarush.task.task18.task1816;

import java.io.*;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader(args[0]);
        int count = 0;


        while (file.ready()) {
            int data = file.read();
            if ((data >= 65 && data <= 90) || (data >= 97 && data <= 122)) count++;
        }

        System.out.println(count);
        file.close();
    }
}
