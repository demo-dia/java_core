package com.practical.part01;
import java.util.Scanner;
public class JavaProgramThinking {
    public static void main(String[] args) {
        int inch;
        final double CM_PER_INCH=2.54;
        double cm;
        Scanner in=new Scanner(System.in);
        System.out.print("How many inches? ");
        inch=in.nextInt();
        cm=inch*CM_PER_INCH;
        System.out.print(inch+" in = ");
        System.out.println(cm+" cm");
    }
}
