package com.javarush.task.pro.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemNotFoundException;

/* 
Распаковка исключений
В методе main перехвати RuntimeException. Определи, какое исключение в нем сохранено.
Если это FileNotFoundException, выведи в консоли сообщение: "Не удалось прочесть файл.", а если FileSystemException — "Не удалось записать в файл.".

Requirements:
1. В методе main должно перехватываться RuntimeException.
2. Нужно вывести "Не удалось прочесть файл.", если в RuntimeException упаковано FileNotFoundException.
3. Нужно вывести "Не удалось записать в файл.", если в RuntimeException упаковано FileSystemException.
4. Класс FileManager не изменяй.
*/

public class Solution {

    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        } catch (RuntimeException e) {
            Throwable temp = e.getCause();
            if (temp instanceof FileNotFoundException) {
                System.out.println(FAILED_TO_READ);
            } else if (temp instanceof FileSystemException){
                System.out.println(FAILED_TO_WRITE);
            }
        }
    }
}
