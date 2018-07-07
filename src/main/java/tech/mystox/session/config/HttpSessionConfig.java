package tech.mystox.session.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;

/**
 * Created by mystoxlol on 2018/6/13, 16:34.
 * company: fastech
 * description:
 * update record:
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 300,redisNamespace = "db02")
public class HttpSessionConfig
{
    @Bean
    public HttpSessionStrategy httpSessionStrategy()
    {
        return new CookieHttpSessionStrategy();
    }

    @Bean
    public static ConfigureRedisAction configureRedisAction()
    {
        return ConfigureRedisAction.NO_OP;
    }
}
