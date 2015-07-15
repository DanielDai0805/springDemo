package com.mkyong.collction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dc on 2015/7/15.
 */
public class App {
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");

        Customer cust = (Customer)context.getBean("customer");
        System.out.println(cust);

    }
}
