package com.fastech.db.mongodb.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by mystoxlol on 2017/12/25, 15:37.
 * company: fastech
 * update record:
 */
@Document
public class ShardTestEntity
{
    @AutoIncKey
    Long id = 0L;

    public Long getId()
    {
        return id;
    }

    @Override
    public String toString()
    {
        return "ShardTestEntity{" +
                "id=" + id +
                '}';
    }
}
