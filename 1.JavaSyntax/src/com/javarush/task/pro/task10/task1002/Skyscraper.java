package com.javarush.task.pro.task10.task1002;

/* 
Построим новый жилой комплекс JavaRush Towers
Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:
Объявляет о результате постройки.
Объявляет о результате и указывает количество этажей.
Объявляет о результате и указывает застройщика.
Пример вывода:
Небоскреб построен.
Небоскреб построен. Количество этажей - 50
Небоскреб построен. Застройщик - JavaRushDevelopment

Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.
Метод main не участвует в тестировании.

Requirements:
1. В классе Skyscraper должно быть три публичных конструктора.
2. В классе Skyscraper должен быть конструктор без параметров.
3. В классе Skyscraper должен быть конструктор с параметром типа int.
4. В классе Skyscraper должен быть конструктор с параметром типа String.
5. В конструкторе без параметров вывод должен соответствовать примеру из условия.
6. В конструкторе с параметром типа int вывод должен соответствовать примеру из условия.
7. В конструкторе с параметром типа String вывод должен соответствовать примеру из условия.
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int cont) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + cont);
    }

    public Skyscraper(String name) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + name);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

