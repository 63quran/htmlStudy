package com.lwh.exception;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //Ctrl + Alt + T
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
