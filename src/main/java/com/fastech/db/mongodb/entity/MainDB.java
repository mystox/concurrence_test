package com.fastech.db.mongodb.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by mystoxlol on 2017/7/8, 14:10.
 * company: fastech
 * update record:
 */
public class MainDB
{
    @AutoIncKey
    @Id
    private Long id = 0L;// 为什么赋了默认值？文章后说明
    private String name;


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
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
