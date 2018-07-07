package com.fastech.db.mongodb.repository.tertiary;

import com.fastech.db.mongodb.entity.Person;
import com.mongodb.BasicDBObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.CountQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * Created by mystoxlol on 2017/3/22 0022, 11:12.
 * company: fastech
 * update record:
 */

public interface PersonRepository3 extends MongoRepository<Person, String>
{





    List<Person> findByName(String name);

//    @Query("{\"create_date\":{$gte: ?0,$lte: ?1}}")
    @Query("?0")
    Page<Person> findByCondition(BasicDBObject condition, Pageable pageable);
    @CountQuery("?0")
    int findCountByDateScope(BasicDBObject condition);

//    Person findByCreate_date(BasicDBObject timeStamp);


    Optional<Person> findById(String id);
}
