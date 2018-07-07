package tech.mystox.session.controller;

import com.fastech.db.mongodb.entity.TestCol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by mystoxlol on 2018/6/13, 16:42.
 * company: fastech
 * description:
 * update record:
 */
@RestController
public class SessonDemo
{
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/home")
    public String home()
    {
        logger.info("==========================");
//        httpSession.setAttribute("test",new Date());
//        response.setHeader("Access-Control-Allow-Origin","*");
        return "hello world!!";
    }
    @RequestMapping("/put")
    public String put(HttpSession session, @RequestParam("key") String key,
                      @RequestParam("value") String value)
    {
//        session.setMaxInactiveInterval(30);
        session.setAttribute(key,value);
        return "put ok!";

    }
    @RequestMapping("/put2")
    public String putTest()
    {
        return "put2";
    }
    @RequestMapping("/get")
    public String get(HttpSession session, @RequestParam("key") String key)
    {
        String value = (String) session.getAttribute(key);
        System.out.println(value);
        System.out.println(session.getMaxInactiveInterval());
        return "get " + (value !=  null ? value: "null");
    }

    @RequestMapping("/redirect")
    public String redirect(HttpServletResponse response) throws IOException
    {
        response.sendRedirect("");
        return "redirect:www.baidu.com";
    }

    @RequestMapping("/destroySession")
    public String destroySession(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        System.out.println("destroy session");
        request.getSession().invalidate();
        response.sendRedirect("/home");
        return "success";
    }

    @RequestMapping("/getUser")
    public TestCol getUser()
    {
        TestCol testCol = new TestCol();
        testCol.setId(123l);
        return testCol;
    }



}
