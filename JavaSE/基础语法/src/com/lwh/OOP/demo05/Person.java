package com.lwh.OOP.demo05;

//在Java中，所有的类都默认直接或间接继承object
public class Person {

    public int money = 10_0000_0000;
    public void say(){
        System.out.println("说了一句话");

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
