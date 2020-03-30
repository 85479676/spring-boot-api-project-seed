package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "LOG_ALARM_CURRENT")
public class LogAlarmCurrent {

    private String unid;

    /**
     * 设备唯一标识
     */
    @Id
    @Column(name = "facility_unid")
    private String facilityUnid;

    /**
     * 事件开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 事件结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 系统时间
     */
    @Column(name = "system_dtime")
    private Date systemDtime;

    /**
     * 事件描述
     */
    @Column(name = "event_comment")
    private String eventComment;

    /**
     * 主机地址
     */
    @Column(name = "id_host")
    private String idHost;

    /**
     * 事件别名
     */
    private String alias;

    /**
     * 处置状态
     */
    private Boolean status;

    /**
     * @return unid
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
     * 获取设备唯一标识
     *
     * @return facility_unid - 设备唯一标识
     */
    public String getFacilityUnid() {
        return facilityUnid;
    }

    /**
     * 设置设备唯一标识
     *
     * @param facilityUnid 设备唯一标识
     */
    public void setFacilityUnid(String facilityUnid) {
        this.facilityUnid = facilityUnid;
    }

    /**
     * 获取事件开始时间
     *
     * @return start_time - 事件开始时间
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
     * 获取事件结束时间
     *
     * @return end_time - 事件结束时间
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
     * 获取系统时间
     *
     * @return system_dtime - 系统时间
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
     * @return event_comment - 事件描述
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
     * 获取主机地址
     *
     * @return id_host - 主机地址
     */
    public String getIdHost() {
        return idHost;
    }

    /**
     * 设置主机地址
     *
     * @param idHost 主机地址
     */
    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }

    /**
     * 获取事件别名
     *
     * @return alias - 事件别名
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
     * 获取处置状态
     *
     * @return status - 处置状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置处置状态
     *
     * @param status 处置状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}