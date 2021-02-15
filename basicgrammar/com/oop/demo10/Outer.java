package com.oop.demo10;

public class Outer {
    private int id = 10;
    public void out(){
        System.out.println("这是外部类");
        // 匿名内部类
        new A().toString();
        // 局部内部类 写到方法中
        class Inner{

        }
    }
     public class inner{
        public void in(){
            System.out.println("这是一个内部类");
        }
        //可以获得内部的私有属性跟方法
         public  void getID() {
             System.out.println(id);
         }
    }
}
//一个文件中只能有一个public 类
class A{

}

