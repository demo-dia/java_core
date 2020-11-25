package com.free;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("haha");
        String a=al.get(0);

       //size()方法，可以计算集合的长度
        System.out.println(al.size());
        System.out.println(a);

    }

}
