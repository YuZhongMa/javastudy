/**
 * 封装
 * 1. 高内聚，低耦合 类的内部数据操作自己完成，不允许外部干涉。仅暴露少量方法给外部使用；
 * 2. 提高程序的安全性
 * 3. 隐藏代码细节
 * 4. 统一接口，提高可维护
 */
package com.oop.demo04;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("mlj");
        System.out.println(student.getName());
    }
}
