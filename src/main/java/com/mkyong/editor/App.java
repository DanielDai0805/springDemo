package com.mkyong.editor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by dc on 2015/7/15.
 */
public class App {

    @Test
    public void testCustomDateEditor(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "customEditor.xml");

        CustomDateEditor cust = (CustomDateEditor) context.getBean("customer");
        System.out.println(cust);
    }
}
