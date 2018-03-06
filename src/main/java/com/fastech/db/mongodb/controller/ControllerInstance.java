package com.fastech.db.mongodb.controller;

/**
 * Created by mystoxlol on 2018/1/3, 11:01.
 * company: fastech
 * update record:
 */
public class ControllerInstance
{
    private boolean flag;


    public static ControllerInstance getInstance()
    {
        return SingletonInstance.instance;
    }

    private static class SingletonInstance
    {
        private final static ControllerInstance instance = new ControllerInstance();
    }

    public boolean isFlag()
    {
        return flag;
    }

    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }
}
