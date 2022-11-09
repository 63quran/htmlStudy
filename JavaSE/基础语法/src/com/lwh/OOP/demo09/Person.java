package com.lwh.OOP.demo09;

//被final定义后不能被继承了
public class Person {
    //2：赋初值
    {
        System.out.println("匿名代码块");
    }
    //1：只执行依次
    static {
        System.out.println("静态代码块");
    }
    //3
    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("==========");
        Person person1 = new Person();

    }

}
