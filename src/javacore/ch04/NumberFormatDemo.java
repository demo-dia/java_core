package javacore.ch04;

import java.text.NumberFormat;

public class NumberFormatDemo {
    public static void main(String[] args) {
        NumberFormat currencyFormatter=NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormatter);
    }
}
