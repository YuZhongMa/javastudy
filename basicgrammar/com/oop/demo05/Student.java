package com.oop.demo05;

public class Student extends Person {
    public Student() {
        //隐藏代码。调用了父类无参数构造
        //super("哈哈"); //此代码必须放在构造函数第一行
        System.out.println("Student 无参构造器");
    }

    private String name = "sxfl";
    public void print(){
        System.out.println("Student");
    }
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }
}
