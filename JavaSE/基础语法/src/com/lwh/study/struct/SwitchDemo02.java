package com.lwh.study.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "李文豪";
        //JDL7的新特性，表达式结果可以是字符串！！！
        //字符的本质还是数字

        //反编译
        switch (name){
            case "卡莎":
                System.out.println("卡莎");
                break;
            case  "李文豪":
                System.out.println("李文豪");
                break;
            default:
                System.out.println("弄啥嘞！");
        }
    }
}
