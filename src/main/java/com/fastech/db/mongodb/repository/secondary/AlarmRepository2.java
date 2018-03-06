package com.fastech.db.mongodb.repository.secondary;

import com.fastech.db.mongodb.entity.AlarmDB;
import com.mongodb.BasicDBObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * Created by mystoxlol on 2017/6/30, 13:39.
 * company: fastech
 * update record:
 */
public interface AlarmRepository2 extends MongoRepository<AlarmDB, String>
{
    @Query("?0")
    Page<AlarmDB> findByCondition(BasicDBObject condition, Pageable pageable);

//    Page<AlarmDB> invokeFindAll(Pageable pageable);


}
