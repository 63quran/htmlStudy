package com.lwh.bishiT;

import java.util.Scanner;

public class test{
    public static int findMaxString(String inString){
        int nowStringLength = 0;
        StringBuffer nowStringBuffer = null;

        int maxStringLength = 0;
        StringBuffer maxStringBuffer = null;

        for(int i =0;i<inString.length();i++){
            if(inString.charAt(i)>=48&&inString.charAt(i)<=57){
                if(nowStringLength==0){
                    nowStringBuffer = new StringBuffer(String.valueOf(inString.charAt(i)));
                    nowStringLength++;
                }else{
                    nowStringBuffer.append(inString.charAt(i));
                    nowStringLength++;
                }
                if(nowStringLength>maxStringLength){
                    maxStringLength = nowStringLength;
                    maxStringBuffer = nowStringBuffer;
                }
            }else{
                nowStringLength = 0;
                nowStringBuffer = null;
            }
        }
        System.out.println(maxStringBuffer);
        return maxStringLength;
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
        String inString = sc.nextLine();
        System.out.println(findMaxString(inString));
      }
    }
}