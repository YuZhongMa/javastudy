package com.base;

/**
 * 作用域
 * 类变量
 * 实例变量
 * 局部变量
 */
public class Demo05 {
    //类变量 static
    static double salary = 500000000;
    //实例变量:从属于对象；如果不自行初始化，会有默认值: int 0，浮点数 0.0, 布尔值 false
    //除了基本类型，其他都是null
    String name;
    int age;
    //main方法
    public static void main(String[] args) {
        //局部变量，必须声名跟初始化值
        int a = 1;
        System.out.println(a);

        Demo05 demo05 = new Demo05();
        System.out.println(demo05.age);
        System.out.println(demo05.name);
        //类变量
        System.out.println(salary);
    }
    //其他方法
    public void add(){

    }
}
