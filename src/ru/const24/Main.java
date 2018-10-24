package ru.const24;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //составляем список продуктов
        List<Product> productList = new ArrayList<>();

        Money newZeland = new Money(400000, Currency.USD);
        productList.add(new Product("Велингтон", newZeland));

        Money amsterdam = new Money(895000, Currency.EUR);
        productList.add(new Product("Амстердам", amsterdam));

        Money novosibirsk = new Money(4000000, Currency.RUB);
        productList.add(new Product("Новосибирск", novosibirsk));

        //создаем конвертер валют с курсом на текущий день
        CurrencyConverter currencyConvertor = new CurrencyConverter(1.0, 66.9707, 0.85626);

        //выводим на экран сумму всех товаров в рублях, по текущему курсу
        System.out.println(
                "Цена всех товаров в рублях: " + String.format("%.2f", calculateCosts(productList, Currency.RUB,
                        currencyConvertor)));


        CurrencyConverter today = new CurrencyConverter(1,65.7585, 1.1705);
        CurrencyConverter twenty = new CurrencyConverter(1,67.0098,1.1767);

        double todayCost =  calculateCosts(productList, Currency.RUB, today);
        double twentyCost =  calculateCosts(productList, Currency.RUB, twenty);

        System.out.println("Twenty:  " + twentyCost);
        System.out.println("Today:  " + todayCost);

        System.out.println(String.format("%.2f",todayCost - twentyCost));

    }



        @Override
        public String toString() {
            return "Product{" +
                    "productName='" + productName + '\'' +
                    ", price=" + price +
                    '}';
        }
    }



        @Override
        public String toString() {
            return "Money{" +
                    "" + value +
                    " " + moneyCurrency +
                    '}';
        }
    }

