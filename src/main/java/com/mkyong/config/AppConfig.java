package com.mkyong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dc on 2015/7/14.
 * Annotate with @Configuration to tell spring that this is the core spring configuration file and define
 * bean via @Bean
 */
@Configuration
public class AppConfig {
    @Bean(name="helloBean")
    public HelloWorld helloWorld(){
        return new HelloWorldImpl();
    }
}
