package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "LEG_USER_GROUP")
public class LegUserGroup {
    /**
     * 用户组唯一标识
     */
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    @Column(name = "UNID")
    private String unid;

    /**
     * 用户组名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 系统时间
     */
    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    /**
     * 修改时间
     */
    @Column(name = "DATIME_MOD")
    private Date datimeMod;

    /**
     * 分组信息唯一编号
     */
    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    /**
     * 删除状态
     */
    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    /**
     * 获取用户组唯一标识
     *
     * @return UNID - 用户组唯一标识
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置用户组唯一标识
     *
     * @param unid 用户组唯一标识
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取用户组名称
     *
     * @return NAME - 用户组名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户组名称
     *
     * @param name 用户组名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取系统时间
     *
     * @return DATIME_SYS - 系统时间
     */
    public Date getDatimeSys() {
        return datimeSys;
    }

    /**
     * 设置系统时间
     *
     * @param datimeSys 系统时间
     */
    public void setDatimeSys(Date datimeSys) {
        this.datimeSys = datimeSys;
    }

    /**
     * 获取修改时间
     *
     * @return DATIME_MOD - 修改时间
     */
    public Date getDatimeMod() {
        return datimeMod;
    }

    /**
     * 设置修改时间
     *
     * @param datimeMod 修改时间
     */
    public void setDatimeMod(Date datimeMod) {
        this.datimeMod = datimeMod;
    }

    /**
     * 获取分组信息唯一编号
     *
     * @return DOMAIN_UNID - 分组信息唯一编号
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * 设置分组信息唯一编号
     *
     * @param domainUnid 分组信息唯一编号
     */
    public void setDomainUnid(String domainUnid) {
        this.domainUnid = domainUnid;
    }

    /**
     * 获取删除状态
     *
     * @return FLAG_DEL - 删除状态
     */
    public Boolean getFlagDel() {
        return flagDel;
    }

    /**
     * 设置删除状态
     *
     * @param flagDel 删除状态
     */
    public void setFlagDel(Boolean flagDel) {
        this.flagDel = flagDel;
    }
}