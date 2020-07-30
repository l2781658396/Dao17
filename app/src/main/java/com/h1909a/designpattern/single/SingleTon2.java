package com.h1909a.designpattern.single;

//1.懒汉:需要的时候才会创建
//优点:延迟了对象的实例化,
//缺点:线程不安全
public class SingleTon2 {
    //java 里面成员变量,都有默认值
    //int,short,double,float 0/0.0
    //boolean:false(其他语言,0是false,非0是true)
    //引用类型:null
    private static SingleTon2 sSingleTon2;
    private SingleTon2(){}

    //A,B线程
    //1.A先拿到时间片
    //4.B拿到时间片
    public static SingleTon2 getInstance(){
        //2.A进来了,发现对象是null
        //5.B进来,发现对象还是null
        if (sSingleTon2 == null){
            //3.A进来初始化对象,还没有来得及赋值,这个时候A时间片执行完了,B抢走了时间片
            //6.B进来创建对象
            sSingleTon2 = new SingleTon2();
        }
        return sSingleTon2;
    }
}
