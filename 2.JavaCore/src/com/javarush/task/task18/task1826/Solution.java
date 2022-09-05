package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    private static FileOutputStream fileOutput;

    public static void main(String[] args) throws IOException {
        fileOutput = new FileOutputStream(args[2]);

        switch (args[0]) {
            case "-e" :
                codeFile(new FileInputStream(args[1]));
                break;
            case "-d" :
                encodeFile(new FileInputStream(args[1]));
                break;
            default :
                System.out.println("Че за лажа?:)");
        }

        fileOutput.close();
    }

    public static void codeFile(FileInputStream file) throws IOException {
        while (file.available() > 0) {
            int data = file.read();
            fileOutput.write(data >> 1);
        }
        file.close();
    }

    public static void encodeFile(FileInputStream file) throws IOException {
        while (file.available() > 0) {
            int data = file.read();
            fileOutput.write(data << 1);
        }
        file.close();
    }

}
