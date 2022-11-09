package com.lwh.OOP.demo06;

public class Person {

    public Person(){
        System.out.println("Person无参执行了");
    }
    protected String name = "liwenhao";

    //私有的东西无法被继承
    public void print(){
        System.out.println("Person");
    }
}
/*

    public static void main(String[] args) {
        Student student = new Student();
//        student.test("李文豪");
//        student.test1();

    }
 */