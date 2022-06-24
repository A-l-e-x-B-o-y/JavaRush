package com.javarush.task.pro.task08.task0805;

/* 
Magic 8 ball
В этой задаче тебе предстоит реализовать метод getPrediction() в классе MagicBall, который будет работать как шар предсказаний.
Он случайным образом возвращает фразу-ответ на заданный вопрос. В методе getPrediction() нужно использовать метод nextInt(int) класса Random, который должен возвращать значения от 0 до 7 включительно.
В зависимости от результата работы метода nextInt(int) возвращается один из вариантов ответа:
0 -> Бесспорно
1 -> Определённо да
2 -> Вероятнее всего
3 -> Хорошие перспективы
4 -> Спроси позже
5 -> Попробуй снова
6 -> Мой ответ — нет
7 -> Весьма сомнительно
Иначе вернуть null.


Requirements:
1. Реализуй метод getPrediction() согласно условию.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println("Заработаю ли я себе на BMW?");
        System.out.println(MagicBall.getPrediction());
    }
}
