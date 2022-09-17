package com.list;

import com.sun.deploy.util.StringUtils;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        String str = "98,99";
        String str1 = "98,99,100,101";
        List<String>  arr = Arrays.asList(str.split(","));
        List<String>  arr1 = Arrays.asList(str1.split(","));
        Set<Object> set = new HashSet<Object>();
        set.addAll(arr);
        set.addAll(arr1);
        System.out.println(StringUtils.join(set, ","));
    }
}
