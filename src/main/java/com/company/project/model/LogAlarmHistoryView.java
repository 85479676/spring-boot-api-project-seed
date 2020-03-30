package com.company.project.model;

import javax.persistence.*;
import java.util.Date;

/**
 * 表为LOG_ALARM_CURRENT
 */
@Table(name = "LOG_ALARM_HISTORY_VIEW")
public class LogAlarmHistoryView {
    @Column(name = "AIID")
    private Integer aiid;
    @Id
    @Column(name = "UNID")
    private String unid;

    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "COUNT_EVENT")
    private Integer countEvent;

    @Column(name = "BITS")
    private byte[] bits;

    @Column(name = "STATUS")
    private Integer status;


    @Column(name = "TYPE_NAME")
    private String typeName;
    @Column(name = "SYSTEM_NAME")
    private String systemName;
    /**
     * 火灾报警联动控制系统
     */
    @Column(name = "ID_SYSTEM")
    private Short idSystem;

    @Column(name = "ID_TYPE")
    private Short idType;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    @Column(name = "START_TIME")
    private Date startTime;
    @Column(name = "SYSTEM_DTIME")
    private Date systemDtime;
    @Column(name = "EVENT_COMMENT")
    private String eventComment;
    @Column(name = "ALARM_STATUS")
    private Boolean alarmStatus;

    @Column(name = "END_TIME")
    private Date endTime;


    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Short getIdSystem() {
        return idSystem;
    }

    public void setIdSystem(Short idSystem) {
        this.idSystem = idSystem;
    }

    public Short getIdType() {
        return idType;
    }

    public void setIdType(Short idType) {
        this.idType = idType;
    }

    public Boolean getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(Boolean alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getSystemDtime() {
        return systemDtime;
    }

    public void setSystemDtime(Date systemDtime) {
        this.systemDtime = systemDtime;
    }

    public String getEventComment() {
        return eventComment;
    }

    public void setEventComment(String eventComment) {
        this.eventComment = eventComment;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 事件别名
     */
    @Column(name = "ALIAS")
    private String alias;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    @Column(name = "AlarmInfo")
    private String alarminfo;

    /**
     * @return AIID
     */
    public Integer getAiid() {
        return aiid;
    }

    /**
     * @param aiid
     */
    public void setAiid(Integer aiid) {
        this.aiid = aiid;
    }

    /**
     * @return UNID
     */
    public String getUnid() {
        return unid;
    }

    /**
     * @param unid
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * @return LEFT_INX
     */
    public Long getLeftInx() {
        return leftInx;
    }

    /**
     * @param leftInx
     */
    public void setLeftInx(Long leftInx) {
        this.leftInx = leftInx;
    }

    /**
     * @return RIGHT_INX
     */
    public Long getRightInx() {
        return rightInx;
    }

    /**
     * @param rightInx
     */
    public void setRightInx(Long rightInx) {
        this.rightInx = rightInx;
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return LOCATION
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return COUNT_EVENT
     */
    public Integer getCountEvent() {
        return countEvent;
    }

    /**
     * @param countEvent
     */
    public void setCountEvent(Integer countEvent) {
        this.countEvent = countEvent;
    }

    /**
     * @return BITS
     */
    public byte[] getBits() {
        return bits;
    }

    /**
     * @param bits
     */
    public void setBits(byte[] bits) {
        this.bits = bits;
    }

    /**
     * @return STATUS
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return FLAG_DEL
     */
    public Boolean getFlagDel() {
        return flagDel;
    }

    /**
     * @param flagDel
     */
    public void setFlagDel(Boolean flagDel) {
        this.flagDel = flagDel;
    }

    /**
     * 获取事件别名
     *
     * @return ALIAS - 事件别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置事件别名
     *
     * @param alias 事件别名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return DOMAIN_NAME
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return AlarmInfo
     */
    public String getAlarminfo() {
        return alarminfo;
    }

    /**
     * @param alarminfo
     */
    public void setAlarminfo(String alarminfo) {
        this.alarminfo = alarminfo;
    }
}