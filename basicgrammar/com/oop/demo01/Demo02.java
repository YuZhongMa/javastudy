package com.oop.demo01;

public class Demo02 {
    //静态方法 static 和类一起加载
    public static String name;
    //非静态方法 类实例化之后才存在
    public static void main(String[] args) {
        Student.sayHello();
        Student student = new Student();
        student.say();
    }
}
