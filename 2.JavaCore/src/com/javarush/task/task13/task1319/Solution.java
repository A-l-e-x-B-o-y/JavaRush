package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathName = reader.readLine();
        BufferedWriter note = new BufferedWriter(new FileWriter(pathName));

        while (true) {
            String text = reader.readLine();
            if (text.equals("exit")) {
                note.write(text);
                break;
            } else {
                note.write(text + "\n");
            }
        }

        reader.close();
        note.close();
    }
}
