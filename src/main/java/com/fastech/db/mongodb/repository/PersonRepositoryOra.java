package com.fastech.db.mongodb.repository;

import com.fastech.db.mongodb.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mystoxlol on 2017/4/10, 15:35.
 * company: fastech
 * update record:
 */
public interface PersonRepositoryOra extends CrudRepository<Person, Long>
{
    Person findByName(String name);



    Person findById(String id);

}
