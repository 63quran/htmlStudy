package com.lwh.OOP.demo08;

public class Application {

    public static void main(String[] args) {

        //类型之间的转化： 父     子

        //高               低
        Person obj = new Student();

        //student将这个对象转换为Student类型，我们就可以使用Student类型的方法了！
        ((Student) obj).go();
        //子类转换为父类，可能丢失自己的本来的一些方法！
        Student student = new Student();
        student.go();
        Person person = student;
    }
}

/*
1.父类引用指向子类的对象
2.把子类转换为父类，向上转型；
3.把父类转换为子类，向下转型；强制转换
4.方便方法的调用，减少重复的代码！简洁

抽象：封装、继承、多态！
 */
