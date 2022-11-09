package com.lwh.OOP.demo04;

//类   private： 私有
public class Student1 {

    //属性私有
    private String name;//名字
    private int id;//学号
    private char sex;//性别
    private int age;//年龄

    //提供一些可以操作这个属性的方法！
    //提供一些public 的get、set方法

    //get 获得这个数据

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>120||age<0){
           this.age = 3;
        }else {
           this.age = age;
        }
    }
}
/*
    public static void main(String[] args) {
        Student1 s1 = new Student1();

        s1.setName("李文豪");

        System.out.println(s1.getName());

        s1.setAge(20);
        System.out.println(s1.getAge());
    }
 */