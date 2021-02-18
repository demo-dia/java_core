package com.methodreference;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("thunder",23);
        Supplier<String> supplier = ()->student.getName();
        System.out.println("Lambda形式： "+supplier.get());


        Supplier<String> supplier1 = student :: getName;
        System.out.println("方法引用形式： "+supplier1.get());
    }

}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
