package com.lwh.study.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,9000,312321,456,21,5,9};
        System.out.println(a);//[I@4554617c
        //打印数组
//        System.out.println(Arrays.toString(a));
//        printArray(a);

        Arrays.sort(a);//数组进行排序:  升序
        System.out.println(Arrays.toString(a));

        Arrays.fill(a,0);//数组填充
        System.out.println(Arrays.toString(a));
    }

    public static void printArray(int[] a){
        for (int i = 0; i <a.length ; i++) {
            if (i==0){
                System.out.print("[");
            }
            if (i==a.length-1){
                System.out.print(a[i]+"]");
            }else {
                System.out.print( a[i]+",");
            }
        }
    }
}
