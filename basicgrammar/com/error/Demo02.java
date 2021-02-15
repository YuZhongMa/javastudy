package com.error;

public class Demo02 {
    public static void main(String[] args) {
        int a= 10;
        int b =0;
        try {
            if (b == 0){
                throw new ArithmeticException();
            }
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();//打印错误的栈信息
        } finally {
        }
    }
}
