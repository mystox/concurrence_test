package tech.mystox.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by mystoxlol on 2018/6/13, 15:37.
 * company: fastech
 * description:
 * update record:
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class,MongoAutoConfiguration.class,MongoDataAutoConfiguration.class})

//@EnableMongoHttpSession
@EnableRedisHttpSession
public class SessionTestApplication
{
    //测试git提交 2time
    public static void main(String[] args)
    {
        SpringApplication.run(SessionTestApplication.class, args);
    }
}
