/**
 *  abstract 抽象类
 *  1 不能new 这个类，只能靠子类去实现
 *  2 抽象类里边可以写普通方法
 *  3 抽象方法必须在抽象类中
 *  抽象类存在构造器吗？
 *  存在的意思是什么？
 */
package com.oop.demo08;

public abstract class Action {
    //约束
    // abstract 方法只有方法的名字没有方法的实现
    public abstract void doSomething();
}
