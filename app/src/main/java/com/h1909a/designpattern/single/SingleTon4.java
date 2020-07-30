package com.h1909a.designpattern.single;

//  第一次加载Singleton时并不会实例化sInstance,只有在第一次调用getInstance()时才会实例化sInstance,
//  这种方式不仅能够确保线程安全,也能保证単例对象的唯一性,同时也延迟了単例的实例化,推荐使用.
public class SingleTon4 {
    private SingleTon4(){}

    public static SingleTon4 getInstance(){
        return SingleHolder.sSingleTon4;
    }

    private static class SingleHolder {
        private static SingleTon4 sSingleTon4 = new SingleTon4();
    }
}
