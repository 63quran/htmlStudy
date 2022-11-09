package com.lwh.study.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        int a = 1;

        while (a<=100){//条件判断
            System.out.println(a);
            a+=2;
        }
        System.out.println("while循环结束");

        //初始化条件//条件判断//迭代
        for(int i = 1;i<100;i++){
            System.out.println(i);
        }
        System.out.println("for循环结束");
    }
}
