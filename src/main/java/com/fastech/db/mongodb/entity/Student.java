package com.fastech.db.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by mystoxlol on 2017/6/20, 20:03.
 * company: fastech
 * update record:
 */
@Document(collection = "student")
public class Student
{

    @AutoIncKey
    @Id
    private Long id = 0L;// 为什么赋了默认值？文章后说明

    @Field(value = "name")
    private String name;

    private Integer age;


    private String NENAME;


    public Integer getAge()
    {
        return age;
    }

    public String getNENAME()
    {
        return NENAME;
    }

    public void setNENAME(String NENAME)
    {
        this.NENAME = NENAME;
    }

    public void setAge(Integer age)
    {
        this.age = age;
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
