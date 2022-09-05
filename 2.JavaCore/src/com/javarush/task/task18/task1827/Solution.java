package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathName = reader.readLine();
        BufferedWriter file = new BufferedWriter(new FileWriter(pathName, true));
        FileReader inputFile = new FileReader(pathName);

        if (args.length != 0) {
            if (args[0].equals("-c")) {
                if (inputFile.ready()) {
                    file.newLine();
                }

                file.write(getId(inputFile) + getProductName(args) + getPrice(args) + getQuantity(args));
            }
        }

        file.close();
        inputFile.close();
    }

    public static String getProductName(String[] file) {
        int count = 30 - file[1].length();
        String productName = file[1];

        for (int i = 0; i < count; i++) {
            productName += " ";
        }
        return productName;
    }

    public static String getPrice(String[] file) {
        int count = 8 - file[2].length();
        String price = file[2];

        for (int i = 0; i < count; i++) {
            price += " ";
        }
        return price;
    }

    public static String getQuantity(String[] file) {
        int count = 4 - file[3].length();
        String quantity = file[3];

        for (int i = 0; i < count; i++) {
            quantity += " ";
        }
        return quantity;
    }

    public static String getId(FileReader file) {
        Scanner scanner = new Scanner(file);
        int maxId = 0;

        while (scanner.hasNext()) {
            String string = scanner.nextLine().substring(0, 8).replace(" ", "");
            int id = Integer.parseInt(string);

            if (id > maxId) maxId = id;
        }

        String id = String.valueOf(maxId + 1);
        int length = 8 - id.length();

        for (int i = 0; i < length; i++) {
            id += " ";
        }

        return id;
    }
}
