package com.java_thinking;

import java.util.Arrays;

public class JavaThinking5_0 {
    public static void main(String[] args) {
        int code[]=new int[4];
        String sumCode="";
        for (int i=0;i<code.length;i++){
            code[i]= (int) (Math.random()*10);
        }
        for (int i=0;i<code.length;i++){
            sumCode=code[i]+sumCode;
        }
        System.out.println(sumCode);


    }
}
