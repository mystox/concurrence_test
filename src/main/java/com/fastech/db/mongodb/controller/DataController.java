package com.fastech.db.mongodb.controller;

import com.fastech.db.mongodb.entity.Person;
import com.fastech.db.mongodb.entity.ResultResponse;
import com.fastech.db.mongodb.entity.TableId;
import com.fastech.db.mongodb.repository.main.UserRepository;
import com.fastech.db.mongodb.repository.primary.PersonRepository;
import com.fastech.db.mongodb.repository.primary.PrimaryRepositoryTemplate;
import com.fastech.db.mongodb.repository.secondary.PersonRepository2;
import com.fastech.db.mongodb.repository.tertiary.PersonRepository3;
import com.mongodb.BasicDBObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.OSInfo;

import javax.servlet.http.HttpServletRequest;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by mystoxlol on 2017/3/22 0022, 11:24.
 * company: fastech
 * update record:
 */
@RestController
public class DataController
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Value("${server.port}")
    private int port;

//    @Autowired
    UserRepository userRepository;

    @Autowired
//    PersonRepositoryOra personRepositoryOra;
    PersonRepository personRepositoryOra;
    @Autowired
    PersonRepository2 personRepository2;
    @Autowired
    PersonRepository3 personRepository3;
    private String info = "DB: mongodb 224 IP: " + Inet4Address.getLocalHost().getHostAddress() + " OS: " + OSInfo.getOSType();

    public DataController() throws UnknownHostException
    {
    }
   /* @Autowired
    PersonRepository personRepository;*/

    @RequestMapping("/save")
    public ResultResponse save(String count1, HttpServletRequest request)
    {





        int pi = 10000;
        String pp = request.getParameter("package");
        if (!org.springframework.util.StringUtils.isEmpty(pp))
        {
            pi = Integer.parseInt(pp);
        }
        String count = request.getParameter("count");
        logger.info("save" + ": " + count);
        int c = Integer.parseInt(count);
        ResultResponse response = new ResultResponse();
        response.setCount(c);
        Map documentMap =new HashMap();
//        documentMap.put("database", "mkyongDB");
        documentMap.put("table", "hosting");
        Map documentMapDetail =new HashMap();
        documentMapDetail.put("records", "99");
        documentMapDetail.put("index", "vps_index1");
        documentMapDetail.put("active", "true");
        documentMap.put("detail", documentMapDetail);
//        personRepositoryOra.insert(new BasicDBObject(documentMap));
//        userRepository.insert(new BasicDBObject(documentMap));

        Set<String> roles = new HashSet<>();
        roles.add("manage");
//        User user = new User(null,"user","12345678","name","ema/il@com.cn",new Date(),roles);
//        userRepository.save(user);
        try
        {
            List<TableId> listTable = new ArrayList<TableId>();
            List<Person> list = new ArrayList<Person>();
            if (c >= 1) {
                for (int i = 0; i < c ; i++)
                {


                    TableId tableId = new TableId();
                    tableId.setName("mystox" + i);
                    listTable.add(tableId);
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
                    list.add(p);
//                    personRepositoryOra.insert(tableId);

                }
            }
            /*List<List<Person>> r = new ArrayList<List<Person>>();
            List<Person> temp = new ArrayList<Person>();
            for (int i = 0; i <list.size() ; i++)
            {

                temp.add(list.get(i));
                if (i>0 && i%pi == 0)
                {
                    r.add(temp);
                    temp.clear();
                }

            }
            r.add(temp);*/

//            logger.info("package person end. package size is: " + r.size());
            long startTime = System.currentTimeMillis();
            try
            {
               /* int index = 0;
                for (int i = 0; i <r.size() ; i++)
                {
                    List<Person> t = r.get(i);
                    logger.info(pi + " data saved complete---"+ ++index);

                }*/

                personRepositoryOra.insert(list);
//                personRepository2.save(list);
//                personRepository3.save(list);
//                personRepositoryOra.insert(new BasicDBObject(documentMap));

            } catch (Exception e)
            {
                e.printStackTrace();
            }
            long endTime = System.currentTimeMillis();
            long execTime = endTime - startTime;
            response.setExecTime(execTime/1000 + " (millis:" + execTime + ")");
            response.setInformation(info);
            long total = personRepositoryOra.count();
            response.setTotal(total);
            logger.info("task ending");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sdf.format(new Date());
            response.setReponseTime(sdf.format(new Date()));
            response.setPort(port);
        } catch (Exception e)
        {
            e.printStackTrace();
            response.setException(e.toString());
        }
        return response;

    }
    @RequestMapping("/queryAll")
    public ResultResponse queryAll() {
        logger.info("queryAll coming");
        ResultResponse response = new ResultResponse();
        long startTime = System.currentTimeMillis();
        long count = personRepositoryOra.count();
        logger.info(count+"");
//        List<Person> result = (List<Person>) personRepositoryOra.findAll();
        long endTime = System.currentTimeMillis();
        long execTime = endTime - startTime;
//        response.setCount(result.size());
        response.setCount(count);
        response.setQueryCount(count);
        response.setExecTime(execTime/1000 + " (millis:" + execTime + ")");
        response.setInformation(info);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.format(new Date());
        response.setReponseTime(sdf.format(new Date()));
        response.setPort(port);
        return response;
    }
    @RequestMapping("/queryBy")
    public ResultResponse queryByCondition( HttpServletRequest request)
    {
        long queryCount;
        String condition = request.getParameter("id");
        String name = request.getParameter("name");
        logger.info("query coming" + condition + "name:" + name);
        ResultResponse response = new ResultResponse();
        long startTime = System.currentTimeMillis();
//        Person person = personRepositoryOra.findByName("name1");
        List<Person> listPerson = new ArrayList<Person>();

        if (name != null)
        {
            /* listPerson = personRepositoryOra.findByName(name);*/
            Sort sort = new Sort(Sort.Direction.DESC,"create_date");


            Pageable pageable = new PageRequest(1,5,sort);
//            queryCount = listPerson.size();
//        Person person = personRepositoryOra.findById(condition);
//            System.out.println(person.toString());
            BasicDBObject dbObject = new BasicDBObject();
            BasicDBObject dbObject2 = new BasicDBObject();
            dbObject.put("name",name);
            dbObject.put("id",condition);
//            Page<Person> result =  personRepositoryOra.findByCondition(dbObject,pageable);
//            queryCount = result.getSize();
//            List<Person> personList = result.getContent();
            long count = personRepositoryOra.count();
            logger.info(count+"");
            long endTime = System.currentTimeMillis();
            long execTime = endTime - startTime;
//        response.setPerson(person);
            response.setResult(listPerson);
            response.setCount(count);
//            response.setQueryCount(queryCount);
            response.setExecTime(execTime/1000 + " (millis:" + execTime + ")");
            response.setInformation(info);

            response.setPort(port);
//            response.setResult(personList);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sdf.format(new Date());
            response.setReponseTime(sdf.format(new Date()));
        }
        return response;
    }
    @RequestMapping("/queryByTimeScope")
    public ResultResponse queryByTimeScope(HttpServletRequest request)
    {
        ResultResponse reponse = null;
        try
        {
            String startTime = request.getParameter("startTime");
            logger.info("start time is" + startTime);
            String endTime = request.getParameter("endTime");
            logger.info("end time is" + endTime);
            reponse = new ResultResponse();
            long start = System.currentTimeMillis();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date startDate = sdf.parse(startTime);
            Date endDate = sdf.parse(endTime);

//            Document document = Document
            BasicDBObject dbObject = new BasicDBObject();
            BasicDBObject dbObject2 = new BasicDBObject();
            dbObject.append("$gte", startDate);
            dbObject.append("$lte", endDate);
            dbObject2.put("create_date", dbObject);


            int count;
            count =  personRepositoryOra.findCountByDateScope(dbObject2);
//            Pageable page = new Pageable();
//            personRepositoryOra.findByCondition(dbObject2,)
            long end = System.currentTimeMillis();
            long execTime = end - start;

            reponse.setExecTime(execTime/1000 + " (millis:" + execTime + ")");
            reponse.setQueryCount(count);
            reponse.setCount(count);
            reponse.setInformation(info);
            reponse.setPort(port);
            System.out.println("end");
            sdf.format(new Date());
            reponse.setReponseTime(sdf.format(new Date()));

            logger.info("query ending");
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return reponse;


    }
    /*@RequestMapping("exec")
    public ResultResponse execWhile(int count)
    {
        ResultResponse response = new ResultResponse();

    }*/
    @Autowired
    PrimaryRepositoryTemplate personReponsitoryTemplete;

    @RequestMapping(value = "/field")
    public String findByQueryField()
    {
        Map<String, Object> result = personReponsitoryTemplete.findById("name1");
        System.out.println(result.toString());
        BasicDBObject basicDBObject = new BasicDBObject();

        BasicDBObject basicDBObject1 = new BasicDBObject();
        BasicDBObject basicDBObject2 = new BasicDBObject();

        BasicDBObject bd = new BasicDBObject();
        bd.put("name", "name1");
        basicDBObject2.put("oid_",false);
        Person person = personRepositoryOra.findCondition();




        System.out.println(person.toString());
        return "";
    }

    public static void main(String[] args)
    {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person());
        System.out.println(list.toString());
    }

}
