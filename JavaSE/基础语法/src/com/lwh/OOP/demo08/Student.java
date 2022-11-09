package com.lwh.OOP.demo08;

public class Student extends Person{
    public void go(){
        System.out.println("go");
    }
}


/*
    public static void main(String[] args) {
        Object object = new Student();

        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);
        System.out.println(object instanceof Teacher);
        System.out.println(object instanceof String);
        System.out.println("=======================");
        Person person = new Student();
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);
        System.out.println(person instanceof Teacher);
        // System.out.println(person instanceof String);
        System.out.println("=======================");
        Student student = new Student();
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);
       // System.out.println(student instanceof Teacher);
       // System.out.println(student instanceof String);



    }
 */