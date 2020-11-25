package com.changru.array;

public class InvertString {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("12345");
        sb.reverse();//反转字符串
        String newSb=sb.toString();
        for(int i=0;i<newSb.length();i++){
            System.out.println(newSb.charAt(i));
        }
    }
}
