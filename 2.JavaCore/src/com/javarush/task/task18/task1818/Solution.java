package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter file1 = new BufferedWriter(new FileWriter(reader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file3 = new BufferedReader(new FileReader(reader.readLine()));

        while (file2.ready()) {
            file1.write(file2.readLine());
        }

        while (file3.ready()) {
            file1.write(file3.readLine());
        }

        file1.close();
        file2.close();
        file3.close();

    }
}
