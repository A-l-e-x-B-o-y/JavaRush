package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public static class Dog implements CanEat, CanMove{
        @Override
        public void eat() {

        }

        public void move() {

        }
    }

    public class Duck implements CanMove, CanFly, CanEat{
        @Override
        public void fly() {

        }

        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Car implements CanMove {
        public void move() {

        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void fly() {

        }

        public void move() {

        }
    }
}
