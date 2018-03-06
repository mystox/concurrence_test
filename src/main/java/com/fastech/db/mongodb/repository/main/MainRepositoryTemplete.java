package com.fastech.db.mongodb.repository.main;

import com.fastech.db.mongodb.entity.MainDB;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by mystoxlol on 2017/7/8, 14:09.
 * company: fastech
 * update record:
 */
@Component
public class MainRepositoryTemplete
{
//    @Autowired
    MongoTemplate mainMongoTemplate;


    public void save(MainDB mainDB)
    {
        mainMongoTemplate.save(mainDB);
    }




}
