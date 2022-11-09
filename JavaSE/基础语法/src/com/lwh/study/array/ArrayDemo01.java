package com.lwh.study.array;

public class ArrayDemo01 {
    //变量类型   变量名字 =  变量的值
    //数组类型

    public static void main(String[] args) {
        int[] nums;//1.声明一个数组

        nums = new int[10];//2.创建一个数组
        //或者 int[] nums = new int[10]

        //3.数组的元素中赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;

        //计算数组中所有数的和
        int sum = 0;
        for (int i = 0; i < nums.length ; i++) {
            sum = sum + nums[i];
        }
        System.out.println("总和为："+sum);
    }
}
