package com.fastech.db.mongodb.repository.primary;

import com.fastech.db.mongodb.entity.*;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by mystoxlol on 2017/7/8, 14:22.
 * company: fastech
 * update record:
 */
@Component
public class FirstRepositoryTemplate
{
    @Autowired
    @Qualifier("firstMongoTemplate")
    MongoTemplate firstMongoTemplate;

    public void saveDoc(org.bson.Document document)
    {

        firstMongoTemplate.insert(document);


    }
    public String getDBName()
    {
        return firstMongoTemplate.getDb().getName();
    }
    public void saveDocs(List<org.bson.Document> documents)
    {

        firstMongoTemplate.insertAll(documents);


    }

    public void save(Object object)
    {
        System.out.println((ShardTestEntity)object);
        firstMongoTemplate.save(object);
    }



    public void save(FirstDB firstDB)
    {
        firstMongoTemplate.save(firstDB);

        Query query = new Query();
        Criteria criteria = new Criteria();
//        criteria.
//        criteria.regex();
//        query.addCriteria();
        BasicDBObject basicDBObject = new BasicDBObject();

        firstMongoTemplate.getCollection("alarm").find(basicDBObject);
    }



    /**
     * 查找删除
     * @param taskid
     * @return
     */
    public PreconditionTask findByIdAndDelete(String taskid){
        Criteria criteria = new Criteria();
        criteria.and("TASKID").is(taskid);


        Query query = Query.query(criteria);

//        query.addCriteria(criteria);
//        query.equals(taskid);
        List<PreconditionTask> preconditionTask = firstMongoTemplate.find(Query.query(Criteria.where("TASKID").is(taskid)), PreconditionTask.class);
        System.out.println(preconditionTask.size());
        System.out.println("传入的id："+taskid+" 删除的的任务对象：" + preconditionTask.get(0));
        return preconditionTask.get(0);

//        return sequence.getUid();
    }


    public void update(String alarmId, Map<String, Object> condition)
    {
        Criteria criteria = new Criteria();
        criteria.and("ALARMID").is(alarmId);
        criteria.and("EQUIPMENTTYPE").is(2001);

        Set<Map.Entry<String, Object>> set = condition.entrySet();
        Update update = new Update();

        for (Map.Entry<String, Object> entry:set)
        {
            update.set(entry.getKey(), entry.getValue());

        }


        WriteResult writeResult = firstMongoTemplate.updateFirst(Query.query(criteria), update,AlarmContent.class);
        System.out.println(writeResult.toString());
    }


    public List<String> groupTest()
    {

//        AggregationOperation aggregationOperation = GroupOperation();

        List<String> result = new ArrayList();
        Aggregation aggregation = Aggregation.newAggregation(Aggregation.group("neName1"));

        AggregationResults<DBObject> aggregationResults = firstMongoTemplate.aggregate(aggregation, "preconditionCache", DBObject.class);
        List<DBObject> list = aggregationResults.getMappedResults();
        for (DBObject dbObject : list)
        {
            if (dbObject.get("_id") != null)
            {
                result.add(dbObject.get("_id").toString());
            }
        }
        System.out.println(result.toString());
//        System.out.println(aggregationResults.getMappedResults());
//        GroupBy groupBy = GroupBy.key("neName").reduceFunction("function(result){}").initialDocument(new BasicDBObject());
//
//        GroupByResults<String> groupByResults =
//          firstMongoTemplate.group("preconditionCache", groupBy,String.class);
//       BasicDBList dbObject = (BasicDBList) groupByResults.getRawResults().get("retval");
////        dbObject.
////        dbObject.get("neName");
////        System.out.println(dbObject.get("neName"));
//        System.out.println(dbObject.toString());
//        System.out.println();

        return result;
    }



    public PreconditionCache findByNename(String neName)
    {
        return firstMongoTemplate.findOne(Query.query(Criteria.where("neName").is(neName)), PreconditionCache.class);
    }



}
