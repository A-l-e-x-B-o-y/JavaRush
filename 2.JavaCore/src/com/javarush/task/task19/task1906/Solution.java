package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader(System.in));
        String fileName1 = scanner.readLine();
        String fileName2 = scanner.readLine();
        scanner.close();

        FileReader fileInput = new FileReader(fileName1);
        FileWriter fileOutput = new FileWriter(fileName2);
        ArrayList<Integer> list = new ArrayList<>();

        while (fileInput.ready()) {
            list.add(fileInput.read());
        }

        list.remove(0);

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                fileOutput.write(list.get(i));
            }
        }

        fileInput.close();
        fileOutput.close();
    }
}
