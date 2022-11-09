package com.lwh.study.method;

import com.lwh.study.struct.IfDemo01;

public class Demo02 {
    public static void main(String[] args) {
        int max = max(10,20,30);
        System.out.println(max);
    }
    //比大小
    public static  int max(double num1,double num2){
        int result = 0;

        if (num1==num2){
            System.out.println("num1==num2");
            return 0;//终止方法
        }
        if(num1>num2){
            result =  (int) num1;
        }else{
            result =  (int) num2;
        }
        return result;
    }
    //比大小
    public static  int max(int num1,int num2){
    int result = 0;

    if (num1==num2){
        System.out.println("num1==num2");
        return 0;//终止方法
    }
    if(num1>num2){
        result = (int) num1;
    }else{
        result = (int) num2;
    }
        return result;
    }
    public static  int max(int num1,int num2,int num3){
        int result = 0;

        if (num1==num2){
            System.out.println("num1==num2");
            return 0;//终止方法
        }
        if(num1>num2){
            result = num1;
        }else{
            result = num2;
        }
        return result;
    }
}

