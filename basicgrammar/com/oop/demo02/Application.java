package com.oop.demo02;

public class Application {
    public static void main(String[] args) {
        //类抽象的，需要实例化
        //student 对象就是一个Student 类的具体实现
        //Student student = new Student();
//        Student xiaoming = new Student();
//        xiaoming.name = "小明";
//        xiaoming.age = 18;
//        System.out.println(xiaoming.name);
//        System.out.println(xiaoming.age);
        Person person = new Person("mlj");
    }
}
