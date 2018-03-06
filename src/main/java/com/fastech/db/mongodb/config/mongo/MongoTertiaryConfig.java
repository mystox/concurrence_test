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
 * Created by mystoxlol on 2017/5/8, 23:08.
 * company: fastech
 * update record:
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.fastech.db.mongodb.repository.tertiary", mongoTemplateRef = "tertiaryMongoTemplate")
public class MongoTertiaryConfig
{
    @Value("${mystox.mongodb.tertiary.uri}")
    private String uri;

    @Bean(autowire = Autowire.BY_NAME, name = "tertiaryMongoTemplate")
    public MongoTemplate tertiaryMongoTemplate() throws Exception {


       /* MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
        builder.socketKeepAlive(true);
//        builder.heartbeatConnectTimeout(1000);
//        builder.maxConnectionLifeTime(3000);
//        builder.maxConnectionIdleTime(3000);
        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(new MongoClientURI(this.uri, builder));
        simpleMongoDbFactory.getDb().addOption(Bytes.QUERYOPTION_SLAVEOK);
        MongoTemplate mongoTemplate = new MongoTemplate(simpleMongoDbFactory);
        mongoTemplate.setReadPreference(ReadPreference.secondary());
        mongoTemplate.getDb().addOption(4);*/
        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(new MongoClientURI(this.uri));
        return new MongoTemplate(simpleMongoDbFactory);

//        return mongoTemplate;
    }
}
