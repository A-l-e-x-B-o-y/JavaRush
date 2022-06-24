package com.javarush.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Оборачивание исключений
В методе copyFile перехвати исключения, которые бросают методы readFile и writeFile.
Перехваченные исключения оберни в RuntimeException и пробрось дальше.

Requirements:
1. В методе copyFile должны перехватываться FileNotFoundException и FileSystemException.
2. Все перехваченные исключения нужно оборачивать в RuntimeException и пробрасывать дальше.
3. У метода copyFile не должно быть исключений в секции throws.
*/

public class Solution {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.writeFile(destinationFile);
        } catch (FileSystemException e) {
            throw new RuntimeException(e);
        }
    }
}