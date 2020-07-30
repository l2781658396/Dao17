package com.h1909a.designpattern.single;



//1.饿汉式:不管需不需要,直接将对象提前创建好
//好处:线程安全
//缺点:浪费内存
//java如果没有构造,系统会提供一个默认的无参构造
//特征:
//1.app运行的过程中当前类的对象只有一个,
public class SingleTon {
    private static SingleTon sSingleTon = new SingleTon();
    private SingleTon(){}

    public static SingleTon getIntanse(){
        return sSingleTon;
    }
}
