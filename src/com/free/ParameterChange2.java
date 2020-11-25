package com.free;

public class ParameterChange2 {

    public void methodA(String str,String...strs){

    }
    public void mehtodA(String str,Integer...is){

    }

    public static void main(String[] args) {
        ParameterChange2 pc2=new ParameterChange2();
        pc2.mehtodA("China", 0);
        pc2.methodA("China","People");
        String[] strs=null;
        pc2.mehtodA("China");
        pc2.mehtodA("China",null);
        pc2.methodA("c" +
                strs);
    }
}
