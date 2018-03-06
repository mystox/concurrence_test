package com.fastech.db.mongodb.repository.primary;

import com.fastech.db.mongodb.entity.Student;
import com.mongodb.BasicDBObject;
import org.springframework.data.mongodb.repository.ExistsQuery;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mystoxlol on 2017/6/20, 20:17.
 * company: fastech
 * update record:
 */
public interface StudentRepository extends MongoRepository<Student, Long>
{

    @ExistsQuery("?0")
    public boolean existsByCondition(BasicDBObject basicDBObject);

//    @Modifying
//    public void modifyByName();

}
