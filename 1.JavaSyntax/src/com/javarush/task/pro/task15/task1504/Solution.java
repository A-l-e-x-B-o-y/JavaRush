package com.javarush.task.pro.task15.task1504;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (InputStream inputFile = Files.newInputStream(Paths.get(scanner.nextLine()));
            OutputStream outputFile = Files.newOutputStream(Paths.get(scanner.nextLine()))) {
            while (inputFile.available() > 0) {
                byte[] file = new byte[2];
                int real = inputFile.read(file);
                if (file[1] != 0) {
                    byte temp = file[0];
                    file[0] = file[1];
                    file[1] = temp;
                }
                outputFile.write(file, 0, real);
            }
        } catch (Exception e) {
            System.out.println("Не корректный путь к файлу!");
        }
    }
}

