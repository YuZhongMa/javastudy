package com.javabase;

/**
 * @Author javabase
 * 基本类型
 * java强类型区别于js弱类型
 * 先定义再使用
 * byte 一个字节 -128 - 127，short 2个字节，int 4字节 ，long 8字节, float 4字节, double 8字节 ,char 2字节, boolean 1位
 */
public class Demo01 {
    public static void main(String[] args) {
        //整数
        byte num0 = 127;
        long num1 = 30L;
        int num2 = 456;
        short num3 = 567;
        //字符
        char name = 'a';
        // String 不是关键字，是类
        String a = "haha";
        //小数
        double num5 = 7.33;
        float num6 = 6.23F;

        //布尔值
        boolean flag = true;
        //最大值 Integer Byte
        System.out.println(Integer.MAX_VALUE);
        System.out.println(a);
        System.out.println(num5);
    }
}