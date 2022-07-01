package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(scanner.nextLine());
        List<String> text = Files.readAllLines(path);

        for (int i = 0; i < text.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(text.get(i));
            }
        }
    }
}

