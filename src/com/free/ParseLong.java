package com.free;


/**
 * parseLong()的使用
 * 静态方法，字符串转成long，默认十进制
 */
public class ParseLong {
    public static void main(String[] args) {
        long a=Long.parseLong(new String("10"));
        System.out.println(a);

        //报错，因为3不在2进制基础范围
       /* String s="3";
        long b=Long.parseLong(s,2);
        System.out.println(b);*/

        /*String xx="520 ";//hava a trim   ◆error
        System.out.println(Long.parseLong(xx));*/

        String xx="520";
        xx.trim();// remove a trim
        System.out.println(Long.parseLong(xx));


         String s="111";
        long b=Long.parseLong(s,2);
        System.out.println(b);


        String str="520";
        int c=Integer.parseInt(str);
        System.out.println(c);


    }
}
