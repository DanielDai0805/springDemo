package com.mkyong.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dc on 2015/7/15.
 */
public class App {

    @Test
    public void testSingleton(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
        final CustomerService customerServiceA = (CustomerService)ac.getBean("customerService");
        customerServiceA.setMsg("Message by custA");
        System.out.println("Message : " + customerServiceA.getMsg());

        //retrieve it again
        CustomerService custB = (CustomerService)ac.getBean("customerService");
        System.out.println("Message : " + custB.getMsg());

    }

    @Test
    public void testScope() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
        final CustomerService customerServiceA = (CustomerService)ac.getBean("customerServiceScope");
        customerServiceA.setMsg("Message by custA");
        System.out.println("Message : " + customerServiceA.getMsg());

        //retrieve it again
        CustomerService custB = (CustomerService)ac.getBean("customerServiceScope");
        System.out.println("Message : " + custB.getMsg());

    }
}
