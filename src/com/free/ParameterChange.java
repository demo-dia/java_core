package com.free;

import java.text.NumberFormat;

public class ParameterChange {
    public void calPrice(int price,int discount){
        float knockdownPrice=price*discount/100.0F;
        System.out.println(formateCurrency(knockdownPrice));
    }
    public void calPrice(int price,int...discounts){
        float knockdownPrice=price;
        for(int discount:discounts){
            knockdownPrice=knockdownPrice*discount/100;
        }
        System.out.println(formateCurrency(knockdownPrice));
    }
    private String formateCurrency(float price){
        return NumberFormat.getCurrencyInstance().format(price/100);
    }

    public static void main(String[] args) {
        ParameterChange pc=new ParameterChange();
        pc.calPrice(49900,75);
        pc.calPrice(49900,75,75);
    }
}
