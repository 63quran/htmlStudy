package com.lwh.study.array;

import sun.font.FontRunIterator;

import java.util.Arrays;

public class ArrayDemo07 {
    //冒泡排序
    //1.比较数组中，两个相邻的元素，如果第一个数必第二个数大，我们就交换他们的位置
    //2.每一次比较，都会产生出一个最大，或者最小的数字
    //3.下一轮则可以少一次排序
    //4.依次循环，直到结束
    public static void main(String[] args) {
        int[] a = {1,2,43254,35,3,5452,23,4234};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] array){
        //临时变量
        int temp = 0;

        //优化
        boolean flag = false;
        //外层循环，判断我们这个要走多少次；
        for (int i = 0; i < array.length-1; i++) {
            //内层循环，比较判断两个数，如果第一个数比第二个数大，则交换位置
            for (int j = 0; j < array.length-1; j++) {
                if (array[j+1]<array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if (flag==false){
                break;
            }
        }
        return array;
    }
}
