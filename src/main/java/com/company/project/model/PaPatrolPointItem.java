package com.company.project.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "pa_patrol_point_item")
public class PaPatrolPointItem {
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    private String unid;
    @Transient
    private String taskUnid;

    /**
     * 序号
     */
    private Long aiid;

    /**
     * 巡检名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 结果
     */
    private String result;



    /**
     * 分组
     */
    @Column(name = "domain_unid")
    private String domainUnid;

    /**
     * 创建时间
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
     * 巡检点唯一标识
     */
    @Column(name = "patrol_point_unid")
    private String patrolPointUnid;

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
     * 获取序号
     *
     * @return aiid - 序号
     */
    public Long getAiid() {
        return aiid;
    }

    /**
     * 设置序号
     *
     * @param aiid 序号
     */
    public void setAiid(Long aiid) {
        this.aiid = aiid;
    }

    /**
     * 获取巡检名称
     *
     * @return name - 巡检名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置巡检名称
     *
     * @param name 巡检名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取结果
     *
     * @return result - 结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置结果
     *
     * @param result 结果
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取分组
     *
     * @return domain_unid - 分组
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * 设置分组
     *
     * @param domainUnid 分组
     */
    public void setDomainUnid(String domainUnid) {
        this.domainUnid = domainUnid;
    }

    /**
     * 获取创建时间
     *
     * @return system_dtime - 创建时间
     */
    public Date getSystemDtime() {
        return systemDtime;
    }

    /**
     * 设置创建时间
     *
     * @param systemDtime 创建时间
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

    /**
     * 获取巡检点唯一标识
     *
     * @return patrol_point_unid - 巡检点唯一标识
     */
    public String getPatrolPointUnid() {
        return patrolPointUnid;
    }

    /**
     * 设置巡检点唯一标识
     *
     * @param patrolPointUnid 巡检点唯一标识
     */
    public void setPatrolPointUnid(String patrolPointUnid) {
        this.patrolPointUnid = patrolPointUnid;
    }
}