package com.changru.string;

public class StringDemo1 {
    public static void main(String[] args){
        String a1="1231login.jsp";
        String a2="123";
        System.out.println(a1==a2);

        int idx = a1.lastIndexOf("1");
        String endwith = a1.substring(idx + 1);
        System.out.println(idx);
        System.out.println(endwith);

    }

}
