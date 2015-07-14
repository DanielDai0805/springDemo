package com.mkyong.output;

import com.mkyong.output.helper.OutputHelper;
import com.mkyong.output.impl.CvsOutputGeneratorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dc on 2015/7/14.
 */
public class App {
    @Test
    public void testCallDirectly(){
        IOutputGenerator generator = new CvsOutputGeneratorImpl();
        generator.generatoeOutput();
    }

    @Test
    public void testCallWithHelper() throws Exception {
        OutputHelper helper = new OutputHelper();
        helper.generateOutput();

    }

    @Test
    public void testCallWithSpring() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"Spring-Common.xml"});
        final OutputHelper outputHelper = (OutputHelper)ac.getBean("OutputHelper");
        outputHelper.generateOutput();

    }
}
