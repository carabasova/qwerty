package ru.const24;

import java.util.List;

public class UtilProduct {

    public static double calculateCosts(List<Product> productList, Currency costsCurrency,
                                        CurrencyConverter currencyConverter) {
        double summ = 0;
        for (Product i : productList) {
            System.out.println("product: " + i);
            summ += currencyConverter.convertByCurrencty(i.price, costsCurrency).value;
            System.out.println(currencyConverter.convertByCurrencty(i.price, costsCurrency));
        }
        return summ;

    }
}

