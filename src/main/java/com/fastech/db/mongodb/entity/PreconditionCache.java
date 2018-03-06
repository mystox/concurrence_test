package com.fastech.db.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * Created by mystoxlol on 2017/10/11, 10:19.
 * company: fastech
 * update record:
 */
@Document
public class PreconditionCache
{

    @Id
    private String id;

    @Field(value = "ALARMID")
    private String alarmId;

    private EquipModel equipModel;

    private String neName;

    private String params;

    private Date cacheTime;

    public Date getCacheTime()
    {
        return cacheTime;
    }

    public void setCacheTime(Date cacheTime)
    {
        this.cacheTime = cacheTime;
    }

    public String getNeName()
    {
        return neName;
    }

    public void setNeName(String neName)
    {
        this.neName = neName;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getAlarmId()
    {
        return alarmId;
    }

    public void setAlarmId(String alarmId)
    {
        this.alarmId = alarmId;
    }

    public EquipModel getEquipModel()
    {
        return equipModel;
    }

    public void setEquipModel(EquipModel equipModel)
    {
        this.equipModel = equipModel;
    }

    public String getParams()
    {
        return params;
    }

    public void setParams(String params)
    {
        this.params = params;
    }


    @Override
    public String toString()
    {
        return "PreconditionCache{" +
                "id='" + id + '\'' +
                ", alarmId='" + alarmId + '\'' +
                ", equipModel=" + equipModel +
                ", neName='" + neName + '\'' +
                ", params='" + params + '\'' +
                ", cacheTime=" + cacheTime +
                '}';
    }
}
