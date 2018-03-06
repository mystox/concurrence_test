package com.fastech.db.mongodb.config.mongo;

import com.mongodb.Bytes;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.ReadPreference;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by mystoxlol on 2017/8/1, 14:01.
 * company: fastech
 * update record:
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.fastech.db.mongodb.repository.redPreference", mongoTemplateRef = "redPreferenceMongoTemplate")
public class MongoReadPreferenceConfig
{
    @Value("${mystox.mongodb.readPreference.uri}")
    private String uri;

    @Bean(autowire = Autowire.BY_NAME, name = "redPreferenceMongoTemplate")
    public MongoTemplate redPreferenceMongoTemplate() throws Exception {
        //额外连接参数设置
        MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
        builder.connectionsPerHost(1000);
//        MongoClientOptions options = builder.build();
//        MongoClientOptions.Builder connectionOptions;
        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(new MongoClientURI(this.uri, builder));
        simpleMongoDbFactory.getDb().addOption(Bytes.QUERYOPTION_SLAVEOK);
        MongoTemplate mongoTemplate = new MongoTemplate(simpleMongoDbFactory);
        mongoTemplate.setReadPreference(ReadPreference.secondary());
        mongoTemplate.getDb().addOption(Bytes.QUERYOPTION_SLAVEOK);

        return mongoTemplate;
    }
}
