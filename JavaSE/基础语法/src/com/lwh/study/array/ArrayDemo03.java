package com.lwh.study.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};

        //打印全部的数组元素
        for (int i = 0; i < A.length ; i++) {
            System.out.println(A[i]);
        }
        System.out.println("=========");
        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < A.length ; i++) {
            sum += A[i];
        }
        System.out.println("sum"+sum);
        System.out.println("=========");
        //查找最大元素
        int max = A[0];

        for (int i = 0; i < A.length; i++) {
            if (max<A[i]){
                max = A[i];
            }
        }
        System.out.println("max="+max);

    }
}
