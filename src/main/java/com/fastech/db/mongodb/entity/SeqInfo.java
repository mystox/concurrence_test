package com.fastech.db.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by mystoxlol on 2017/6/20, 20:00.
 * company: fastech
 * update record:
 */
@Document(collection = "sequence")
public class SeqInfo
{
    @Id
    private String id;

    @Field
    private String collName;// 集合名称

    @Field
    private Long seqId;// 序列值

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getCollName()
    {
        return collName;
    }

    public void setCollName(String collName)
    {
        this.collName = collName;
    }

    public Long getSeqId()
    {
        return seqId;
    }

    public void setSeqId(Long seqId)
    {
        this.seqId = seqId;
    }
}
