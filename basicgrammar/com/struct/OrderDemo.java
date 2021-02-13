package com.struct;

public class OrderDemo {
    public static void main(String[] args) {
        int maxNum = 9;
        for (int i = 1; i <= maxNum; i++){
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print(j+"*" + i + "="+ i*j+"\n");
                } else {
                    System.out.print(j+"*" + i + "="+ i*j + "\t");
                }
            }
        }
    }
}
