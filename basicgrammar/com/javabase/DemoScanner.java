package com.javabase;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用键盘:");
        //判断用户有没有输入输出
        if (scanner.hasNext()) {
            //接受用户输入
            //String str = scanner.next();
            String str = scanner.nextLine();
            System.out.println("输入内容："+ str);
        }
        scanner.close();
    }
}
