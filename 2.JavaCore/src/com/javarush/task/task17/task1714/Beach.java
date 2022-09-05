package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;      //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int count = 0;
        if (this.getDistance() < o.getDistance()) {
            count += 1;
        } else if (this.getDistance() > o.getDistance()) {
            count += -1;
        }

        if (this.getQuality() > o.getQuality()) {
            count += 1;
        } else if (this.getQuality() < o.getQuality()) {
            count += -1;
        }
        return count;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach beach1 = new Beach("Beach1", 5.02f, 2);
        Beach beach2 = new Beach("Beach2", 4.02f, 3);

        if (beach1.compareTo(beach2) > 0) {
            System.out.println("Первый пляж лучше");
        } else if (beach1.compareTo(beach2) < 0) {
            System.out.println("Второй пляж лучше");
        } else {
            System.out.println("Пляжи равны");
        }
    }
}