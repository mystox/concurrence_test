package com.fastech.db.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Document(collection = "alarm")
public class AlarmDB {
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
    //    private String ALARMTEXT;
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
    private String GCSSCLIENT;
    private String GCSSCLIENTNAME;
    private String GCSSCLIENTLEVEL;
    private String GCSSCLIENTNUM;
    private String GCSSSERVICE;
    private int GCSSSERVICELEVEL;
    private int GCSSSERVICENUM;
    private String GCSSSERVICETYPE;
    private int GCSSCLIENTGRADE;
    private int GCSSCLIENTGRADEMGT;
    private Date RECEIVETIME = new Date(0l);
    private int ALARMTIMES;
    private int SELFSTATUS;
    private int RELTYPE;
    private int VENDORID;
    private int STANDARDFLAG;
    private int PARSESTATUS = 0;// 告警解析标记
    private int PRECONDITIONSTATUS = 0;// 预处理标�?
    private int PROJECTSTATUS = 0;// 工程标记
    private int CONFIRMSTATUS = 0;// 确认标记
    private int CLEARSTATUS = 0;// 清除标记
    private int SCREENSTATUS = 0;//屏蔽标记
    private int DEL_FLAG = 0;   //删除标记
    private int REPORTSTATUS = 0;//上报标记

    private Date RECOVERYTIME = new Date(0l);//回复告警时间
    private Date REPORTTIME = new Date(0l);//上报时间

    private Date INSERTTIME = new Date(0l);// 入库时间
    private Date UPDATETIME = new Date(0l);// 更新时间


    public Date getRECOVERYTIME()
    {
        return RECOVERYTIME;
    }

    public void setRECOVERYTIME(Date RECOVERYTIME)
    {
        this.RECOVERYTIME = RECOVERYTIME;
    }

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

    public void setCLEARID(String cLEARID)
    {
        CLEARID = cLEARID;
    }

    public int getEQUIPMENTTYPE()
    {
        return EQUIPMENTTYPE;
    }

    public void setEQUIPMENTTYPE(int eQUIPMENTTYPE)
    {
        EQUIPMENTTYPE = eQUIPMENTTYPE;
    }

    public String getALARMTITLE()
    {
        return ALARMTITLE;
    }

    public void setALARMTITLE(String aLARMTITLE)
    {
        ALARMTITLE = aLARMTITLE;
    }

    public Date getEVENTTIME()
    {
        return EVENTTIME;
    }

    public void setEVENTTIME(Date eVENTTIME)
    {
        EVENTTIME = eVENTTIME;
    }

    public int getALARMSEVERITY()
    {
        return ALARMSEVERITY;
    }

    public void setALARMSEVERITY(int aLARMSEVERITY)
    {
        ALARMSEVERITY = aLARMSEVERITY;
    }

    public String getVENDORSEVERITY()
    {
        return VENDORSEVERITY;
    }

    public void setVENDORSEVERITY(String vENDORSEVERITY)
    {
        VENDORSEVERITY = vENDORSEVERITY;
    }

    public String getVENDORTYPE()
    {
        return VENDORTYPE;
    }

    public void setVENDORTYPE(String vENDORTYPE)
    {
        VENDORTYPE = vENDORTYPE;
    }

    public int getALARMSTATUS()
    {
        return ALARMSTATUS;
    }

    public void setALARMSTATUS(int aLARMSTATUS)
    {
        ALARMSTATUS = aLARMSTATUS;
    }

    public String getOMCALARMID()
    {
        return OMCALARMID;
    }

    public void setOMCALARMID(String oMCALARMID)
    {
        OMCALARMID = oMCALARMID;
    }

    public long getPROBABLECSUSE()
    {
        return PROBABLECSUSE;
    }

    public void setPROBABLECSUSE(long pROBABLECSUSE)
    {
        PROBABLECSUSE = pROBABLECSUSE;
    }

    public String getLOCATEINFO()
    {
        return LOCATEINFO;
    }

    public void setLOCATEINFO(String lOCATEINFO)
    {
        LOCATEINFO = lOCATEINFO;
    }

    public String getALARMUNIT()
    {
        return ALARMUNIT;
    }

    public void setALARMUNIT(String aLARMUNIT)
    {
        ALARMUNIT = aLARMUNIT;
    }

    public String getALARMCONTENT()
    {
        return ALARMCONTENT;
    }

    public void setALARMCONTENT(String aLARMCONTENT)
    {
        ALARMCONTENT = aLARMCONTENT;
    }

    public int getSUBALARMTYPE()
    {
        return SUBALARMTYPE;
    }

    public void setSUBALARMTYPE(int sUBALARMTYPE)
    {
        SUBALARMTYPE = sUBALARMTYPE;
    }

    public String getVENDORNAME()
    {
        return VENDORNAME;
    }

    public void setVENDORNAME(String vENDORNAME)
    {
        VENDORNAME = vENDORNAME;
    }

    public String getNENAME()
    {
        return NENAME;
    }

    public void setNENAME(String nENAME)
    {
        NENAME = nENAME;
    }

    public String getCOUNTY()
    {
        return COUNTY;
    }

    public void setCOUNTY(String cOUNTY)
    {
        COUNTY = cOUNTY;
    }

    public String getREGIONNAME()
    {
        return REGIONNAME;
    }

    public void setREGIONNAME(String rEGIONNAME)
    {
        REGIONNAME = rEGIONNAME;
    }

    public int getALARMRESOUCESTATUS()
    {
        return ALARMRESOUCESTATUS;
    }

    public void setALARMRESOUCESTATUS(int aLARMRESOUCESTATUS)
    {
        ALARMRESOUCESTATUS = aLARMRESOUCESTATUS;
    }

    public int getPROFESSIONALTYPE()
    {
        return PROFESSIONALTYPE;
    }

    public void setPROFESSIONALTYPE(int pROFESSIONALTYPE)
    {
        PROFESSIONALTYPE = pROFESSIONALTYPE;
    }

    public String getSITENO()
    {
        return SITENO;
    }

    public void setSITENO(String sITENO)
    {
        SITENO = sITENO;
    }

    public String getCIRCUITNAME()
    {
        return CIRCUITNAME;
    }

    public void setCIRCUITNAME(String cIRCUITNAME)
    {
        CIRCUITNAME = cIRCUITNAME;
    }

    public String getVENDORVERSION()
    {
        return VENDORVERSION;
    }

    public void setVENDORVERSION(String vENDORVERSION)
    {
        VENDORVERSION = vENDORVERSION;
    }

//    public String getALARMTEXT()
//    {
//        return ALARMTEXT;
//    }
//
//    public void setALARMTEXT(String aLARMTEXT)
//    {
//        ALARMTEXT = aLARMTEXT;
//    }

    public String getSITEID()
    {
        return SITEID;
    }

    public void setSITEID(String sITEID)
    {
        SITEID = sITEID;
    }

    public String getALARMSOURCE()
    {
        return ALARMSOURCE;
    }

    public void setALARMSOURCE(String aLARMSOURCE)
    {
        ALARMSOURCE = aLARMSOURCE;
    }

    public String getSTANDARDNAME()
    {
        return STANDARDNAME;
    }

    public void setSTANDARDNAME(String sTANDARDNAME)
    {
        STANDARDNAME = sTANDARDNAME;
    }

    public String getSTANDARDID()
    {
        return STANDARDID;
    }

    public void setSTANDARDID(String sTANDARDID)
    {
        STANDARDID = sTANDARDID;
    }

    public int getEFFECTNE()
    {
        return EFFECTNE;
    }

    public void setEFFECTNE(int eFFECTNE)
    {
        EFFECTNE = eFFECTNE;
    }

    public int getEFFECTSERVICE()
    {
        return EFFECTSERVICE;
    }

    public void setEFFECTSERVICE(int eFFECTSERVICE)
    {
        EFFECTSERVICE = eFFECTSERVICE;
    }

    public int getALARMVALUE()
    {
        return ALARMVALUE;
    }

    public void setALARMVALUE(int aLARMVALUE)
    {
        ALARMVALUE = aLARMVALUE;
    }

    public String getPROJNAME()
    {
        return PROJNAME;
    }

    public void setPROJNAME(String pROJNAME)
    {
        PROJNAME = pROJNAME;
    }

    public String getBUSINESSREGIONIDS()
    {
        return BUSINESSREGIONIDS;
    }

    public void setBUSINESSREGIONIDS(String bUSINESSREGIONIDS)
    {
        BUSINESSREGIONIDS = bUSINESSREGIONIDS;
    }

    public String getBUSINESSREGIONS()
    {
        return BUSINESSREGIONS;
    }

    public void setBUSINESSREGIONS(String bUSINESSREGIONS)
    {
        BUSINESSREGIONS = bUSINESSREGIONS;
    }

    public int getEOMSNETWORKTYPE()
    {
        return EOMSNETWORKTYPE;
    }

    public void setEOMSNETWORKTYPE(int eOMSNETWORKTYPE)
    {
        EOMSNETWORKTYPE = eOMSNETWORKTYPE;
    }

    public String getNEIP()
    {
        return NEIP;
    }

    public void setNEIP(String nEIP)
    {
        NEIP = nEIP;
    }

    public String getGCSSCLIENT()
    {
        return GCSSCLIENT;
    }

    public void setGCSSCLIENT(String gCSSCLIENT)
    {
        GCSSCLIENT = gCSSCLIENT;
    }

    public String getGCSSCLIENTNAME()
    {
        return GCSSCLIENTNAME;
    }

    public void setGCSSCLIENTNAME(String gCSSCLIENTNAME)
    {
        GCSSCLIENTNAME = gCSSCLIENTNAME;
    }

    public String getGCSSCLIENTLEVEL()
    {
        return GCSSCLIENTLEVEL;
    }

    public void setGCSSCLIENTLEVEL(String gCSSCLIENTLEVEL)
    {
        GCSSCLIENTLEVEL = gCSSCLIENTLEVEL;
    }

    public String getGCSSCLIENTNUM()
    {
        return GCSSCLIENTNUM;
    }

    public void setGCSSCLIENTNUM(String gCSSCLIENTNUM)
    {
        GCSSCLIENTNUM = gCSSCLIENTNUM;
    }

    public String getGCSSSERVICE()
    {
        return GCSSSERVICE;
    }

    public void setGCSSSERVICE(String gCSSSERVICE)
    {
        GCSSSERVICE = gCSSSERVICE;
    }

    public int getGCSSSERVICELEVEL()
    {
        return GCSSSERVICELEVEL;
    }

    public void setGCSSSERVICELEVEL(int gCSSSERVICELEVEL)
    {
        GCSSSERVICELEVEL = gCSSSERVICELEVEL;
    }

    public int getGCSSSERVICENUM()
    {
        return GCSSSERVICENUM;
    }

    public void setGCSSSERVICENUM(int gCSSSERVICENUM)
    {
        GCSSSERVICENUM = gCSSSERVICENUM;
    }

    public String getGCSSSERVICETYPE()
    {
        return GCSSSERVICETYPE;
    }

    public void setGCSSSERVICETYPE(String gCSSSERVICETYPE)
    {
        GCSSSERVICETYPE = gCSSSERVICETYPE;
    }

    public int getGCSSCLIENTGRADE()
    {
        return GCSSCLIENTGRADE;
    }

    public void setGCSSCLIENTGRADE(int gCSSCLIENTGRADE)
    {
        GCSSCLIENTGRADE = gCSSCLIENTGRADE;
    }

    public int getGCSSCLIENTGRADEMGT()
    {
        return GCSSCLIENTGRADEMGT;
    }

    public void setGCSSCLIENTGRADEMGT(int gCSSCLIENTGRADEMGT)
    {
        GCSSCLIENTGRADEMGT = gCSSCLIENTGRADEMGT;
    }

    public Date getRECEIVETIME()
    {
        return RECEIVETIME;
    }

    public void setRECEIVETIME(Date rECEIVETIME)
    {
        RECEIVETIME = rECEIVETIME;
    }

    public int getALARMTIMES()
    {
        return ALARMTIMES;
    }

    public void setALARMTIMES(int aLARMTIMES)
    {
        ALARMTIMES = aLARMTIMES;
    }

    public int getSELFSTATUS()
    {
        return SELFSTATUS;
    }

    public void setSELFSTATUS(int sELFSTATUS)
    {
        SELFSTATUS = sELFSTATUS;
    }

    public int getRELTYPE()
    {
        return RELTYPE;
    }

    public void setRELTYPE(int rELTYPE)
    {
        RELTYPE = rELTYPE;
    }


    public int getVENDORID()
    {
        return VENDORID;
    }

    public void setVENDORID(int vENDORID)
    {
        VENDORID = vENDORID;
    }

    public int getSTANDARDFLAG()
    {
        return STANDARDFLAG;
    }

    public void setSTANDARDFLAG(int sTANDARDFLAG)
    {
        STANDARDFLAG = sTANDARDFLAG;
    }

    public int getPARSESTATUS()
    {
        return PARSESTATUS;
    }

    public void setPARSESTATUS(int pARSESTATUS)
    {
        PARSESTATUS = pARSESTATUS;
    }

    public int getPRECONDITIONSTATUS()
    {
        return PRECONDITIONSTATUS;
    }

    public void setPRECONDITIONSTATUS(int pRECONDITIONSTATUS)
    {
        PRECONDITIONSTATUS = pRECONDITIONSTATUS;
    }

    public int getPROJECTSTATUS()
    {
        return PROJECTSTATUS;
    }

    public void setPROJECTSTATUS(int pROJECTSTATUS)
    {
        PROJECTSTATUS = pROJECTSTATUS;
    }

    public int getCONFIRMSTATUS()
    {
        return CONFIRMSTATUS;
    }

    public void setCONFIRMSTATUS(int cONFIRMSTATUS)
    {
        CONFIRMSTATUS = cONFIRMSTATUS;
    }

    public int getCLEARSTATUS()
    {
        return CLEARSTATUS;
    }

    public void setCLEARSTATUS(int cLEARSTATUS)
    {
        CLEARSTATUS = cLEARSTATUS;
    }

    public int getSCREENSTATUS()
    {
        return SCREENSTATUS;
    }

    public void setSCREENSTATUS(int SCREENSTATUS)
    {
        this.SCREENSTATUS = SCREENSTATUS;
    }

    public int getDEL_FLAG()
    {
        return DEL_FLAG;
    }

    public void setDEL_FLAG(int dEL_FLAG)
    {
        DEL_FLAG = dEL_FLAG;
    }

    public Date getINSERTTIME()
    {
        return INSERTTIME;
    }

    public void setINSERTTIME(Date iNSERTTIME)
    {
        INSERTTIME = iNSERTTIME;
    }

    public Date getUPDATETIME()
    {
        return UPDATETIME;
    }

    public void setUPDATETIME(Date uPDATETIME)
    {
        UPDATETIME = uPDATETIME;
    }

    public int getREPORTSTATUS()
    {
        return REPORTSTATUS;
    }

    public void setREPORTSTATUS(int REPORTSTATUS)
    {
        this.REPORTSTATUS = REPORTSTATUS;
    }

    public Date getREPORTTIME()
    {
        return REPORTTIME;
    }

    public void setREPORTTIME(Date REPORTTIME)
    {
        this.REPORTTIME = REPORTTIME;
    }


    @Override
    public String toString()
    {
        return "AlarmContent{" +
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
//                ", ALARMTEXT='" + ALARMTEXT + '\'' +
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
                ", GCSSCLIENT='" + GCSSCLIENT + '\'' +
                ", GCSSCLIENTNAME='" + GCSSCLIENTNAME + '\'' +
                ", GCSSCLIENTLEVEL='" + GCSSCLIENTLEVEL + '\'' +
                ", GCSSCLIENTNUM='" + GCSSCLIENTNUM + '\'' +
                ", GCSSSERVICE='" + GCSSSERVICE + '\'' +
                ", GCSSSERVICELEVEL=" + GCSSSERVICELEVEL +
                ", GCSSSERVICENUM=" + GCSSSERVICENUM +
                ", GCSSSERVICETYPE='" + GCSSSERVICETYPE + '\'' +
                ", GCSSCLIENTGRADE=" + GCSSCLIENTGRADE +
                ", GCSSCLIENTGRADEMGT=" + GCSSCLIENTGRADEMGT +
                ", RECEIVETIME=" + RECEIVETIME +
                ", ALARMTIMES=" + ALARMTIMES +
                ", SELFSTATUS=" + SELFSTATUS +
                ", RELTYPE=" + RELTYPE +
                ", VENDORID=" + VENDORID +
                ", STANDARDFLAG=" + STANDARDFLAG +
                ", PARSESTATUS=" + PARSESTATUS +
                ", PRECONDITIONSTATUS=" + PRECONDITIONSTATUS +
                ", PROJECTSTATUS=" + PROJECTSTATUS +
                ", CONFIRMSTATUS=" + CONFIRMSTATUS +
                ", CLEARSTATUS=" + CLEARSTATUS +
                ", SCREENSTATUS=" + SCREENSTATUS +
                ", DEL_FLAG=" + DEL_FLAG +
                ", REPORTSTATUS=" + REPORTSTATUS +
                ", RECOVERYTIME=" + RECOVERYTIME +
                ", REPORTTIME=" + REPORTTIME +
                ", INSERTTIME=" + INSERTTIME +
                ", UPDATETIME=" + UPDATETIME +
                '}';
    }

    public Map<String, Object> toMap(AlarmDB alarmdb) {
        Map<String, Object> alarmmap = new HashMap<String, Object>();
        alarmmap.put("ID", alarmdb.getID() + "");
        alarmmap.put("ALARMID", alarmdb.getALARMID() + "");
        alarmmap.put("CLEARID", alarmdb.getCLEARID() + "");
        alarmmap.put("EQUIPMENTTYPE", alarmdb.getEQUIPMENTTYPE() + "");
        alarmmap.put("ALARMTITLE", alarmdb.getALARMTITLE() + "");
        alarmmap.put("EVENTTIME", alarmdb.getEVENTTIME() + "");
        alarmmap.put("ALARMSEVERITY", alarmdb.getALARMSEVERITY() + "");
        alarmmap.put("VENDORSEVERITY", alarmdb.getVENDORSEVERITY() + "");
        alarmmap.put("VENDORTYPE", alarmdb.getVENDORTYPE() + "");
        alarmmap.put("ALARMSTATUS", alarmdb.getALARMSTATUS() + "");
        alarmmap.put("OMCALARMID", alarmdb.getOMCALARMID() + "");
        alarmmap.put("PROBABLECSUSE", alarmdb.getPROBABLECSUSE() + "");
        alarmmap.put("LOCATEINFO", alarmdb.getLOCATEINFO() + "");
        alarmmap.put("ALARMUNIT", alarmdb.getALARMUNIT() + "");
        alarmmap.put("ALARMCONTENT", alarmdb.getALARMCONTENT() + "");
        alarmmap.put("SUBALARMTYPE", alarmdb.getSUBALARMTYPE() + "");
        alarmmap.put("VENDORNAME", alarmdb.getVENDORNAME() + "");
        alarmmap.put("NENAME", alarmdb.getNENAME() + "");
        alarmmap.put("COUNTY", alarmdb.getCOUNTY() + "");
        alarmmap.put("REGIONNAME", alarmdb.getREGIONNAME() + "");
        alarmmap.put("ALARMRESOUCESTATUS", alarmdb.getALARMRESOUCESTATUS() + "");
        alarmmap.put("PROFESSIONALTYPE", alarmdb.getPROFESSIONALTYPE() + "");
        alarmmap.put("SITENO", SITENO + "");
        alarmmap.put("CIRCUITNAME", CIRCUITNAME + "");
        alarmmap.put("VENDORVERSION", VENDORVERSION + "");
//		alarmmap.put("ALARMTEXT", ALARMTEXT + "");
        alarmmap.put("SITEID", SITEID + "");
        alarmmap.put("ALARMSOURCE", ALARMSOURCE + "");
        alarmmap.put("STANDARDNAME", alarmdb.getSTANDARDNAME() + "");
        alarmmap.put("STANDARDID", alarmdb.getSTANDARDID() + "");
        alarmmap.put("EFFECTNE", alarmdb.getEFFECTNE() + "");
        alarmmap.put("EFFECTSERVICE", alarmdb.getEFFECTSERVICE() + "");
        alarmmap.put("ALARMVALUE", alarmdb.getALARMVALUE() + "");
        alarmmap.put("ALARMVALUE", alarmdb.getALARMVALUE() + "");
        alarmmap.put("PROJNAME", alarmdb.getPROJNAME() + "");
        alarmmap.put("BUSINESSREGIONIDS", alarmdb.getBUSINESSREGIONIDS() + "");
        alarmmap.put("BUSINESSREGIONS", alarmdb.getBUSINESSREGIONS() + "");
        alarmmap.put("EOMSNETWORKTYPE", alarmdb.getEOMSNETWORKTYPE() + "");
        alarmmap.put("NEIP", alarmdb.getNEIP() + "");
        alarmmap.put("GCSSCLIENT", alarmdb.getGCSSCLIENT() + "");
        alarmmap.put("GCSSCLIENTNAME", alarmdb.getGCSSCLIENTNAME() + "");
        alarmmap.put("GCSSCLIENTLEVEL", alarmdb.getGCSSCLIENTLEVEL() + "");
        alarmmap.put("GCSSCLIENTNUM", alarmdb.getGCSSCLIENTNUM() + "");
        alarmmap.put("GCSSSERVICE", alarmdb.getGCSSSERVICE() + "");
        alarmmap.put("GCSSSERVICELEVEL", alarmdb.getGCSSSERVICELEVEL() + "");
        alarmmap.put("GCSSSERVICENUM", alarmdb.getGCSSSERVICENUM() + "");
        alarmmap.put("GCSSSERVICETYPE", alarmdb.getGCSSSERVICETYPE() + "");
        alarmmap.put("GCSSCLIENTGRADE", alarmdb.getGCSSCLIENTGRADE() + "");
        alarmmap.put("GCSSCLIENTGRADEMGT", alarmdb.getGCSSCLIENTGRADEMGT() + "");
        alarmmap.put("RECEIVETIME", alarmdb.getRECEIVETIME() + "");
        alarmmap.put("ALARMTIMES", alarmdb.getALARMTIMES() + "");
        alarmmap.put("SELFSTATUS", alarmdb.getSELFSTATUS() + "");
        alarmmap.put("RELTYPE", alarmdb.getRELTYPE() + "");
        alarmmap.put("VENDORID", alarmdb.getVENDORID() + "");
        alarmmap.put("STANDARDFLAG", alarmdb.getSTANDARDFLAG() + "");
        alarmmap.put("PARSESTATUS", alarmdb.getPARSESTATUS() + "");////
        alarmmap.put("PRECONDITIONSTATUS", alarmdb.getPRECONDITIONSTATUS() + "");////
        alarmmap.put("PROJECTSTATUS", alarmdb.getPROJECTSTATUS() + "");/////
        alarmmap.put("CONFIRMSTATUS", alarmdb.getCONFIRMSTATUS() + "");/////
        alarmmap.put("CLEARSTATUS", alarmdb.getCLEARSTATUS() + "");
        alarmmap.put("SCREENSTATUS", alarmdb.getSCREENSTATUS() + "");
        alarmmap.put("DEL_FLAG", alarmdb.getDEL_FLAG() + "");
        alarmmap.put("INSERTTIME", alarmdb.getINSERTTIME() + "");
        alarmmap.put("UPDATETIME", alarmdb.getUPDATETIME() + "");
        alarmmap.put("RECOVERYTIME", alarmdb.getRECOVERYTIME() + "");
        return alarmmap;

    }
}
