/**
 * 内部类  成员内部类 静态内部类 局部内部类 匿名内部类
 */
package com.oop.demo10;

public class Application {
    public static void main(String[] args) {
        // 匿名内部类
        UserService userService = new UserService(){
            @Override
            public void hello() {

            }
        };
        Outer out = new Outer();
        //通过外部类来实例化内部类
        Outer.inner inner = out.new inner();
        inner.in();
    }
}
interface UserService{
    void hello();
}