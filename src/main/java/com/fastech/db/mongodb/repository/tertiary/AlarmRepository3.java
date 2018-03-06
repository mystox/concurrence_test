package com.fastech.db.mongodb.repository.tertiary;

import com.fastech.db.mongodb.entity.Alarm;
import com.mongodb.BasicDBObject;
import org.springframework.data.mongodb.repository.CountQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by mystoxlol on 2017/6/30, 13:39.
 * company: fastech
 * update record:
 */
public interface AlarmRepository3 extends MongoRepository<Alarm, String>
{
    @Query("?0")
    List<Alarm> findByCondition(BasicDBObject basicDBObject);

    @CountQuery("?0")
    long findCountByCondition(BasicDBObject basicDBObject);



}
