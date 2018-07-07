package tech.mystox.session.config.interceptor;

import com.sun.jmx.snmp.Timestamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Created by mystoxlol on 2018/6/19, 13:50.
 * company: kongtrolink
 * description:
 * update record:
 */
public class SessionTimeoutInterceptor implements HandlerInterceptor
{
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        HttpSession session = request.getSession();

        logger.info("sessionid:"+session.getId());
        String key = (String) session.getAttribute("admin");
//        logger.info(key);
        // 判断如果没有获取用户信息，就跳转至登录页面，提示用户登录
        if (session != null && session.getAttribute("admin") == null)
        {
            //根据请求的Header 判断请求是AJAX异步请求，则在响应中设置HTTP状态码，标注Session超时，由前段处理页面重定向
            if (request.getHeader("x-requested-with") != null
                    && request.getHeader("x-requested-with").equals("XMLHttpRequest"))
            {
                response.setStatus(999);//超时状态码
            }
            else
            {
                String contextPath = request.getContextPath();
                String redirectPath = contextPath+"/home";
                logger.info("redirect address: " + redirectPath);
                response.sendRedirect(redirectPath);
            }

            return false;
        }
        logger.info("session超时拦截器-------------------------");
        logger.info("session create time: " + new Timestamp(session.getCreationTime()).getDate().toString());
        logger.info("session max time: " + session.getMaxInactiveInterval());
        logger.info("" + new Timestamp(session.getLastAccessedTime()).toString());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
    {

    }

}
