package com.fastech.db.mongodb.repository.redPreference;

import com.fastech.db.mongodb.entity.学生表;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * Created by mystoxlol on 2017/8/1, 14:02.
 * company: fastech
 * update record:
 */
public interface ReadPreferenceRepositoryXuesheng extends MongoRepository<学生表, Long>
{

    Optional<学生表> findById(Long id);

}

