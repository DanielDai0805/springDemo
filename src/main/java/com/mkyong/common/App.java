package com.mkyong.common;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dc on 2015/7/14.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-Module.xml");
        final HelloWorld helloBean = (HelloWorld)ac.getBean("helloBean");
        helloBean.printHello();
    }
}
