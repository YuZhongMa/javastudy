/**
 * 多态
 * 注意事项
 * 1 多态是方法的多态,属性没有多态
 * 2 父亲类和子类有联系 类型转换异常 ClassCastException
 * 3 存在继承关系，方法需要重写
 * 4 父类引用指向子类对象 Father f1 = new Son();
 * 注意事项
 * 1 static 方法属于类不属于实例
 *
 * instanceof 用来测试一个对象是否为一个类的实例
 * intanceof  注意事项 ：
 * 1 obj 必须为引用类型，不能是基本类型
 * 2 System.out.println(null instanceof Object);//false
 * 3 其中 obj 为一个对象，Class 表示一个类或者一个接口，当 obj 为 Class 的对象，或者是其直接或间接子类，
 * 或者是其接口的实现类，结果result 都返回 true，否则返回false。
 * 4 注意：编译器会检查 obj 是否能转换成右边的class类型，如果不能转换则直接报错，如果不能确定类型，则通过编译，具体看运行时定。
 * 5 在编译状态中，class可以是object对象的父类，自身类，子类。在这三种情况下Java编译时不会报错。 左侧为泛型时，按照编译时的表象类型Object判断是否会报错。
 * 6 在运行转态中，class可以是object对象的父类，自身类，不能是子类。在前两种情况下result的结果为true，最后一种为false。但是class为子类时编译不会报错，运行结果为false
 * 7 编译时期判断报错（表象类型），运行时期判断布尔值（实际类型）
 * 文章： https://www.cnblogs.com/ysocean/p/8486500.html
 *
 *
 * 引用类型准换
 * 1 父类引用指向子类的对象
 * 2 把子类转换为父类
 * 3 把父类转换为子类 向下转型 ，需要强制转换
 */
package com.oop.demo06;

public class Application {
    public static void main(String[] args) {
        // 一个对象的实际类型是确定的

        //可以指向的引用类型不确定: 父类的引用指向子类
        // Student 能调用的方法可以是自己的也可以是父类的
        Student s1 = new Student();

        Person s2 = new Student();
        Object s3 = new Student();
        //对象能执行哪些方法 主要看左边的类型和右边关系不大
        s2.run();
        s1.run();//子类一旦重写了父类的方法，执行子类的
        //不能调用子类方法
        //s2.eat();
        ((Student) s2).eat();
        s1.eat();

        // Object > Person > Student
        Object s4 = new Student();
        System.out.println(s4 instanceof Student);
        System.out.println(s4 instanceof Person);
        System.out.println(s4 instanceof Object);
        System.out.println(s4 instanceof Teacher); //false
        System.out.println(s4 instanceof String); // false
        Person s5 = new Person();
        System.out.println(s5 instanceof Student); // true
        System.out.println(s5 instanceof Person); // true
        System.out.println(s5 instanceof Object); // true
        System.out.println(s5 instanceof Teacher); // false
        //
        //System.out.println(s5 instanceof String); // 编译报错
        try {
            Teacher test = (Teacher) s5;
            System.out.println(test+"++++");
        } catch (ClassCastException e) {
            System.out.println(e);
        }
        System.out.println("+++++++++++++++++");
        //引用类型之间的转换
        //基本类型转换 64 32 16 高转低需要强转
        // 引用类型 父亲--> 儿子
        // 高      低
        Person obj = new Student();
        // obj.go();//报错
        Student student = (Student)obj;
        student.go();
        Person p1 = student;
        //p1.go();// 子类转父类可能丢失一些方法

    }
}
