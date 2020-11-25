package com.free;

public class ExceptionDemo {
    public static void main(String[] args) {

        int x=division();
        System.out.println(x);

    }
    public static int division(){
        int a=10;
        int b=0;
        int c=a/b;
        return  c;
    }
}
