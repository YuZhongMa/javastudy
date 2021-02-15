package com.oop.demo02;

public class Person {
    String name;
    /**
     * 构造器实例化初始值，和类型相同  没返回值
     * 作用：
     * 1.使用new 关键字必须要有构造器
     * 2.初始化 对象的值
     */
    //无参数构造
    public Person(){
        this.name = "mlj";
    }
    //有参数构造,一旦定义了有参数构造，就必须显示的填充参数
    public Person(String name){
        this.name = name;
    }
    // command + n 新建构造器快捷键

}
