package com.lwh.study.struct;

import sun.print.SunMinMaxPage;

public class ForDemo02 {
    public static void main(String[] args) {
        //练习1：计算0到100之间的奇数和偶数的和

        //自己写的：
//        int oddSum = 0;
//        int evenSum = 0;
//
//        for (int i=0;i<100;i+=2){
//            oddSum= oddSum + i;
//        }
//        System.out.println("偶数的和为："+evenSum);
//        for (int j=1;j<100;j+=2){
//            evenSum= evenSum + j;
//        }
//        System.out.println("奇数的和为："+oddSum);

        //老师的方法：

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0;i < 100;i++){
            if (i%2!=0){//奇数
                oddSum+=i;
            }else {//偶数
                evenSum+=i;
            }
        }
        System.out.println("偶数的和为："+evenSum);
        System.out.println("奇数的和为："+oddSum);

    }
}
