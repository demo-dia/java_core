package com.java_thinking;

public class NewLine {
    public static void newLine(){
        System.out.println();
    }
    public static void threeLine(){
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args) {
        System.out.println("First line.");
        threeLine();
        threeLine();
        threeLine();
        System.out.println("Second line.");
    }

}
