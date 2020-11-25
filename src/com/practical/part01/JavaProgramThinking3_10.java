package com.practical.part01;

import java.util.Scanner;

public class JavaProgramThinking3_10 {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner in=new Scanner(System.in);

        System.out.print("What is your age? ");
        age=in.nextInt();

        in.nextLine();//必须加这一行，注释掉会得到意想不到的结果

        System.out.print("What is your name? ");
        name=in.nextLine();

        System.out.printf("Hello %s, age %d\n",name,age);


    }
}
