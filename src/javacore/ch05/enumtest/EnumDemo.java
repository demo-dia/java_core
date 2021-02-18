package javacore.ch05.enumtest;

import java.util.Scanner;

public class EnumDemo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a size :(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input=in.next().toUpperCase();
        Size size=Enum.valueOf(Size.class,input);
        System.out.println("size="+size);
        System.out.println("abbreviation="+size.getAbbreviation());
        if(size==Size.EXTRA_LARGE){
            System.out.println("good job--you paid attention to_.");
        }

    }
}
 enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL"),
    ;
    private String abbreviation;//abbreviation 缩略词

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

