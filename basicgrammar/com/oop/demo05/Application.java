/**
 * 继承
 * 1. super 是调用父亲的构造方法 必须放在构造器第一行，super 只能出现在子类的方法或者构造方法中
 *  this vs super
 * 构造方法： this();本类的构造方法，super();父类的构造方法
 * 调用对象: this本身调用者这个对象， super 代表父对象的应用
 * 2.方法重写
 * 前提：需要有继承关系，子类重写父类的 方法
 * 1.方法名必须相同
 * 2.参数列表必须相同
 * 3.修饰符 范围可以扩大不能缩小 public > Protected > Default> private
 * 4.抛出的异常 范围可以缩小，不能扩大
 * 为什么需要重写
 * 1.父亲的功能，子类不一定需要或者不一定满足
 */
package com.oop.demo05;

public class Application {
    public static void main(String[] args) {
        //Student student = new Student();
        //student.test("maliangji");
        //student.test1();
        //System.out.println(student.money);

        // 方法的调用只跟左边类型有关
        A a = new A();
        a.test(); // A的静态方法
        //父类的引用指向了子类
        B b = new A();//子类重写了父类的方法，
        b.test(); // B
    }
}
