package com.lwh.study.operater;

public class Demo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a+=b;//a=a+b
        a-=b;//a=a-b
        System.out.println(a);

        //字符串连接符   +，String
        //如果字符串在前面，就会拼接，如果字符串在后面，前面会进行运算
        System.out.println(""+a+b);
        System.out.println(a+b+"");
    }
}
