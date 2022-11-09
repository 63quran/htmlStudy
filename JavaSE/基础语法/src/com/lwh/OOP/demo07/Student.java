package com.lwh.OOP.demo07;

public class Student extends Person{

    @Override
    public void run() {
        super.run();
    }

    public void eat(){
        System.out.println("eat");
    }
}
/*
        //一个对象的实际类型是确定的
        //new Student（）；
        //new Person（）；

        //可以指向的引用类型就不确定了：父类的引用指向子类

        //Student  能调用的方法都是自己的或者继承父类的！
        Student s1 = new Student();
        //Person 父类型可以指向子类，但是不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();

        //对象能执行哪些方法，主要看对象左边的类型，和右边的关系不大！
        s2.run();
        s1.run();
        System.out.println("=============");
        s1.eat();
        //s2.eat（） 子类重写了父类的方法，执行子类的方法

    }
 */