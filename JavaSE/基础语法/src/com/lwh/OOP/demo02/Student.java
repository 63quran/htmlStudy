package com.lwh.OOP.demo02;

//学生类
public class Student {

    //属性：字段
    String name;
    int age;

    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }
}
/*
        //类：抽象的，实例化
        //类实例化后会返回一个自己的对象！
        //student对象就是一个Student类的具体实例

        Student xiaoming = new Student();
        Student xh = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 3;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        xh.name = "小红";
        xh.age =  3;

        System.out.println(xh.name);
        System.out.println(xh.age);

 */