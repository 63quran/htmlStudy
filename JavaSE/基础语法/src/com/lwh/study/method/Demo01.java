package com.lwh.study.method;

public class Demo01 {
    public static void main(String[] args) {
        //main方法
//        int sum = add(1,2);
//        System.out.println(sum);
        System.out.println("99乘法表：");
        test();
    }
    //加法
    public static  int add(int a,int b){
        return a+b;
    }
    public  static void test(){
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i+"*"+j+"="+(j*i)+"\t");
            }
            System.out.println();
        }

    }
}
