package com.javarush.task.task14.task1417;

public class Hryvnia extends Money {
    public Hryvnia(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }

    public Hryvnia(Double amount) {
        super(amount);
    }
}
