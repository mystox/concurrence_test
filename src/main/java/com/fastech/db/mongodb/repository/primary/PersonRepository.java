package com.fastech.db.mongodb.repository.primary;

import com.fastech.db.mongodb.entity.Person;
import com.mongodb.BasicDBObject;
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

public interface PersonRepository extends MongoRepository<Person, String>
{



    void insert(BasicDBObject basicDBObject);



    List<Person> findByName(String name);

//    @Query("{\"create_date\":{$gte: ?0,$lte: ?1}}")
//    @Query("?0")
//    Map<String, Object> findCondition(BasicDBObject condition, Pageable pageable);
    @Query("{'name':'name1'},{'name':1,'oid_':0}")

    Person findCondition();
    @CountQuery("?0")
    int findCountByDateScope(BasicDBObject condition);

//    Person findByCreate_date(BasicDBObject timeStamp);


    Optional<Person> findById(String id);





}
