package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "BS_NOTIFICATION_LOG_VIEW")
public class BsNotificationLogView {
    @Id
    @Column(name = "UNID")
    private String unid;

    /**
     * 通知人
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 通知方式： 电话号码或邮件地址
     */
    @Column(name = "INFORME")
    private String informe;

    @Column(name = "CONTENT")
    private String content;

    /**
     * 设备唯一标识
     */
    @Column(name = "FM_FACILITY_UNID")
    private String fmFacilityUnid;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 发送类型
     */
    @Column(name = "TYPE")
    private Integer type;

    /**
     * 系统时间
     */
    @Column(name = "SYSTEM_DTIME")
    private Date systemDtime;

    @Column(name = "FACILITY_NAME")
    private String facilityName;

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
     * 获取通知人
     *
     * @return NAME - 通知人
     */
    public String getName() {
        return name;
    }

    /**
     * 设置通知人
     *
     * @param name 通知人
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取通知方式： 电话号码或邮件地址
     *
     * @return INFORME - 通知方式： 电话号码或邮件地址
     */
    public String getInforme() {
        return informe;
    }

    /**
     * 设置通知方式： 电话号码或邮件地址
     *
     * @param informe 通知方式： 电话号码或邮件地址
     */
    public void setInforme(String informe) {
        this.informe = informe;
    }

    /**
     * @return CONTENT
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取设备唯一标识
     *
     * @return FM_FACILITY_UNID - 设备唯一标识
     */
    public String getFmFacilityUnid() {
        return fmFacilityUnid;
    }

    /**
     * 设置设备唯一标识
     *
     * @param fmFacilityUnid 设备唯一标识
     */
    public void setFmFacilityUnid(String fmFacilityUnid) {
        this.fmFacilityUnid = fmFacilityUnid;
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取发送类型
     *
     * @return TYPE - 发送类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置发送类型
     *
     * @param type 发送类型
     */
    public void setType(Integer type) {
        this.type = type;
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
     * @return FACILITY_NAME
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * @param facilityName
     */
    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }
}