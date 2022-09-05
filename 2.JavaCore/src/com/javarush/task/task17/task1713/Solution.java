package com.javarush.task.task17.task1713;

import java.time.LocalDate;
import java.util.*;

/* 
Общий список
*/

public class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    @Override
    public synchronized int size() {
        return original.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return original.isEmpty() ? true : false;
    }

    @Override
    public synchronized boolean contains(Object o) {
        return original.contains(o) ? true : false;
    }

    @Override
    public synchronized Iterator<Long> iterator() {
        return original.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return original.toArray();
    }

    @Override
    public synchronized <T> T[] toArray(T[] a) {
        return original.toArray(a);
    }

    @Override
    public synchronized boolean add(Long aLong) {
        original.add(aLong);
        return true;
    }

    @Override
    public synchronized boolean remove(Object o) {
        original.remove(o);
        return true;
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        return original.containsAll(c) ? true : false;
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> c) {
        original.addAll(c);
        return true;
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends Long> c) {
        original.addAll(index, c);
        return true;
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        original.removeAll(c);
        return true;
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        original.retainAll(c);
        return true;
    }

    @Override
    public synchronized void clear() {
        original.clear();
    }

    @Override
    public synchronized Long get(int index) {
        return original.get(index);
    }

    @Override
    public synchronized Long set(int index, Long element) {
        return original.set(index, element);
    }

    @Override
    public synchronized void add(int index, Long element) {
        original.add(index, element);
    }

    @Override
    public synchronized Long remove(int index) {
        Long x = original.get(index);
        original.remove(index);
        return x;
    }

    @Override
    public synchronized int indexOf(Object o) {
        return original.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    public synchronized ListIterator<Long> listIterator() {
        return original.listIterator();
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int index) {
        return original.listIterator(index);
    }

    @Override
    public synchronized List<Long> subList(int fromIndex, int toIndex) {
        return original.subList(fromIndex, toIndex);
    }
}
