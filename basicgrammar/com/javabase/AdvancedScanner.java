package com.javabase;

import java.util.Scanner;

public class AdvancedScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //从键盘输入数据
        int i = 0;
        float f = 0.0f;
        System.out.println("please inter int:");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println(i);
        } else {
            System.out.println("your inter is not int");
        }
        System.out.println("please inter float:");
        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println(f);
        } else {
            System.out.println("your inter is not float");
        }
        scanner.close();
    }
}
