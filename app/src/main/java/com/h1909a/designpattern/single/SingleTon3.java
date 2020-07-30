package com.h1909a.designpattern.single;

//DCL:Double check lock
//综合了懒汉和饿汉的有点,解决了缺点
//即延迟了对象的实例化,又保证线程安全
public class SingleTon3 {
    //成员变量
    //如果是引用类型的,保存的是地址值
    private volatile static SingleTon3 sSingleTon3;
    //如果是基本数据类型,存的是值
    private int a;
    private SingleTon3() {
         a = 10;
    }

    //同步之后,整个方法区域只能有一个线程进去
    //同步效率比较低,但是这个方法调用每次都需要同步
/*    public static synchronized SingleTon3 getInstance(){
        if (sSingleTon3 == null){
            sSingleTon3 = new SingleTon3();
        }
        return sSingleTon3;
    }*/


    public static SingleTon3 getInstance() {
        //只需要在对象创建之前同步,
        //(1).第一次避免不必要的同步;
        if (sSingleTon3 == null) {
            synchronized (SingleTon3.class) {
                //(2).第二次是在非空的情况下创建实例.
                if (sSingleTon3 == null) {
                    sSingleTon3 = new SingleTon3();
                }
            }
        }
        return sSingleTon3;
    }
}
