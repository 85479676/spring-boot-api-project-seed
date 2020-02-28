package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "BS_NOTIFICATION_STRATEGY")
public class BsNotificationStrategy {
    /**
     * 通知策略
     */
    @Id
    @Column(name = "UNID")
    private String unid;

    /**
     * 策略名称
     */
    @Column(name = "NAME")
    private String name;

    @Column(name = "SYSTEM_DTIME")
    private Date systemDtime;

    @Column(name = "UPDATE_DTIME")
    private Date updateDtime;

    /**
     * 分组id
     */
    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    /**
     * 获取通知策略
     *
     * @return UNID - 通知策略
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置通知策略
     *
     * @param unid 通知策略
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取策略名称
     *
     * @return NAME - 策略名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置策略名称
     *
     * @param name 策略名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return SYSTEM_DTIME
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
     * @return UPDATE_DTIME
     */
    public Date getUpdateDtime() {
        return updateDtime;
    }

    /**
     * @param updateDtime
     */
    public void setUpdateDtime(Date updateDtime) {
        this.updateDtime = updateDtime;
    }

    /**
     * 获取分组id
     *
     * @return DOMAIN_UNID - 分组id
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * 设置分组id
     *
     * @param domainUnid 分组id
     */
    public void setDomainUnid(String domainUnid) {
        this.domainUnid = domainUnid;
    }
}