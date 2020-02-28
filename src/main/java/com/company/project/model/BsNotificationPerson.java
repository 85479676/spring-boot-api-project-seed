package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "BS_NOTIFICATION_PERSON")
public class BsNotificationPerson {
    @Id
    @Column(name = "UNID")
    private String unid;

    /**
     * 通知人名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 电话
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 邮件
     */
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "IS_SAS")
    private Boolean isSas;

    @Column(name = "IS_VOICE")
    private Boolean isVoice;

    @Column(name = "IS_EMAIL")
    private Boolean isEmail;

    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    /**
     * 通知策略id
     */
    @Column(name = "BNS_UNID")
    private String bnsUnid;

    /**
     * 新增时间
     */
    @Column(name = "SYSTEM_DTIME")
    private Date systemDtime;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_DTIME")
    private Date updateDtime;

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
     * 获取通知人名称
     *
     * @return NAME - 通知人名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置通知人名称
     *
     * @param name 通知人名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取电话
     *
     * @return PHONE - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取邮件
     *
     * @return EMAIL - 邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮件
     *
     * @param email 邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return IS_SAS
     */
    public Boolean getIsSas() {
        return isSas;
    }

    /**
     * @param isSas
     */
    public void setIsSas(Boolean isSas) {
        this.isSas = isSas;
    }

    /**
     * @return IS_VOICE
     */
    public Boolean getIsVoice() {
        return isVoice;
    }

    /**
     * @param isVoice
     */
    public void setIsVoice(Boolean isVoice) {
        this.isVoice = isVoice;
    }

    /**
     * @return IS_EMAIL
     */
    public Boolean getIsEmail() {
        return isEmail;
    }

    /**
     * @param isEmail
     */
    public void setIsEmail(Boolean isEmail) {
        this.isEmail = isEmail;
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
     * 获取通知策略id
     *
     * @return BNS_UNID - 通知策略id
     */
    public String getBnsUnid() {
        return bnsUnid;
    }

    /**
     * 设置通知策略id
     *
     * @param bnsUnid 通知策略id
     */
    public void setBnsUnid(String bnsUnid) {
        this.bnsUnid = bnsUnid;
    }

    /**
     * 获取新增时间
     *
     * @return SYSTEM_DTIME - 新增时间
     */
    public Date getSystemDtime() {
        return systemDtime;
    }

    /**
     * 设置新增时间
     *
     * @param systemDtime 新增时间
     */
    public void setSystemDtime(Date systemDtime) {
        this.systemDtime = systemDtime;
    }

    /**
     * 获取修改时间
     *
     * @return UPDATE_DTIME - 修改时间
     */
    public Date getUpdateDtime() {
        return updateDtime;
    }

    /**
     * 设置修改时间
     *
     * @param updateDtime 修改时间
     */
    public void setUpdateDtime(Date updateDtime) {
        this.updateDtime = updateDtime;
    }
}