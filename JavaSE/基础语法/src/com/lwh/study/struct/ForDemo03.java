package com.lwh.study.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //练习2：用while或for循环输出1-1000之间能被5整除的数，并且每行输出3个
        System.out.println("for方法:");
        for (int i = 0;i < 1000;i++){
            if (i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){//每行3个
                System.out.println();
//                System.out.println("\n");
            }
            if (i==1000||i==995){
                System.out.println();
            }
        }
        System.out.println("while方法:");
        //println输出完会换行
        //print  输出完不会换行

        int i = 0;
        while (i<1000){

            if (i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                System.out.println("\n");
            }
            i++;
        }
    }
}
