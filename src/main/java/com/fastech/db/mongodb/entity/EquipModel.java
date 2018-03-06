package com.fastech.db.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 设备信息资产表
 * Created by mystoxlol on 2017/5/9, 22:44.
 * company: fastech
 * update record:
 */
@Document
public class EquipModel
{
    @Id
    private String id;
    private String netName;
    private String ip;
    private String username;
    private String pwd;
    private int port;


    public int getPort()
    {
        return port;
    }

    public void setPort(int port)
    {
        this.port = port;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPwd()
    {
        return pwd;
    }

    public void setPwd(String pwd)
    {
        this.pwd = pwd;
    }

    public String getNetName()
    {
        return netName;
    }

    public void setNetName(String netName)
    {
        this.netName = netName;
    }

    public String getIp()
    {
        return ip;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
    }
}
