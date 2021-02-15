package com.error;

public class Demo01 {
    public static void main(String[] args) {
        //new Demo01().a();
        System.out.println(10/0);
    }
    public void a() {
        b();
    }
    public void b() {
        a();
    }
}
