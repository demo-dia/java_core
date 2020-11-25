package com.free;

import javafx.css.StyleableStringProperty;

import java.util.Scanner;

public class Systemin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("please input ");
        String str=in.nextLine();
        System.out.println(str);
    }
}
