package com.mess;

public class MathDemo {
    public static void main(String[] args) {
        int a=16;
        int b=Math.abs(-16);//



        //使用Math.random()输出为double类型
        //输出[0,10)
        //(int)(Math.random()*10);

        //输出[0,10]
        //(int)(Math.random()*10 + 1);
        double c=Math.random();//产生随机double 0~1

        double c1=Math.random()*10;  //0~10

        double c2=Math.random()*10+1;


        System.out.println(a);

        System.out.println(b);

        System.out.println(c);

    }
}
