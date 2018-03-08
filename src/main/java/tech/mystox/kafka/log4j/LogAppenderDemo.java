package tech.mystox.kafka.log4j;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mystoxlol on 2018/3/8, 11:04.
 * company: fastech
 * update record:
 */
public class LogAppenderDemo
{
    private static Logger logger = Logger.getLogger(LogAppenderDemo.class);
    private static org.slf4j.Logger logger2 = LoggerFactory.getLogger(LogAppenderDemo.class);

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i <= 10; i++) {
            logger.info("This is Message [" + i + "] from log4j producer .. ");
            logger2.info("This is Message [" + i + "] from slf4j producer .. ");
            Thread.sleep(1000);
        }
    }
}
