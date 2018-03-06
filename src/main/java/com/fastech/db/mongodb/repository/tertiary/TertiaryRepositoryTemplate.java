package com.fastech.db.mongodb.repository.tertiary;

import com.fastech.db.mongodb.entity.Alarm;
import com.fastech.db.mongodb.entity.AlarmDB;
import com.mongodb.*;
import org.apache.commons.beanutils.BeanUtils;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by mystoxlol on 2017/7/8, 16:26.
 * company: fastech
 * update record:
 */
@Component
public class TertiaryRepositoryTemplate
{
    @Autowired
    @Qualifier("tertiaryMongoTemplate")
    private MongoTemplate tertiaryMongoTemplate;


    public void save(AlarmDB testCol)
    {

        tertiaryMongoTemplate.save(testCol);
    }
    public void update()
    {


    }


    public void saveDoc(org.bson.Document document)
    {

        tertiaryMongoTemplate.insert(document);


    }

    public void saveDocs(List<Document> documents)
    {

        tertiaryMongoTemplate.insertAll(documents);


    }


    public List<Alarm> findByCondition(BasicDBObject basicDBObject, BasicDBObject keys)
    {
        List<Alarm> alarmContents = new ArrayList<>();
        Set<String> keyList = keys.keySet();
        DBCollection dbCollection = tertiaryMongoTemplate.getCollection("alarm");
        dbCollection.addOption(4);
        dbCollection.setReadPreference(ReadPreference.secondary());
//        dbCollection.setObjectClass(AlarmContent.class);
//        dbCollection.find(basicDBObject,keys);

        DBCursor dbCursor = null;
        try
        {
            dbCursor = dbCollection.find(basicDBObject).limit(10000);
//            dbCursor.count();
            Iterator<DBObject> iterator = dbCursor.iterator();
//            dbCursor.toArray();
            while (iterator.hasNext())
            {
                DBObject dbObject = iterator.next();
                Alarm alarm = new Alarm();
                alarm = dbObject2Bean(dbObject,alarm,keyList);
                alarmContents.add(alarm);
////                System.out.println(alarm.toString());
////                Alarm alarm = (Alarm)iterator.next();
////                alarmContents.add(dbObject);
//
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            dbCursor.close();
        }
//        dbCursor.close();
        return alarmContents;

    }

    public long findCountByCondition(BasicDBObject basicDBObject, BasicDBObject keys)
    {
        List<Alarm> alarmContents = new ArrayList<>();
        Set<String> keyList = keys.keySet();
        tertiaryMongoTemplate.setReadPreference(ReadPreference.secondary());
        tertiaryMongoTemplate.getDb().addOption(4);

        DBCollection dbCollection = tertiaryMongoTemplate.getCollection("alarm");

        dbCollection.count();
//        dbCollection.setObjectClass(AlarmContent.class);
//        dbCollection.find(basicDBObject,keys);
        long result = 0l;
        DBCursor dbCursor = null;
        try
        {
            dbCursor = dbCollection.find(basicDBObject,keys);
            result = dbCollection.count(basicDBObject);
//            return dbCursor.count();
            /*Iterator<DBObject> iterator = dbCursor.iterator();
//            dbCursor.toArray();
            while (iterator.hasNext())
            {
                DBObject dbObject = iterator.next();
                Alarm alarm = new Alarm();
                alarm = dbObject2Bean(dbObject,alarm,keyList);
                alarmContents.add(alarm);
////                System.out.println(alarm.toString());
////                Alarm alarm = (Alarm)iterator.next();
////                alarmContents.add(dbObject);
//
            }*/

        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            dbCursor.close();
        }
//        dbCursor.close();
        return result;

    }

    /**
     * 把DBObject转换成bean对象
     * @param dbObject
     * @param bean
     * @return
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static <T> T dbObject2Bean(DBObject dbObject, T bean, Set<String> keyList) throws IllegalAccessException,
            InvocationTargetException, NoSuchMethodException {
        if (bean == null) {
            return null;
        }
//        BeanUtils.copyProperties(dbObject.toMap(),bean);
        for (String field : keyList)
        {
            Object object = dbObject.get(field);
            if (object != null) {
                BeanUtils.setProperty(bean,field,object);
            }

        }
        /*Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            String varName = field.getName();
            Object object = dbObject.get(varName);
            if (object != null) {
                BeanUtils.copyProperties(dbObject,bean);
            }
        }*/
        return bean;
    }

    public Alarm findOneCacheAndRemove()
    {
        Alarm alarm = new Alarm();
        Criteria criteria = new Criteria();
        Query query = new Query(criteria);
        query.limit(1);
        alarm = tertiaryMongoTemplate.findAndRemove(query, Alarm.class);
        return alarm;
    }


    public String getDBName()
    {
        return tertiaryMongoTemplate.getDb().getName();
    }

}
