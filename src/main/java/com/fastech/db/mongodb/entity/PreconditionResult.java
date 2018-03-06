package com.fastech.db.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

public class PreconditionResult
{
	@Id
	private String ID;
	@Field(value = "ALARMID")
	private String alarmId;
	private List<String> RESULT;
	private String PRETIME;
	private String NELABEL;
	private String PRETASKNAME;
	private String REPCODE;
	private Date EVENTTIME;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getALARMID() {
		return alarmId;
	}
	public void setALARMID(String aLARMID) {
		alarmId = aLARMID;
	}

	public String getAlarmId()
	{
		return alarmId;
	}

	public void setAlarmId(String alarmId)
	{
		this.alarmId = alarmId;
	}

	public List<String> getRESULT()
	{
		return RESULT;
	}

	public void setRESULT(List<String> RESULT)
	{
		this.RESULT = RESULT;
	}

	public String getPRETIME() {
		return PRETIME;
	}
	public void setPRETIME(String pRETIME) {
		PRETIME = pRETIME;
	}
	public String getNELABEL() {
		return NELABEL;
	}
	public void setNELABEL(String nELABEL) {
		NELABEL = nELABEL;
	}
	public String getPRETASKNAME() {
		return PRETASKNAME;
	}
	public void setPRETASKNAME(String pRETASKNAME) {
		PRETASKNAME = pRETASKNAME;
	}
	public String getREPCODE() {
		return REPCODE;
	}
	public void setREPCODE(String rEPCODE) {
		REPCODE = rEPCODE;
	}
	public Date getEVENTTIME() {
		return EVENTTIME;
	}
	public void setEVENTTIME(Date eVENTTIME) {
		EVENTTIME = eVENTTIME;
	}

	@Override
	public String toString()
	{
		return "PreconditionResult{" +
				"ID='" + ID + '\'' +
				", alarmId='" + alarmId + '\'' +
				", RESULT=" + RESULT +
				", PRETIME='" + PRETIME + '\'' +
				", NELABEL='" + NELABEL + '\'' +
				", PRETASKNAME='" + PRETASKNAME + '\'' +
				", REPCODE='" + REPCODE + '\'' +
				", EVENTTIME=" + EVENTTIME +
				'}';
	}
}
