package com.fastech.db.mongodb.controller;

import com.fastech.db.mongodb.entity.FirstDB;
import com.fastech.db.mongodb.entity.MainDB;
import com.fastech.db.mongodb.repository.main.MainRepositoryTemplete;
import com.fastech.db.mongodb.repository.primary.FirstRepositoryTemplate;
import com.fastech.db.mongodb.repository.secondary.SecondRepositoryTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mystoxlol on 2017/7/8, 14:16.
 * company: fastech
 * update record:
 */
@RestController
public class DataSourceTest
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private MainRepositoryTemplete mainRepositoryTemplete;

    @Autowired
    private FirstRepositoryTemplate firstRepositoryTemplate;

    @Autowired
    SecondRepositoryTemplate secondRepositoryTemplate;

    /**
     * 测试多数据源入库
     * @return
     */
    @RequestMapping("/insertMany")
    public String insert()
    {
        //主数据源
        MainDB mainDB = new MainDB();
        mainDB.setName("main");
        logger.info("main over");
        secondRepositoryTemplate.save(mainDB);
        //一号数据源
        FirstDB firstDB = new FirstDB();
        firstDB.setName("firset");
        logger.info("first over");
        firstRepositoryTemplate.save(firstDB);

        return "success";
    }


}
