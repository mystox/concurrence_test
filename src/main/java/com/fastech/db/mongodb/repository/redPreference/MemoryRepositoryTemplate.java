package com.fastech.db.mongodb.repository.redPreference;

import com.fastech.db.mongodb.entity.Sequence;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mystoxlol on 2017/6/1, 17:52.
 * company: fastech
 * update record:
 */
@Component
public class MemoryRepositoryTemplate
{
    @Autowired
    @Qualifier("redPreferenceMongoTemplate")
    MongoTemplate redPreferenceMongoTemplate;


    public Long getSequenceId(String sequenceName){
        Criteria criteria = new Criteria();
        criteria.where("name").is(sequenceName);
        Query query = new Query(criteria);
        Update update = new Update();
        update.inc("uid", 1);
        FindAndModifyOptions options = new FindAndModifyOptions();
        options.upsert(true);
        options.returnNew(true);
        Sequence sequence = redPreferenceMongoTemplate.findAndModify(query, update, options, Sequence.class);
        return sequence.getUid();
    }

    public Map<String, Object> findById(String id)
    {
        /*BasicDBObject jsonSql = new BasicDBObject();
        Query query = new Query();
        DBCursor db = mongoTemplate.executeQuery(jsonSql,"person");
        CommandResult commandResult = mongoTemplate.executeCommand(jsonSql);
        mongoTemplate.mapReduce()*/

        String s = "";
        Map<String, Object> map = new HashMap<String, Object>();

        DBCollection collection = (DBCollection) redPreferenceMongoTemplate.getCollection("person");
        BasicDBObject jsonSql = new BasicDBObject();
        jsonSql.put("name", "name1");
        DBCursor dbCursor = collection.find(jsonSql);

        while (dbCursor.hasNext())
        {
            DBObject dbObject = dbCursor.next();
            map.put("name", dbObject.get("name"));

        }

        return map;

    }


    public void save(Object objectToSave, String collectionName)
    {
//        Person person =new Person();
//        person.setAge(15);
//        person.setName("zhangsan");
        redPreferenceMongoTemplate.save(objectToSave);

    }





}
