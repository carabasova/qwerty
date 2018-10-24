package ru.const24;

public class Money {
    public double value;
    public Currency moneyCurrency;

    Money(double value, Currency moneyCurrency) {
        this.value = value;
        this.moneyCurrency = moneyCurrency;
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value +
                ", " +
                moneyCurrency;
    }
}