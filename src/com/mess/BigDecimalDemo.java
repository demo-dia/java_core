package com.mess;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal bd1=new BigDecimal("100.00");
        BigDecimal bd2=new BigDecimal("20.00");
        BigDecimal div=bd2.divide(bd1,2,BigDecimal.ROUND_HALF_UP);//除法
        BigDecimal decimal=new BigDecimal("0.20");
        int flag=div.compareTo(decimal);//比较大小
        System.out.println(flag);
    }
}
