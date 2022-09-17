package com.annotation;


@MyBook(name = "疯狂java", authors = {"mlj"}, price = 200 )
public class Demo1 {
    public static void main(String[] args) {
        @MyBook(name = "疯狂java", authors = {"mlj"}, price = 200 )
        int age = 18;
        @Book("/add")
        String country = "china";
        System.out.print(country);
    }
}
