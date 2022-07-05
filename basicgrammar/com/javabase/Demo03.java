package com.javabase;

/**
 * 类型转换
 * 强制类型转换
 * 自动类型转换
 * 低————————————————————高
 * byte,short,char ->int->long->float->double
 */
public class Demo03 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;//内存溢出
        //强制转换  （类型）变量名
        //自动转换 由低到高

        /*
        1.布尔值不能转换
        2.不能把对象类型转换为不相干类型
        3.由高到低需要强制转换
        4.转换 可能会有内存溢出或者精度问题
         */
        System.out.println("+++++");
        System.out.println((int)23.7);
        System.out.println((int)-45.89f);
        System.out.println("+++++");
        char c ='a';
        int d = c+1;
        System.out.println(d);
        System.out.println((char)d);
    }
}
