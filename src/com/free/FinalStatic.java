package com.free;

import java.util.Random;

public class FinalStatic {
    public static void main(String[] args) {
        System.out.println(Const.RAND_CONST);
    }
}
interface Const{
    public static final int RAND_CONST=new Random().nextInt();
}
