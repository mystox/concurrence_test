package com.fastech.db.mongodb.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by mystoxlol on 2018/3/19, 11:06.
 * company: fastech
 * description:
 * update record:
 */
@Component
@PropertySource(value = "logconfig2.yml")//配置文件路径
@Configuration
public class ConfigDemo implements CommandLineRunner
{
    @Value("${com.mystox.name2}")
    private String name;

    @Value("${mystox.log2}")
    private String log;

    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public void run(String... args) throws Exception
    {
        logger.info("config demo server start test...---------------------------" + name);
        logger.info("config demo mystox.log=" + log);

    }
}
