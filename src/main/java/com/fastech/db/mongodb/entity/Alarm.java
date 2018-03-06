package com.fastech.db.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by mystoxlol on 2017/9/28, 17:09.
 * company: fastech
 * update record:
 */
@Document(collection = "alarm")
public class Alarm
{
    @Id
    private Long ID;
    private String ALARMID;
    private String CLEARID;
    private int EQUIPMENTTYPE;
    private String ALARMTITLE;
    private Date EVENTTIME = new Date(0l);
    private int ALARMSEVERITY;
    private String VENDORSEVERITY;
    private String VENDORTYPE;
    private int ALARMSTATUS;
    private String OMCALARMID;
    private long PROBABLECSUSE;
    private String LOCATEINFO;
    private String ALARMUNIT;
    private String ALARMCONTENT;
    private int SUBALARMTYPE;
    private String VENDORNAME;
    private String NENAME;
    private String COUNTY;
    private String REGIONNAME;
    private int ALARMRESOUCESTATUS;
    private int PROFESSIONALTYPE;
    private String SITENO;
    private String CIRCUITNAME;
    private String VENDORVERSION;
        private String ALARMTEXT;
    private String SITEID;
    private String ALARMSOURCE;
    private String STANDARDNAME;
    private String STANDARDID;
    private int EFFECTNE;
    private int EFFECTSERVICE;
    private int ALARMVALUE;
    private String PROJNAME;
    private String BUSINESSREGIONIDS;
    private String BUSINESSREGIONS;
    private int EOMSNETWORKTYPE;
    private String NEIP;

    private Date RECEIVETIME = new Date(0l);


    private Date RECOVERYTIME = new Date(0l);//回复告警时间
    private Date REPORTTIME = new Date(0l);//上报时间

    private Date INSERTTIME = new Date(0l);// 入库时间
    private Date UPDATETIME = new Date(0l);// 更新时间


    public Long getID()
    {
        return ID;
    }

    public void setID(Long ID)
    {
        this.ID = ID;
    }

    public String getALARMID()
    {
        return ALARMID;
    }

    public void setALARMID(String ALARMID)
    {
        this.ALARMID = ALARMID;
    }

    public String getCLEARID()
    {
        return CLEARID;
    }

    public void setCLEARID(String CLEARID)
    {
        this.CLEARID = CLEARID;
    }

    public int getEQUIPMENTTYPE()
    {
        return EQUIPMENTTYPE;
    }

    public void setEQUIPMENTTYPE(int EQUIPMENTTYPE)
    {
        this.EQUIPMENTTYPE = EQUIPMENTTYPE;
    }

    public String getALARMTITLE()
    {
        return ALARMTITLE;
    }

    public void setALARMTITLE(String ALARMTITLE)
    {
        this.ALARMTITLE = ALARMTITLE;
    }

    public Date getEVENTTIME()
    {
        return EVENTTIME;
    }

    public void setEVENTTIME(Date EVENTTIME)
    {
        this.EVENTTIME = EVENTTIME;
    }

    public int getALARMSEVERITY()
    {
        return ALARMSEVERITY;
    }

    public void setALARMSEVERITY(int ALARMSEVERITY)
    {
        this.ALARMSEVERITY = ALARMSEVERITY;
    }

    public String getVENDORSEVERITY()
    {
        return VENDORSEVERITY;
    }

    public void setVENDORSEVERITY(String VENDORSEVERITY)
    {
        this.VENDORSEVERITY = VENDORSEVERITY;
    }

    public String getVENDORTYPE()
    {
        return VENDORTYPE;
    }

    public void setVENDORTYPE(String VENDORTYPE)
    {
        this.VENDORTYPE = VENDORTYPE;
    }

    public int getALARMSTATUS()
    {
        return ALARMSTATUS;
    }

    public void setALARMSTATUS(int ALARMSTATUS)
    {
        this.ALARMSTATUS = ALARMSTATUS;
    }

    public String getOMCALARMID()
    {
        return OMCALARMID;
    }

    public void setOMCALARMID(String OMCALARMID)
    {
        this.OMCALARMID = OMCALARMID;
    }

    public long getPROBABLECSUSE()
    {
        return PROBABLECSUSE;
    }

    public void setPROBABLECSUSE(long PROBABLECSUSE)
    {
        this.PROBABLECSUSE = PROBABLECSUSE;
    }

    public String getLOCATEINFO()
    {
        return LOCATEINFO;
    }

    public void setLOCATEINFO(String LOCATEINFO)
    {
        this.LOCATEINFO = LOCATEINFO;
    }

    public String getALARMUNIT()
    {
        return ALARMUNIT;
    }

    public void setALARMUNIT(String ALARMUNIT)
    {
        this.ALARMUNIT = ALARMUNIT;
    }

    public String getALARMCONTENT()
    {
        return ALARMCONTENT;
    }

    public void setALARMCONTENT(String ALARMCONTENT)
    {
        this.ALARMCONTENT = ALARMCONTENT;
    }

    public int getSUBALARMTYPE()
    {
        return SUBALARMTYPE;
    }

    public void setSUBALARMTYPE(int SUBALARMTYPE)
    {
        this.SUBALARMTYPE = SUBALARMTYPE;
    }

    public String getVENDORNAME()
    {
        return VENDORNAME;
    }

    public void setVENDORNAME(String VENDORNAME)
    {
        this.VENDORNAME = VENDORNAME;
    }

    public String getNENAME()
    {
        return NENAME;
    }

    public void setNENAME(String NENAME)
    {
        this.NENAME = NENAME;
    }

    public String getCOUNTY()
    {
        return COUNTY;
    }

    public void setCOUNTY(String COUNTY)
    {
        this.COUNTY = COUNTY;
    }

    public String getREGIONNAME()
    {
        return REGIONNAME;
    }

    public void setREGIONNAME(String REGIONNAME)
    {
        this.REGIONNAME = REGIONNAME;
    }

    public int getALARMRESOUCESTATUS()
    {
        return ALARMRESOUCESTATUS;
    }

    public void setALARMRESOUCESTATUS(int ALARMRESOUCESTATUS)
    {
        this.ALARMRESOUCESTATUS = ALARMRESOUCESTATUS;
    }

    public int getPROFESSIONALTYPE()
    {
        return PROFESSIONALTYPE;
    }

    public void setPROFESSIONALTYPE(int PROFESSIONALTYPE)
    {
        this.PROFESSIONALTYPE = PROFESSIONALTYPE;
    }

    public String getSITENO()
    {
        return SITENO;
    }

    public void setSITENO(String SITENO)
    {
        this.SITENO = SITENO;
    }

    public String getCIRCUITNAME()
    {
        return CIRCUITNAME;
    }

    public void setCIRCUITNAME(String CIRCUITNAME)
    {
        this.CIRCUITNAME = CIRCUITNAME;
    }

    public String getVENDORVERSION()
    {
        return VENDORVERSION;
    }

    public void setVENDORVERSION(String VENDORVERSION)
    {
        this.VENDORVERSION = VENDORVERSION;
    }

    public String getSITEID()
    {
        return SITEID;
    }

    public void setSITEID(String SITEID)
    {
        this.SITEID = SITEID;
    }

    public String getALARMSOURCE()
    {
        return ALARMSOURCE;
    }

    public void setALARMSOURCE(String ALARMSOURCE)
    {
        this.ALARMSOURCE = ALARMSOURCE;
    }

    public String getSTANDARDNAME()
    {
        return STANDARDNAME;
    }

    public void setSTANDARDNAME(String STANDARDNAME)
    {
        this.STANDARDNAME = STANDARDNAME;
    }

    public String getSTANDARDID()
    {
        return STANDARDID;
    }

    public void setSTANDARDID(String STANDARDID)
    {
        this.STANDARDID = STANDARDID;
    }

    public int getEFFECTNE()
    {
        return EFFECTNE;
    }

    public void setEFFECTNE(int EFFECTNE)
    {
        this.EFFECTNE = EFFECTNE;
    }

    public int getEFFECTSERVICE()
    {
        return EFFECTSERVICE;
    }

    public void setEFFECTSERVICE(int EFFECTSERVICE)
    {
        this.EFFECTSERVICE = EFFECTSERVICE;
    }

    public int getALARMVALUE()
    {
        return ALARMVALUE;
    }

    public void setALARMVALUE(int ALARMVALUE)
    {
        this.ALARMVALUE = ALARMVALUE;
    }

    public String getPROJNAME()
    {
        return PROJNAME;
    }

    public void setPROJNAME(String PROJNAME)
    {
        this.PROJNAME = PROJNAME;
    }

    public String getBUSINESSREGIONIDS()
    {
        return BUSINESSREGIONIDS;
    }

    public void setBUSINESSREGIONIDS(String BUSINESSREGIONIDS)
    {
        this.BUSINESSREGIONIDS = BUSINESSREGIONIDS;
    }

    public String getBUSINESSREGIONS()
    {
        return BUSINESSREGIONS;
    }

    public void setBUSINESSREGIONS(String BUSINESSREGIONS)
    {
        this.BUSINESSREGIONS = BUSINESSREGIONS;
    }

    public int getEOMSNETWORKTYPE()
    {
        return EOMSNETWORKTYPE;
    }

    public void setEOMSNETWORKTYPE(int EOMSNETWORKTYPE)
    {
        this.EOMSNETWORKTYPE = EOMSNETWORKTYPE;
    }

    public String getNEIP()
    {
        return NEIP;
    }

    public void setNEIP(String NEIP)
    {
        this.NEIP = NEIP;
    }



    public Date getRECEIVETIME()
    {
        return RECEIVETIME;
    }

    public void setRECEIVETIME(Date RECEIVETIME)
    {
        this.RECEIVETIME = RECEIVETIME;
    }






    public Date getRECOVERYTIME()
    {
        return RECOVERYTIME;
    }

    public void setRECOVERYTIME(Date RECOVERYTIME)
    {
        this.RECOVERYTIME = RECOVERYTIME;
    }

    public Date getREPORTTIME()
    {
        return REPORTTIME;
    }

    public void setREPORTTIME(Date REPORTTIME)
    {
        this.REPORTTIME = REPORTTIME;
    }

    public Date getINSERTTIME()
    {
        return INSERTTIME;
    }

    public void setINSERTTIME(Date INSERTTIME)
    {
        this.INSERTTIME = INSERTTIME;
    }

    public Date getUPDATETIME()
    {
        return UPDATETIME;
    }

    public void setUPDATETIME(Date UPDATETIME)
    {
        this.UPDATETIME = UPDATETIME;
    }

    @Override
    public String toString()
    {
        return "Alarm{" +
                "ID=" + ID +
                ", ALARMID='" + ALARMID + '\'' +
                ", CLEARID='" + CLEARID + '\'' +
                ", EQUIPMENTTYPE=" + EQUIPMENTTYPE +
                ", ALARMTITLE='" + ALARMTITLE + '\'' +
                ", EVENTTIME=" + EVENTTIME +
                ", ALARMSEVERITY=" + ALARMSEVERITY +
                ", VENDORSEVERITY='" + VENDORSEVERITY + '\'' +
                ", VENDORTYPE='" + VENDORTYPE + '\'' +
                ", ALARMSTATUS=" + ALARMSTATUS +
                ", OMCALARMID='" + OMCALARMID + '\'' +
                ", PROBABLECSUSE=" + PROBABLECSUSE +
                ", LOCATEINFO='" + LOCATEINFO + '\'' +
                ", ALARMUNIT='" + ALARMUNIT + '\'' +
                ", ALARMCONTENT='" + ALARMCONTENT + '\'' +
                ", SUBALARMTYPE=" + SUBALARMTYPE +
                ", VENDORNAME='" + VENDORNAME + '\'' +
                ", NENAME='" + NENAME + '\'' +
                ", COUNTY='" + COUNTY + '\'' +
                ", REGIONNAME='" + REGIONNAME + '\'' +
                ", ALARMRESOUCESTATUS=" + ALARMRESOUCESTATUS +
                ", PROFESSIONALTYPE=" + PROFESSIONALTYPE +
                ", SITENO='" + SITENO + '\'' +
                ", CIRCUITNAME='" + CIRCUITNAME + '\'' +
                ", VENDORVERSION='" + VENDORVERSION + '\'' +
                ", ALARMTEXT='" + ALARMTEXT + '\'' +
                ", SITEID='" + SITEID + '\'' +
                ", ALARMSOURCE='" + ALARMSOURCE + '\'' +
                ", STANDARDNAME='" + STANDARDNAME + '\'' +
                ", STANDARDID='" + STANDARDID + '\'' +
                ", EFFECTNE=" + EFFECTNE +
                ", EFFECTSERVICE=" + EFFECTSERVICE +
                ", ALARMVALUE=" + ALARMVALUE +
                ", PROJNAME='" + PROJNAME + '\'' +
                ", BUSINESSREGIONIDS='" + BUSINESSREGIONIDS + '\'' +
                ", BUSINESSREGIONS='" + BUSINESSREGIONS + '\'' +
                ", EOMSNETWORKTYPE=" + EOMSNETWORKTYPE +
                ", NEIP='" + NEIP + '\'' +

                ", RECEIVETIME=" + RECEIVETIME +

                ", RECOVERYTIME=" + RECOVERYTIME +
                ", REPORTTIME=" + REPORTTIME +
                ", INSERTTIME=" + INSERTTIME +
                ", UPDATETIME=" + UPDATETIME +
                '}';
    }
}
