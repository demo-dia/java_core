package com.practical.part01;

import java.awt.*;

public class Assign {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        Point x=new Point(0,0);
        Point y=new Point(1,1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
        System.out.println("Performing assignment and" +"setLocation...");
        a=b;
        a++;
        x=y;
        x.setLocation(5,5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
