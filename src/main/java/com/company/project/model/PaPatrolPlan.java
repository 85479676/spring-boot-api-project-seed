package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pa_patrol_plan")
public class PaPatrolPlan {
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    private String unid;

    /**
     * 计划名称
     */
    private String name;

    /**
     * 所属分组
     */
    @Column(name = "domain_unid")
    private String domainUnid;



    @Column(name = "patrol_time_item_unid")
    private String patrolTimeItemUnid;

    /**
     * 新增时间
     */
    @Column(name = "system_dtime")
    private Date systemDtime;

    /**
     * 修改时间
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
     * 获取计划名称
     *
     * @return name - 计划名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置计划名称
     *
     * @param name 计划名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取所属分组
     *
     * @return domain_unid - 所属分组
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * 设置所属分组
     *
     * @param domainUnid 所属分组
     */
    public void setDomainUnid(String domainUnid) {
        this.domainUnid = domainUnid;
    }


    /**
     * @return patrol_time_item_unid
     */
    public String getPatrolTimeItemUnid() {
        return patrolTimeItemUnid;
    }

    /**
     * @param patrolTimeItemUnid
     */
    public void setPatrolTimeItemUnid(String patrolTimeItemUnid) {
        this.patrolTimeItemUnid = patrolTimeItemUnid;
    }

    /**
     * 获取新增时间
     *
     * @return system_dtime - 新增时间
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
     * @return update_dtime - 修改时间
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