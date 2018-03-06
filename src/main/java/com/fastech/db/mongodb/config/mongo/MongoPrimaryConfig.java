package com.fastech.db.mongodb.config.mongo;

import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by mystoxlol on 2017/5/8, 14:10.
 * company: fastech
 * update record:
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.fastech.db.mongodb.repository.primary", mongoTemplateRef = "firstMongoTemplate")
public class MongoPrimaryConfig
{
    @Value("${mystox.mongodb.primary.uri}")

    private String uri;

    @Bean(autowire = Autowire.BY_NAME, name = "firstMongoTemplate")
    @Primary //需要加上主数据源
    public MongoTemplate firstMongoTemplate() throws Exception {
        //额外连接参数设置
//        MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
//        builder.connectionsPerHost(200);
//        MongoClientOptions options = builder.build();
//        MongoClientOptions.Builder connectionOptions;
//        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(new MongoClientURI(this.uri,builder));
        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(new MongoClientURI(this.uri));
        return new MongoTemplate(simpleMongoDbFactory);
    }


//    public static void main(String[] args)
//    {
//        String s = "1,2,3,4,";
//        String[] r = s.split(",",-1);
//        int i = r.length;
//        System.out.println(i);
//
//    }
}
