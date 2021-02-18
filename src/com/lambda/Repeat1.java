package com.lambda;

public class Repeat1 {
    public static void repeat(int n,Runnable action){
        for(int i=0;i<n;i++) action.run();
    }

    public static void main(String[] args) {
        repeat(10,()-> System.out.println("Hello,World!"));
    }
}
