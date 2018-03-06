package com.fastech.db.mongodb.repository.secondary;

import com.fastech.db.mongodb.entity.MainDB;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by mystoxlol on 2017/7/8, 16:26.
 * company: fastech
 * update record:
 */
@Component
public class SecondRepositoryTemplate
{
    @Autowired
    @Qualifier("secondaryMongoTemplate")
    private MongoTemplate secondaryMongoTemplate;


    public void save(MainDB mainDB)
    {
//        secondMongoTemplate.fac
        secondaryMongoTemplate.save(mainDB);
    }
    public void saveListMap()
    {
//        secondMongoTemplate.fac
        secondaryMongoTemplate.dropCollection("insert_map");//清空表
        BasicDBList result = new BasicDBList();

        DBObject map = new BasicDBObject();

        map.put("a", "b");
        map.put("你好", "我不好");
        result.add(map);
        DBObject map2 = new BasicDBObject();

        result.add(map2);
        secondaryMongoTemplate.insert(result,"insert_map");//入库
//        secondaryMongoTemplate.save(mainDB);
    }

    public void saveDoc(org.bson.Document document)
    {

        secondaryMongoTemplate.insert(document);


    }

    public void saveDocs(List<Document> documents)
    {

        secondaryMongoTemplate.insertAll(documents);


    }
    public String getDBName()
    {
        return secondaryMongoTemplate.getDb().getName();
    }
}
