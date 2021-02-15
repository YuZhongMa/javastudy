package com.oop.demo04;
//封装的核心 属性私有
public class Student {
    private String name;
    private int id;
    private String sex;
    //提供一些可以操作属性的方法，public get set方法
    public String getName (){
        return this.name;
    }
    public void setName (String name){
        this.name = name;
    }
    //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
