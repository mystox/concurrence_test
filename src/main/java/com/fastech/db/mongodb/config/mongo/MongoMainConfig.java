package com.fastech.db.mongodb.config.mongo;

import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * Created by mystoxlol on 2017/5/8, 14:10.
 * company: fastech
 * update record:
 */
//@Configuration
//@EnableMongoRepositories(basePackages = "com.fastech.db.mongodb.repository.main", mongoTemplateRef = "mainMongoTemplate")
public class MongoMainConfig
{
    @Value("${mystox.mongodb.main.uri}")
    private String uri;

    @Bean(autowire = Autowire.BY_NAME, name = "mainMongoTemplate")
//    @Primary //需要加上主数据源
    public MongoTemplate mainMongoTemplate() throws Exception {
        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(new MongoClientURI(this.uri));
        return new MongoTemplate(simpleMongoDbFactory);
    }
}
