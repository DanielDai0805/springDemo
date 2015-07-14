package com.mkyong.common;

/**
 * Created by dc on 2015/7/14.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Hello !"+name);
    }
}
