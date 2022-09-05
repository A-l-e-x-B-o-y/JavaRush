package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя первого файла.");
        String fileName1 = reader.readLine();
        System.out.println("Введите имя второго файла.");
        String fileName2 = reader.readLine();

        BufferedReader file1 = new BufferedReader(new FileReader(fileName1));
        while (file1.ready()) {
            allLines.add(file1.readLine());
        }

        BufferedReader file2 = new BufferedReader(new FileReader(fileName2));
        while (file2.ready()) {
            forRemoveLines.add(file2.readLine());
        }

        new Solution().joinData();
        reader.close();
        file1.close();
        file2.close();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
