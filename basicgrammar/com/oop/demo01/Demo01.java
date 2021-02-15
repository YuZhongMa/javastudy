package com.oop.demo01;

import java.io.IOException;

// 类
public class Demo01 {
    //方法
    public static void main(String[] args) {

    }
    /*
    修饰符 返回值 方法名（...）
          //方法体
          return
     */
    public String sayHello(){
        return "hello world";
    }
    public int max (int a,int b){
        return a>b ? a : b;
    }
    //数据下标越界异常 ArrayIndexOutOfBoundsException
    public void readFile(String file) throws IOException{}
}
