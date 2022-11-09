package com.lwh.OOP.demo10;

//abstract  抽象类： 类  extens：    单继承~    （接口可以多继承）
public abstract class Action {

    //约束~有人帮我们是实现
    //absract ， 抽象方法，只有方法名字，没有方法的实现！
    public abstract void doSomething();

    //1.不能new这个抽象类，只能靠子类去实现它：约束
    //2.抽象类可以写普通方法~
    //3.抽象方法必须在抽象类中~
    //抽象的抽象： 约束~

    //思考题？  new  ，  存在构造器么？
    //存在的意义   抽象出来~  提高开发效率
}
