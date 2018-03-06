package com.fastech.db.mongodb.config.mongo;

import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by mystoxlol on 2017/5/8, 14:14.
 * company: fastech
 * update record:
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.fastech.db.mongodb.repository.secondary", mongoTemplateRef = "secondaryMongoTemplate")
public class MongoSecondaryConfig
{
    @Value("${mystox.mongodb.secondary.uri}")
    private String uri;

    @Bean(autowire = Autowire.BY_TYPE, name = "secondaryMongoTemplate")
    public MongoTemplate secondaryMongoTemplate() throws Exception {
        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(new MongoClientURI(this.uri));
        System.out.println("this is secondary uri..." + uri);
        return new MongoTemplate(simpleMongoDbFactory);
    }

}
