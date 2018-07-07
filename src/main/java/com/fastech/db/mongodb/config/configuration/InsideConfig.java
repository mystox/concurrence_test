package com.fastech.db.mongodb.config.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by mystoxlol on 2018/3/30, 17:21.
 * company: fastech
 * description:
 * update record:
 */
@Component
@PropertySource(value = "inside-config.yml")//配置文件路径
@Configuration
public class InsideConfig
{
//    @Value("${mystox.config.name}")
    private String configName;
    public void test()
    {


        System.out.println("内部配置文件测试"+configName);
    }
}
