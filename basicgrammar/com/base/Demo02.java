package com.base;

/**
 * 拓展
 *
 */
public class Demo02 {
    public static void main(String[] args) {
        // 二进制0b 十进制 八进0 16进制0x
        int i = 10;
        int i1 = 0b10;
        int i2 = 010;
        int i3 = 0x10;
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        // 钱怎么表示
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d);
        float d1 = 232525252524524545454545f;
        float d2 = d1+1;
        System.out.println(d1==d2);
        //BigDecimal 数学工具类

        // 字符拓展 类型转换
        char c1 = 'a';
        char c2 = '这';
        System.out.println((int)c1);
        System.out.println((int)c2);
        System.out.println((double)c2 + "+++++++");
        //所有字符本质还是数字
        //编码 Unicode 范围 0 - 65536  2字节
        System.out.println((char)65);
        /**
         * U0000 -- UFFFF
          */
        char c3 = '\u0061';
        System.out.println(c3); //a
        //转义字符
        //\t 制表符
        //...
        System.out.println("hello\nworld");
        // String 奇妙的比较
        String s1 = new String("hello world");
        String s2 = new String("hello world");
        System.out.println(s1==s2);
        String s3 = "hello world";
        String s4 = "hello world";
        System.out.println(s3==s4);
        // 布尔值
        boolean flag = true;
        if (flag) {
            System.out.println(true);
        }
        // less is more
    }
}
