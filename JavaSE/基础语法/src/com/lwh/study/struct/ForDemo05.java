package com.lwh.study.struct;

public class ForDemo05 {
    public static void main(String[] args) {
        int[] numebers = {10,20,30,40,50};//定义一个数组

        for (int i = 0; i < 5; i++) {
            System.out.println(numebers[i]);
        }
        System.out.println("=====================");
        //遍历数组的元素
        for(int x:numebers){
            System.out.println(x);
        }
    }
}
