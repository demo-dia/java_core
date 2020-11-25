package com.free;

public class Producer {
    public static void main(String[] args) {
        PersonDemo personDemo=new PersonDemo();
        personDemo.setName("变了");

        //序列化，保存在磁盘上
        SerializationUtils.writeObject(personDemo);
    }
}
