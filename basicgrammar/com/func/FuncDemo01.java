/**
 *
 */
package com.func;

public class FuncDemo01 {
    // main 方法
    public static void main(String[] args) {
        int sum = add(1,2);
        double sum2 = add(1,1);
        System.out.println(sum2 +"haha:"+ sum);
    }
    // add 方法
    public static int add (int a, int b){
        return a+b;
    }
    // 方法重载
    public static double add (double a, double b){
        return a+b;
    }
}
