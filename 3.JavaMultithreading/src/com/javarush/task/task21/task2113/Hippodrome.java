package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList());
        game.horses.add(new Horse("One", 3, 0));
        game.horses.add(new Horse("Two", 3, 0));
        game.horses.add(new Horse("Three", 3, 0));
        game.run();
        game.printWinner();
    }

    public Hippodrome(List horses) {
        this.horses = horses;
    }

    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    public void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }

        /*for (int i = 0; i < 10; i++) {
            System.out.println();
        }*/
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(500);
        }
    }

    public Horse getWinner() {
        int win = 0;
        double maxDistance = 0;
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).getDistance() > maxDistance) win = i;
        }

        return horses.get(win);
    }

    public void printWinner(){
        System.out.printf("Winner is %s!", getWinner().getName());
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
