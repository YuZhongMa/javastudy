package com.base;

public class Demo04 {
    public static void main(String[] args) {
        //操作大数注意溢出问题
        //jdk7 ,数字之间可以下划线分割
        int money = 10_0000_0000;
        int year = 20;
        int total = money*year;// -1474836480 计算溢出了
        long total2 = money*year;// 默认int 转换之前已经溢出了
        System.out.println(total);
        System.out.println(total2);
        long total3 = money*((long)year);//先把一个转成long
        System.out.println(total3);

    }
}
