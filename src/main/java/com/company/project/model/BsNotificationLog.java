package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "bs_notification_log")
public class BsNotificationLog {
    @Id
    private String unid;

    /**
     * 通知人
     */
    private String name;

    /**
     * 通知方式： 电话号码或邮件地址
     */
    private String informe;

    private String content;

    /**
     * 设备名称
     */
    @Column(name = "device_name")
    private String deviceName;

    /**
     * 设备地址
     */
    private String address;

    /**
     * 设备唯一标识
     */
    @Column(name = "fm_facility_unid")
    private String fmFacilityUnid;

    /**
     * 发送状态 0 是待发送 1、发送成功  2、发送失败 3、重新发送  4、延迟发送
     */
    private Short status;

    /**
     * 发送类型 0、短信 1、语音 3、邮件
     */
    private Integer type;

    @Column(name = "system_dtime")
    private Date systemDtime;

    /**
     * 更新时间
     */
    @Column(name = "update_dtime")
    private Date updateDtime;

    @Column(name = "flag_del")
    private Boolean flagDel;

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
     * 获取通知人
     *
     * @return name - 通知人
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
     * @return informe - 通知方式： 电话号码或邮件地址
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
     * @return content
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
     * 获取设备名称
     *
     * @return device_name - 设备名称
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设置设备名称
     *
     * @param deviceName 设备名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * 获取设备地址
     *
     * @return address - 设备地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置设备地址
     *
     * @param address 设备地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取设备唯一标识
     *
     * @return fm_facility_unid - 设备唯一标识
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
     * 获取发送状态 0 是待发送 1、发送成功  2、发送失败 3、重新发送  4、延迟发送
     *
     * @return status - 发送状态 0 是待发送 1、发送成功  2、发送失败 3、重新发送  4、延迟发送
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置发送状态 0 是待发送 1、发送成功  2、发送失败 3、重新发送  4、延迟发送
     *
     * @param status 发送状态 0 是待发送 1、发送成功  2、发送失败 3、重新发送  4、延迟发送
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取发送类型 0、短信 1、语音 3、邮件
     *
     * @return type - 发送类型 0、短信 1、语音 3、邮件
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置发送类型 0、短信 1、语音 3、邮件
     *
     * @param type 发送类型 0、短信 1、语音 3、邮件
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return system_dtime
     */
    public Date getSystemDtime() {
        return systemDtime;
    }

    /**
     * @param systemDtime
     */
    public void setSystemDtime(Date systemDtime) {
        this.systemDtime = systemDtime;
    }

    /**
     * 获取更新时间
     *
     * @return update_dtime - 更新时间
     */
    public Date getUpdateDtime() {
        return updateDtime;
    }

    /**
     * 设置更新时间
     *
     * @param updateDtime 更新时间
     */
    public void setUpdateDtime(Date updateDtime) {
        this.updateDtime = updateDtime;
    }

    /**
     * @return flag_del
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
}