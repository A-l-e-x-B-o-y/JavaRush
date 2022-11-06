package com.javarush.task.task31.task3101;

import java.io.*;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File folder = new File(args[0]);
        File resultFileAbsolutePath  = new File(args[1]);
        File newResult = new File(resultFileAbsolutePath.getParent() + File.separator + "allFilesContent.txt");

        if (FileUtils.isExist(newResult)) {
            FileUtils.deleteFile(newResult);
        }
        FileUtils.renameFile(resultFileAbsolutePath, newResult);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newResult, true))) {
            compare(folder, writer);
        }
    }

    public static void writer(File file, BufferedWriter writer) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
            while (reader.ready()) {
                writer.write(reader.readLine());
            }

        reader.close();
        writer.write("\n");
        writer.flush();
    }

    public static void compare(File dir, BufferedWriter writer) throws IOException {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                compare(new File(dir + File.separator + file.getName()), writer);
            } else {
                if (file.length() <= 50) writer(file, writer);
            }
        }
    }

}
