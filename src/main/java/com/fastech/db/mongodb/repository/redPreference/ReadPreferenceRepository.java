package com.fastech.db.mongodb.repository.redPreference;

import com.fastech.db.mongodb.entity.TestCol;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mystoxlol on 2017/8/1, 14:02.
 * company: fastech
 * update record:
 */
public interface ReadPreferenceRepository extends MongoRepository<TestCol, Long>
{

    TestCol findById(Long id);

}

