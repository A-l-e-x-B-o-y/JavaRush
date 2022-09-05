package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String fileName;

        while (!(fileName = reader.readLine()).equals("end")) { // Записываю с клавиатуры части файла в коллекцию
            if (fileName.contains(".part")) list.add(fileName);
        }

        reader.close();  // Закрываю поток ввода с клавиатуры
        Collections.sort(list);  // Сортирую коллекцию по возрастанию
        String[] partsFileName = list.get(0).split(".part"); // Выделяю название файла

        FileOutputStream fileWriter = new FileOutputStream(partsFileName[0]); // Создаю поток ввода записи в файл

        for (int i = 0; i < list.size(); i++) {  // Поочередно записываю все файлы с коллекции в новый файл
            FileInputStream fileReader = new FileInputStream(list.get(i));
            byte[] buffer = new byte[fileReader.available()];

            while (fileReader.available() > 0) {  // Построково копирую инфу в файл
                int count = fileReader.read(buffer);
                fileWriter.write(buffer, 0, count);
            }

            fileReader.close();  // Закрываю каждый поток для чтения
        }

        fileWriter.close(); // Закрываю поток для записи
    }
}
