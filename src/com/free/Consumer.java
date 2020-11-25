package com.free;

public class Consumer {
    public static void main(String[] args) throws Exception{
        //反序列化
        PersonDemo p= (PersonDemo) SerializationUtils.readObject();
        System.out.println("name="+p.getName());
    }
}
