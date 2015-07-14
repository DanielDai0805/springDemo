package com.mkyong.config.importtag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dc on 2015/7/14.
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        CustomerBo customer = (CustomerBo) context.getBean("customer");
        customer.printMsg("Hello 1");

        SchedulerBo scheduler = (SchedulerBo) context.getBean("scheduler");
        scheduler.printMsg("Hello 2");

    }
}
