package com.javarush.task.task20.task2004;

import java.io.*;
import java.util.Properties;

/* 
Читаем и пишем в файл статики
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {

            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();

            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;

            loadedObject.save(outputStream);

            ClassWithStatic objectClass = new ClassWithStatic();
            objectClass.load(inputStream);
            System.out.println(loadedObject.equals(objectClass));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class ClassWithStatic {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            Properties properties = new Properties();
            properties.setProperty("staticString", this.staticString);
            properties.setProperty("i", String.valueOf(this.i));
            properties.setProperty("j", String.valueOf(this.j));
            properties.store(outputStream, null);
        }

        public void load(InputStream inputStream) throws Exception {
            Properties properties = new Properties();
            properties.load(inputStream);

            this.staticString = properties.getProperty("staticString");
            this.i = Integer.parseInt(properties.getProperty("i"));
            this.j = Integer.parseInt(properties.getProperty("j"));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassWithStatic that = (ClassWithStatic) o;

            if (i != that.i) return false;
            return j == that.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
