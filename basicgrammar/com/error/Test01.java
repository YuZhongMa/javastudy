package com.error;

public class Test01 {
    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e){
            System.out.println("my" + e);
        }
    }
    static  void test(int a) throws MyException {
        if (a > 0){
            throw new MyException(a);
        }
    }

}
