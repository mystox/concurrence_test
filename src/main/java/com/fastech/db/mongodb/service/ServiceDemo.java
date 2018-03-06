package com.fastech.db.mongodb.service;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by mystoxlol on 2018/2/28, 15:27.
 * company: fastech
 * update record:
 */
@Component
//@PropertySource(value = "classpath:logconfig.yml")//配置文件路径
//@Configuration
//@Profile(value = "logconfig")
public class ServiceDemo implements CommandLineRunner
{
//    @Value("${com.mystox.name}")
    private String name;

//    @Value("${mystox.log}")
    private String log;

    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public void run(String... args) throws Exception
    {
        logger.info("server start test...---------------------------" + name);
        logger.info("mystox.log=" + log);

    }
}
