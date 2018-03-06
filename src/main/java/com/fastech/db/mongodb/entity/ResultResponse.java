package com.fastech.db.mongodb.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

/**
 * Created by mystoxlol on 2017/3/22 0022, 11:30.
 * company: fastech
 * update record:
 */
public class ResultResponse
{
    private long count;
    private String execTime;
    private String speed;
    private Person person;
    private String information;
    private String exception;
    private long total;
    private String reponseTime;
    private List<Person> personList;
    private Object result;
    private long queryCount;
    private int port;


    public String getSpeed()
    {
        return speed;
    }

    public void setSpeed(String speed)
    {
        this.speed = speed;
    }

    public int getPort()
    {
        return port;
    }

    public void setPort(int port)
    {
        this.port = port;
    }

    public Object getResult()
    {
        return result;
    }

    public void setResult(Object result)
    {
        this.result = result;
    }

    public long getQueryCount()
    {
        return queryCount;
    }

    public void setQueryCount(long queryCount)
    {
        this.queryCount = queryCount;
    }

    public List<Person> getPersonList()
    {
        return personList;
    }

    public void setPersonList(List<Person> personList)
    {
        this.personList = personList;
    }

    public String getReponseTime()
    {
        return reponseTime;
    }

    public void setReponseTime(String reponseTime)
    {
        this.reponseTime = reponseTime;
    }

    public String getException()
    {
        return exception;
    }

    public void setException(String exception)
    {
        this.exception = exception;
    }

    public long getTotal()
    {
        return total;
    }

    public void setTotal(long total)
    {
        this.total = total;
    }

    public Person getPerson()
    {
        return person;
    }

    public void setInformation(String information)
    {
        this.information = information;
    }

    public String getInformation()
    {
        return information;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    public long getCount()
    {
        return count;
    }

    public void setCount(long count)
    {
        this.count = count;
    }

    public String getExecTime()
    {

        return execTime;
    }

    public void setExecTime(String execTime)
    {

        this.execTime = execTime;
        long exectime = Long.parseLong(execTime.substring(0,execTime.indexOf("(")).trim());
        if (exectime == 0l) return;

        if (count!=0) speed = count / exectime + " num/s";
        if (queryCount!=0)  speed = queryCount / exectime + " num/s";
    }
}
