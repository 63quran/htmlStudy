package com.lwh.study.base;

public class Demo05 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;//内存溢出 低--高
        double c = i;//高--低

        //强制转换  （类型）变量名  高--低
        //自动转换  低--高

        System.out.println(i);
        System.out.println(b);
        System.out.println(c);

        /*
        注意点：
        1.不能对布尔值进行转换
        2.不能把对象类型转换为不相干的类型
        3.在把高容量转换到低容量的时候，强制转换
        4.转换的时候可能存在内存溢出，或者精度问题！
        */

        System.out.println("=========================");
        System.out.println((int)23/7);//23
        System.out.println((int)-45.89f);//-45

        System.out.println("=========================");
        char e = 'a';
        int f = e+1;
        System.out.println(f);
        System.out.println((char) f);
    }
}
