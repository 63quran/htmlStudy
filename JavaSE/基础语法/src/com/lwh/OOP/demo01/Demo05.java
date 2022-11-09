package com.lwh.OOP.demo01;
//应用传递：对象，本质还是值传递
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);

        Demo05.change(person);

        System.out.println(person.name);
    }
    public static void change(Person person){
        //person是一个对象：指向的---->Person person = new Person();这是一个具体的人，可以改变属性
        person.name = "李文豪";
    }
}
//定义一Person类，有一个属性：name
class Person{
    String name;//null
}
