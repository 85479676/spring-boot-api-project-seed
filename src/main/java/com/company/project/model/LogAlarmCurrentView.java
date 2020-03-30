package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "LOG_ALARM_CURRENT_VIEW")
public class LogAlarmCurrentView {
    @Column(name = "AIID")
    private Integer aiid;
    @Id
    @Column(name = "UNID")
    private String unid;

    @Column(name = "ID_TYPE")
    private Short idType;

    /**
     * 火灾报警联动控制系统
     */
    @Column(name = "ID_SYSTEM")
    private Short idSystem;

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
    private Boolean status;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    /**
     * 事件别名
     */
    @Column(name = "ALIAS")
    private String alias;

    /**
     * 事件开始时间
     */
    @Column(name = "START_TIME")
    private Date startTime;

    /**
     * 系统时间
     */
    @Column(name = "SYSTEM_DTIME")
    private Date systemDtime;

    /**
     * 事件描述
     */
    @Column(name = "EVENT_COMMENT")
    private String eventComment;

    /**
     * 处置状态
     */
    @Column(name = "ALARM_STATUS")
    private Boolean alarmStatus;

    /**
     * 事件结束时间
     */
    @Column(name = "END_TIME")
    private Date endTime;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

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
     * @return ID_TYPE
     */
    public Short getIdType() {
        return idType;
    }

    /**
     * @param idType
     */
    public void setIdType(Short idType) {
        this.idType = idType;
    }

    /**
     * 获取火灾报警联动控制系统
     *
     * @return ID_SYSTEM - 火灾报警联动控制系统
     */
    public Short getIdSystem() {
        return idSystem;
    }

    /**
     * 设置火灾报警联动控制系统
     *
     * @param idSystem 火灾报警联动控制系统
     */
    public void setIdSystem(Short idSystem) {
        this.idSystem = idSystem;
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
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Boolean status) {
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
     * 获取事件开始时间
     *
     * @return START_TIME - 事件开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置事件开始时间
     *
     * @param startTime 事件开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取系统时间
     *
     * @return SYSTEM_DTIME - 系统时间
     */
    public Date getSystemDtime() {
        return systemDtime;
    }

    /**
     * 设置系统时间
     *
     * @param systemDtime 系统时间
     */
    public void setSystemDtime(Date systemDtime) {
        this.systemDtime = systemDtime;
    }

    /**
     * 获取事件描述
     *
     * @return EVENT_COMMENT - 事件描述
     */
    public String getEventComment() {
        return eventComment;
    }

    /**
     * 设置事件描述
     *
     * @param eventComment 事件描述
     */
    public void setEventComment(String eventComment) {
        this.eventComment = eventComment;
    }

    /**
     * 获取处置状态
     *
     * @return ALARM_STATUS - 处置状态
     */
    public Boolean getAlarmStatus() {
        return alarmStatus;
    }

    /**
     * 设置处置状态
     *
     * @param alarmStatus 处置状态
     */
    public void setAlarmStatus(Boolean alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    /**
     * 获取事件结束时间
     *
     * @return END_TIME - 事件结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置事件结束时间
     *
     * @param endTime 事件结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
     * @return DOMAIN_UNID
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * @param domainUnid
     */
    public void setDomainUnid(String domainUnid) {
        this.domainUnid = domainUnid;
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