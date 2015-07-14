package com.mkyong.config.importtag;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dc on 2015/7/14.
 */
@Configuration
public class SchedulerConfig {
    @Bean(name="scheduler")
    public SchedulerBo suchedulerBo(){

        return new SchedulerBo();

    }
}
