package com.changru.array;

import java.util.Arrays;

public class RandomArrayCode {
    public static void main(String[] args) {

        int code[]=new int[3];
        for (int i=0;i<code.length;i++){
            code[i]= (int) (Math.random()*100);
        }
        int first=code[0];
        int second=code[1];
        int third=code[2];
        String randomCode="";
       /* String randomArray= Arrays.toString(code);
        System.out.println(randomArray);
        int first=randomArray[0];
        //randomArray.charAt()*/




    }

}
