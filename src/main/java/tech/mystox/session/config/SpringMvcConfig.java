package tech.mystox.session.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by mystoxlol on 2018/6/19, 13:18.
 * company: kongtrolink
 * description:
 * update record:
 */
@Configuration
public class SpringMvcConfig extends WebMvcConfigurationSupport
{

    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry)
    {
//        interceptorRegistry.addWebRequestInterceptor();
        /*interceptorRegistry.addInterceptor(new SessionTimeoutInterceptor()).addPathPatterns("*//**")
                .excludePathPatterns("/put**").excludePathPatterns("/home")
                .excludePathPatterns("/favicon**");*/
    }

}
