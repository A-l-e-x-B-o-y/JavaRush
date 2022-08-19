package com.javarush.task.task16.task1630;

import java.io.*;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        BufferedReader file;
        String result = "";
        @Override
        public void setFileName(String fullFileName) {
            try {
                file = new BufferedReader(new FileReader(fullFileName));
            } catch (FileNotFoundException e) {
                System.out.println("Что-то пошло не так.");
            }
        }

        @Override
        public String getFileContent() {
            if (result == null) {
                return "";
            } else {
                return result;
            }
        }

        @Override
        public void run() {
            String str = "";
            while (true) {
                try {
                    if (!((str = file.readLine()) != null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                result += str + " ";
            }
        }
    }
}
