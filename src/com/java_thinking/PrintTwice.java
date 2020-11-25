package com.java_thinking;

import java.util.Scanner;

/**
 * 演示方法调用的示例程序
 */
public class PrintTwice {
    public static void printTwice(String s){
        System.out.println(s);
        System.out.println(s);
    }
    public static void printTime(int hour,int minute){
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }

    /**
     * 打印问候语
     * @param args
     */
    public static void main(String[] args) {
        printTwice("Dont't make me say this twice!");
        int hour=11;
        int minute=59;
        printTime(hour+1,0);//注意形参

        String input="1 fish 2 fish red fish blue fish";
        Scanner s=new Scanner(input);
    }
}
