package com.javarush.task.task19.task1902;

import java.io.FileOutputStream;
import java.io.IOException;

/* 
Адаптер
*/

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fileOutputStream;


    public AdapterFileOutputStream(FileOutputStream file) {
        fileOutputStream = file;
    }

    public static void main(String[] args) {
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        char [] string = s.toCharArray();
        byte[] text = new byte[string.length];

        for (int i = 0; i < string.length; i++) {
            text[i] = (byte) string[i];
        }

        fileOutputStream.write(text);
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }
}

