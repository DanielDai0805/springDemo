package com.mkyong.config.importtag;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by dc on 2015/7/14.
 */

@Configuration
@Import({CustomerConfig.class,SchedulerConfig.class})
public class AppConfig {
}
