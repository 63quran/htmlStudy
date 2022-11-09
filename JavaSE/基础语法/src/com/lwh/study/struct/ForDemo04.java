package com.lwh.study.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //1.先打印第一列，这个大家应该都会
        //2.我们把固定的1再用一个循环包起来
        //3.去掉重复项，i<=j
        //4.调整样式
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i+"*"+j+"="+(j*i)+"\t");
            }
            System.out.println();
        }

    }
}
