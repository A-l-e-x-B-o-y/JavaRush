package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileInput = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileOutput = new BufferedWriter(new FileWriter(reader.readLine()));

        while (fileInput.ready()) {
            fileOutput.write(fileInput.readLine().replaceAll("\\.", "!"));
        }

        reader.close();
        fileInput.close();
        fileOutput.close();
    }
}
