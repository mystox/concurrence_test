package com.fastech.db.mongodb.repository.primary;

import com.fastech.db.mongodb.entity.TestCol;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mystoxlol on 2017/10/12, 19:54.
 * company: fastech
 * update record:
 */
public interface TestColFistRepository extends MongoRepository<TestCol, Long>
{
    TestCol findById(Long id);
}
