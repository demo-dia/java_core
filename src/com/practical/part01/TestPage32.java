package com.practical.part01;

public class TestPage32 {
    public static void main(String[] args) {
        int a=10;
        float b=10.0f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);

        Integer ia=new Integer(10);
        Float fa=new Float(10.0f);
        System.out.println(ia);
        System.out.println(fa);
        System.out.println(ia.equals(fa));
        System.out.println(fa.equals(ia));
    }
}
