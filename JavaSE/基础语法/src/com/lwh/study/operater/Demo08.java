package com.lwh.study.operater;
public class Demo08 {
    public static void main(String[] args) {
        //x ? y : z
        //如果x==true，则结果为y，否则结果为z

        int score = 50;
        String type = score < 60 ? "不及格":"及格";//必须掌握
        System.out.println(type);
    }
}
