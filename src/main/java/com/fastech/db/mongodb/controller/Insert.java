package com.fastech.db.mongodb.controller;

import com.fastech.db.mongodb.entity.AlarmDB;
import com.fastech.db.mongodb.entity.Person;
import com.fastech.db.mongodb.repository.primary.FirstRepositoryTemplate;
import com.fastech.db.mongodb.repository.primary.PersonRepository;
import com.fastech.db.mongodb.repository.primary.PrimaryRepositoryTemplate;
import com.fastech.db.mongodb.repository.redPreference.MemoryRepositoryTemplate;
import com.fastech.db.mongodb.repository.secondary.AlarmRepository2;
import com.fastech.db.mongodb.repository.secondary.SecondRepositoryTemplate;
import com.fastech.db.mongodb.repository.tertiary.AlarmRepository3;
import com.fastech.db.mongodb.repository.tertiary.TertiaryRepositoryTemplate;
import com.mongodb.BasicDBObject;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.*;

/**
 * Created by mystoxlol on 2017/6/6, 18:39.
 * company: fastech
 * update record:
 */
@RestController
public class Insert
{

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Value("${server.port}")
    private int port;


    @Autowired
    MemoryRepositoryTemplate memoryRepositoryTemplate;

    @Autowired
    PrimaryRepositoryTemplate primaryRepositoryTemplate;
    @Autowired
    TertiaryRepositoryTemplate tertiaryRepositoryTemplate;
    @Autowired
    SecondRepositoryTemplate secondRepositoryTemplate;

    @Autowired
    FirstRepositoryTemplate firstRepositoryTemplate;
    @Autowired
//    PersonRepositoryOra personRepositoryOra;
            PersonRepository personRepository;
    @Autowired
    AlarmRepository2 alarmRepository2;
    @Autowired
    AlarmRepository3 alarmRepository3;

    @RequestMapping("/insertP")
    public String insertPersonCappe()
    {

        int c = 1;
        int count = 1;
        Person p = new Person();
        p.setAlarmLevel("1");
        p.setDescription("12312313123131312dafdsfasfasfsaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa3123" + UUID.randomUUID());
        p.setCreate_date(new Timestamp(System.currentTimeMillis()));
        p.setLevel_("25");
        p.setName("name" + c);
        p.setOid_("1.1.2.3.4.5.6.7");
        p.setValue1("value1" + count);
        p.setValue2("value2" + count);
        p.setValue3("value3" + count);
        p.setValue4("value4" + count);
        p.setValue5("value5" + count);
        p.setValue6("value6" + count);
        p.setValue7("value7" + count);
        p.setValue8("value8" + count);
        p.setValue9("value9" + count);
        p.setValue10("value10" + count);
        p.setValue11("value11" + count);
        p.setValue12("value12" + count);
        p.setValue13("value13" + count);
        p.setValue14("value14" + count);
        personRepository.insert(p);


        AlarmDB alarmDB = new AlarmDB();

        return "success";
    }


    @RequestMapping("/synchronizeOnline")
    public String synchronizeOnline(int count)
    {
        Sort sort = new Sort(Sort.Direction.DESC, "INSERTTIME");

        BasicDBObject dbObject = new BasicDBObject();
        Pageable pageable = new PageRequest(1, count, sort);
        System.out.println(alarmRepository2.count());
        Page<AlarmDB> alarmPages = alarmRepository2.findAll(pageable);
        System.out.println(alarmPages.getContent().size());
//        alarmRepository3.save(alarmPages.getContent());

        return "success";
    }


    @RequestMapping("/shardTest")
    public String save(long count, int datasource, boolean isBatch, int thread, boolean flag)
    {
        logger.info("task receiver ..." + count + datasource + isBatch + thread + flag);

        ControllerInstance.getInstance().setFlag(flag);
        if (!flag)
            return "flag is off, set flag=true if u execute task...";
        String dbName = "";
        switch (datasource)
        {
            case 1:
                dbName = firstRepositoryTemplate.getDBName();
                break;
            case 2:
                dbName = secondRepositoryTemplate.getDBName();
                break;
            case 3:
                dbName = tertiaryRepositoryTemplate.getDBName();
                break;
        }

        final String dbNamef = dbName;
        for (int j = 0; j < thread; j++)
        {
            final int b = j;
            Runnable runnable = new Runnable()
            {
                @Override
                public void run()
                {
//                    int b = (int)(Math.random()*100 +1);
                    logger.info("task beginning...");

//                    String dbName = "";
                    List<Document> documents = new ArrayList<>();
                    long startTime = System.currentTimeMillis();
                    long index = 0l;
                    long tempTime = startTime;
                    try
                    {
                        for (long i = 0l; i < count; i++)
                        {
                            index = i;
                            if (!ControllerInstance.getInstance().isFlag()) break;
//                            System.out.println(i);
                            Map<String, Object> map = new HashMap<String, Object>();
                            //        map.put("_id", UUID.randomUUID().toString());
//                            map.put("_id", UUI);//primaryRepositoryTemplate.getSequenceId("shard_test")
//                            if (i == count - 1) logger.info("last id is: " + map.get("_id"));
                            map.put("name", UUID.randomUUID().toString().substring(0, 10));
                            map.put("age", (int) (Math.random() * 900 + 1));
                            map.put("eventTime", new Date());
                            map.put("firstStatus", (int) (Math.random() * 10 + 1));
                            Document document = new Document();
                            document.putAll(map);
                            documents.add(document);

                            if (documents.size() % 10000 == 0)
                            {

                                long timeStamp = System.currentTimeMillis();
                                long e_time = timeStamp - tempTime;
                                tempTime = timeStamp;

                                logger.info(i + 1 + " -------  " + b + " average statistics : "+ new BigDecimal(10000).divide(new BigDecimal((e_time > 1000 ? e_time : 1000)/1000),0,BigDecimal.ROUND_HALF_UP) + "/s");
                                documents = new ArrayList<>();
                            }
                            if (datasource == 1) //一个点
                            {
                                if (isBatch)
                                {
                                    logger.info("1 " + firstRepositoryTemplate.getDBName());
                                    if (documents.size() % 10000 == 0)
                                    {
                                        firstRepositoryTemplate.saveDocs(documents);
                                        documents = new ArrayList<>();
                                    }
                                } else
                                {
                                    firstRepositoryTemplate.saveDoc(document);
                                }


                            }
                            if (datasource == 2) //两个点
                            {

                                if (isBatch)
                                {

                                    if (documents.size() % 10000 == 0)
                                    {
                                        secondRepositoryTemplate.saveDocs(documents);
                                        documents = new ArrayList<>();
                                    }
                                } else
                                {
                                    secondRepositoryTemplate.saveDoc(document);
                                }

                            }
                            if (datasource == 3) //三个点
                            {


                                if (isBatch)
                                {
                                    logger.info("3 " + tertiaryRepositoryTemplate.getDBName());
                                    if (documents.size() % 10000 == 0)
                                    {
                                        tertiaryRepositoryTemplate.saveDocs(documents);
                                        documents = new ArrayList<>();
                                    }
                                } else
                                {

                                    try
                                    {
                                        tertiaryRepositoryTemplate.saveDoc(document);
                                    } catch (Exception e)
                                    {
                                        logger.info("save after 30 s "+e.toString());;
                                        Thread.sleep(30000);
                                        try
                                        {
                                            tertiaryRepositoryTemplate.saveDoc(document);
                                        } catch (Exception e1)
                                        {
                                            e1.printStackTrace();
                                        }
                                    }
                                }

                            }
                        }




                    } catch (Throwable e)
                    {
                        e.printStackTrace();
                    } finally
                    {
                        long endTime = System.currentTimeMillis();
                        long executeTime = endTime - startTime;
                        logger.info(b + "datasource is: " + datasource + "_" + dbNamef
                                + " execute time is: " + executeTime
                                + " execute count is: " + (index+1)
                                + " average statistics: " + index / ((executeTime > 1000 ? executeTime : 1000) / 1000) + "/s"
                        );
                    }
                }
            };
            Thread t = new Thread(runnable);

            t.start();
        }


        return "task beginning...";
    }



}
