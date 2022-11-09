package com.lwh.OOP.demo09;

//static
public class Student {
    private static int age;//静态的变量     多线程！
    private double score;// 非静态的变量

    public void run(){
        System.out.println("成功调用run");
    }
    public static void go(){
        System.out.println("成功调用go");
    }

    public static void main(String[] args) {
        new Student().run();
        go();
    }

}
