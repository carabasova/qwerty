package ru.const24;

public class Money {
    public Money(double value, Main.Currency moneyCurrency) {
        this.value = value;
        this.moneyCurrency = moneyCurrency;
    }

    public double value;
    public Main.Currency moneyCurrency;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}