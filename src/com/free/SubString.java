package com.free;

/**
 * substring的用法
 * 截取字符串方法：返回一个子串。a string that is part of a longer string
 */
public class SubString {
    public static void main(String[] args) {
        String h="0123456";
        String s="ab123456";

        System.out.println(h.substring(1));//123456

        System.out.println(s.substring(0,3));//ab1  ◆◆不包括3



    }
}
