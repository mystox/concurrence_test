package com.fastech.db.mongodb.repository.primary;

import com.fastech.db.mongodb.entity.PreconditionResult;
import com.mongodb.BasicDBObject;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * PreconditionTask数据库接口
 */

public interface PreconditionResultRepository extends MongoRepository<PreconditionResult, String>
{
    void insert(BasicDBObject basicDBObject);
    void save(BasicDBObject basicDBObject);


    public PreconditionResult findByAlarmId(String alarmId);





}
