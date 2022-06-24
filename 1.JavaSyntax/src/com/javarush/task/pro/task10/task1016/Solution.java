package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
У класса City есть два поля - название города и текущая температура воздуха. Также в классе Solution есть метод showWeather:
он выводит в консоли информацию о погоде в городе, который передан в качестве аргумента метода. Реализуй метод showWeather,
который должен выводить в консоли информацию в таком формате: В городе "название города" сегодня температура воздуха "температура в городе"
В методе main один раз нужно вызвать метод showWeather с нужным аргументом.

Пример вывода:
В городе Дубай сегодня температура воздуха 40

Requirements:
1. Не изменяй класс City.
2. В классе Solution должен быть метод showWeather с параметром City.
3. Метод showWeather должен использовать геттеры класса City.
4. Метод showWeather должен выводить текст в консоли в соответствии условию.
*/

public class Solution {

    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());
    }
    public static void main(String[] args) {
        City city = new City("Дубай", 40);
        Solution.showWeather(city);
    }
}
