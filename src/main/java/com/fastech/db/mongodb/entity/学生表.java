package com.fastech.db.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by mystoxlol on 2017/8/9, 14:42.
 * company: fastech
 * update record:
 */
public class 学生表
{


    @AutoIncKey
    @Id
    private Long id = 0L;// 为什么赋了默认值？文章后说明

    @Field(value = "name")
    private String name;

    private String 名字;


    public String get名字()
    {
        return 名字;
    }

    public void set名字(String 名字)
    {
        this.名字 = 名字;
    }

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

    @Override
    public String toString()
    {
        return "学生表{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", 名字='" + 名字 + '\'' +
                '}';
    }
}
