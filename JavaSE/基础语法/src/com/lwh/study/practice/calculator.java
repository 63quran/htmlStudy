package com.lwh.study.practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //从键盘接收数据
        System.out.println("请输入第一个数字");
        double num1 = scanner.nextDouble();
        System.out.println("请输入运算符号");
        String op = scanner.next();
        System.out.println("请输入第二个数字");
        double num2 = scanner.nextDouble();
        switch (op){
            case "+":
            System.out.println(num1 + op + num2 +"=" +(num1 + num2));
            break;
            case "-":
                System.out.println(num1 + op + num2 +"=" +(num1 - num2));
                break;
            case "*":
                System.out.println(num1 + op + num2 +"=" +(num1 * num2));
                break;
            case "/":
                    System.out.println(num1 + op + num2 +"=" +(num1 / num2));
                    break;
        }
        scanner.close();
    }
}
