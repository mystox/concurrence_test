package com.fastech.db.mongodb.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by mystoxlol on 2017/5/18, 12:59.
 * company: fastech
 * update record:
 */
@Document(collection = "use")

public class TableId
{
    @Id
    @GeneratedValue
    private long useId;
    private String name;



    public long getUseId()
    {
        return useId;
    }

    public void setUseId(long useId)
    {
        this.useId = useId;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
