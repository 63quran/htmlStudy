package com.lwh.OOP.demo11;

//抽象思维~ Java

//interface定义的关键字
public interface UserService {
    //接口中所有定义其实都是抽象的 public abstract

    //常量！ public static final
    int AGE = 99;

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
