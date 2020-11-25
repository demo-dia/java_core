package com.free;

public class ThisExample {
    public static void main(String[] args) {
        /*Person p1=new Person("dia",12);
        System.out.println(p1.getAge());
        System.out.println(p1.getName());*/
        Person pp=new Person("dia");
        System.out.println(pp.getName());
        System.out.println(pp.getAge());

    }
}
class Person{
    String name;
    int age;

    public Person(){

    }
    public Person(String name){
        this(name,18);//this用法，只能用在构造方法里面，来回调用构造方法。这个this调用的是2个参数的构造方法。只能放在构造方法的第一行
    }
    public Person(String name,int age){
        this.name=name;//每一个方法里面都有一个this，this代指调用这个方法的实例对象
        this.age=age;//this防止成员变量和局部变量命令冲突。this.表示；对象调用成员变量
    }

    /**
     *
     * 如果不用this，运行。会发现，这个构造方法初始化不了
     * 因为成员变量和局部变量命令一样，区分不了
     */
    /*public Person(String name,int age){
        name=name;
        age=age;
    }*/

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
