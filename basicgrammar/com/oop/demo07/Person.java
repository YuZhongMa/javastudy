package com.oop.demo07;
//静态导入包
import static java.lang.Math.random;
public class Person {
    {
        //匿名代码块 创建对象时，在构造器之前
        System.out.println("匿名");
    }
    static {
        //静态代码块 只执行一次，赋值
        System.out.println("静态");
    }
    public Person(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        new Person();
    }
}
