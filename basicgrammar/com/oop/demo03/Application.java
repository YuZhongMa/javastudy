/**
 * 整个过程
 * 1.加载类 Application main 常量池 static 静态方法属性
 * 2.main 方法进栈
 * 3. new Pet(); 加载 Pet 类，给属性赋默认值
 */
package com.oop.demo03;

public class Application {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.name = "xiaohei";
        pet.age = 18;
        pet.shout();
        Pet cat = new Pet();
        cat.name = "xiaomao";
        cat.age = 11;
        cat.shout();
        System.out.println();
    }
}
