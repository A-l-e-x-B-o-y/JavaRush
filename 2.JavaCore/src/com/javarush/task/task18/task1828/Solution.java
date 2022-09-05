package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы 2
*/

public class Solution {
    public static BufferedWriter file;
    public static BufferedReader inputFile;
    public static String pathName;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        pathName = reader.readLine();
        reader.close();

        file = new BufferedWriter(new FileWriter(pathName, true));
        inputFile = new BufferedReader(new FileReader(pathName));

        if (args.length != 0) {
            switch (args[0]) {
                case "-c" :
                    if (inputFile.ready()) {
                        file.newLine();
                    }

                    file.write(getNewId(inputFile) + getProductName(args[1]) + getPrice(args[2]) + getQuantity(args[3]));
                    break;
                case "-d" :
                    uninstallProduct(args[1]);
                    break;
                case "-u" :
                    updateProduct(args);
                    break;
            }
        }

        file.close();
        inputFile.close();
    }

    public static void updateProduct(String[] args) throws IOException {
        List<String> temp = new ArrayList<>();

        while (inputFile.ready()) {
            temp.add(inputFile.readLine());
        }

        for (int i = 0; i < temp.size(); i++) {
            String id = temp.get(i).substring(0, 8).replace(" ", "");

            if (id.equals(args[1])) {
                temp.remove(i);
                temp.add(i, (getId(args[1]) + getProductName(args[2]) + getPrice(args[3]) + getQuantity(args[4])));
            }
        }

        file.close();
        file = new BufferedWriter(new FileWriter(pathName));

        for (int i = 0; i < temp.size(); i++) {
            if (i == temp.size()-1) {
                file.write(temp.get(i));
                break;
            } else {
                file.write(temp.get(i));
                file.newLine();
            }
        }
    }

    public static void uninstallProduct(String newId) throws IOException {
        List<String> temp = new ArrayList<>();

        while (inputFile.ready()) {
            temp.add(inputFile.readLine());
        }

        for (int i = 0; i < temp.size(); i++) {
            String id = temp.get(i).substring(0, 8).replace(" ", "");

            if (id.equals(newId)) {
                temp.remove(i);
                i--;
            }
        }

        file.close();
        file = new BufferedWriter(new FileWriter(pathName));

        for (int i = 0; i < temp.size(); i++) {
            if (i == temp.size()-1) {
                file.write(temp.get(i));
                break;
            } else {
                file.write(temp.get(i));
                file.newLine();
            }
        }
    }

    public static String getProductName(String product) {
        int count = 30 - product.length();

        for (int i = 0; i < count; i++) {
            product += " ";
        }
        return product;
    }

    public static String getPrice(String price) {
        int count = 8 - price.length();

        for (int i = 0; i < count; i++) {
            price += " ";
        }
        return price;
    }

    public static String getQuantity(String quantity) {
        int count = 4 - quantity.length();

        for (int i = 0; i < count; i++) {
            quantity += " ";
        }
        return quantity;
    }

    public static String getId(String id) {
        int length = 8 - id.length();

        for (int i = 0; i < length; i++) {
            id += " ";
        }
        return id;
    }

    public static String getNewId(BufferedReader file) {
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
