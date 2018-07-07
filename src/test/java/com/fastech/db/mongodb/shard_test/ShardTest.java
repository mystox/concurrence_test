package com.fastech.db.mongodb.shard_test;

import com.fastech.db.mongodb.repository.primary.FirstRepositoryTemplate;
import org.bson.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * Created by mystoxlol on 2017/12/25, 13:58.
 * company: fastech
 * update record:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardTest
{
    @Autowired
    FirstRepositoryTemplate firstRepositoryTemplate;

    Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

    Long a;

    @Test
    public void contextLoads()
    {

    }
//    @Test
    public void save()
    {


        for (int j=0; j < 10; j ++)
        {
            Runnable runnable = new Runnable()
            {
                @Override
                public void run()
                {
                    int b = (int)(Math.random()*100 +1);
                    logger.info("task beginning...");

                    List<Document> documents = new ArrayList<>();
                    try
                    {
                        for (long i=0l;i<1000000000l;i++)
                        {

//                            System.out.println(i);
                            Map<String, Object> map = new HashMap<String, Object>();
    //        map.put("_id", UUID.randomUUID().toString());
                            map.put("name", UUID.randomUUID().toString().substring(0,10));;
                            map.put("age", (int)(Math.random()*900 + 1));
                            map.put("eventTime", new Date());
                            map.put("firstStatus", (int)(Math.random()*10 + 1));
                            Document document = new Document();
                            document.putAll(map);
                            documents.add(document);

                            if (documents.size()>10000)
                            {

                                logger.info("insert 100000 over" +b);
                                logger.info(i +"");
//                                firstRepositoryTemplete.saveDocs(documents);
                                documents=new ArrayList<>();
                            }
                        }
                    } catch (Throwable e)
                    {
                        e.printStackTrace();
                    } finally
                    {
                    }
                }
            };
            Thread t = new Thread(runnable);

            t.start();
        }




    }
    public static void main(String[] args)
    {

    }
}
