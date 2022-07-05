package com.javabase;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 1;
        System.out.println("please inter number:");
        while (scanner.hasNextDouble()){
            sum= sum + scanner.nextDouble();
            count = ++count;
        }
        System.out.println("total:"+ sum);
        System.out.println("average:"+ sum/count);
        scanner.close();
    }
}
