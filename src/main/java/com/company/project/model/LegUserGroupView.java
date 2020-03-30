package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "LEG_USER_GROUP_VIEW")
public class LegUserGroupView {
    /**
     * 用户组唯一标识
     */
    @Id
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
    @Column(name = "LEFT_INX")
    private Integer leftInx;
    @Column(name = "RIGHT_INX")
    private Integer rightInx;

    /**
     * 删除状态
     */
    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    /**
     * 获取用户组唯一标识
     *
     * @return UNID - 用户组唯一标识
     */
    public String getUnid() {
        return unid;
    }

    /**
     * @return LEFT_INX
     */
    public Integer getLeftInx() {
        return leftInx;
    }

    /**
     * @param leftInx
     */
    public void setLeftInx(Integer leftInx) {
        this.leftInx = leftInx;
    }

    /**
     * @return RIGHT_INX
     */
    public Integer getRightInx() {
        return rightInx;
    }

    /**
     * @param rightInx
     */
    public void setRightInx(Integer rightInx) {
        this.rightInx = rightInx;
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
}