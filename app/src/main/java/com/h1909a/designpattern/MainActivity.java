package com.h1909a.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//1.DCL
//2.懒汉式
//3.饿汉式
//4.静态内部类
//5.容器类型
//6.枚举
//什么情况下:如果这个对象在创建和销毁过程中比较消耗资源,而且一个对象就可以完成任务
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
