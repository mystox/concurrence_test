package com.fastech.db.mongodb.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by mystoxlol on 2017/5/9, 22:53.
 * company: fastech
 * update record:
 */
public class PreconditionTask
{
    /**
     * 平台sessionid
     */
	@Id
	private String id;
    private String SESSIONID;
    private String TASKID;
    private String IP;
    private String ALARMID;
    private String taskType;
	private String TASKNAME;
	private boolean taskState;//任务状态 true为正常 false为异常
	private String ExcepMsg;
	private String neName;

	public String getNeName()
	{
		return neName;
	}

	public void setNeName(String neName)
	{
		this.neName = neName;
	}

	public String getExcepMsg()
	{
		return ExcepMsg;
	}

	public void setExcepMsg(String excepMsg)
	{
		ExcepMsg = excepMsg;
	}

	public boolean isTaskState()
	{
		return taskState;
	}

	public void setTaskState(boolean taskState)
	{
		this.taskState = taskState;
	}


	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getTASKNAME()
	{
		return TASKNAME;
	}

	public void setTASKNAME(String TASKNAME)
	{
		this.TASKNAME = TASKNAME;
	}

	public String getTaskType()
	{
		return taskType;
	}

	public void setTaskType(String taskType)
	{
		this.taskType = taskType;
	}

	public String getID() {
		return id;
	}
	public void setID(String ID) {
		this.id = ID;
	}
	public String getSESSIONID() {
		return SESSIONID;
	}
	public void setSESSIONID(String sESSIONID) {
		SESSIONID = sESSIONID;
	}
	public String getTASKID() {
		return TASKID;
	}
	public void setTASKID(String tASKID) {
		TASKID = tASKID;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getALARMID() {
		return ALARMID;
	}
	public void setALARMID(String aLARMID) {
		ALARMID = aLARMID;
	}

	@Override
	public String toString()
	{
		return "PreconditionTask{" +
				"id='" + id + '\'' +
				", SESSIONID='" + SESSIONID + '\'' +
				", TASKID='" + TASKID + '\'' +
				", IP='" + IP + '\'' +
				", ALARMID='" + ALARMID + '\'' +
				", taskType='" + taskType + '\'' +
				", TASKNAME='" + TASKNAME + '\'' +
				", taskState=" + taskState +
				", ExcepMsg='" + ExcepMsg + '\'' +
				", neName='" + neName + '\'' +
				'}';
	}
}
