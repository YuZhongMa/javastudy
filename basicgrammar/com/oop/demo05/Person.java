/**
 * java 中所有的类默认继承Object类
 */
package com.oop.demo05;

public class Person {
    public Person() {
        System.out.println("Person无参构造器");
    }

    //public 可以被继承
    // private 不可以继承
    // default 没有修饰符
    // protected
    protected String name = "mlj";
    public int money = 10_0000_0000;
    public void say(){
        System.out.println("haha");
    }

    public int getMoney() {
        return money;
    }
    public void print(){
        System.out.println("Person");
    }
    public void setMoney(int money) {
        this.money = money;
    }
}
