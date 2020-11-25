package com.free;

public class ThreeSingal {
    public static void main(String[] args) {
        int i=80;
        String s=String.valueOf(i<100?90:100);
        String s1=String.valueOf(i<100?90:100.0);//100.0是关键
        System.out.println(s.equals(s1));
    }
}
