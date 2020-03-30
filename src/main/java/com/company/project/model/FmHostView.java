package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "FM_HOST_VIEW")
public class FmHostView {
    /**
     * 唯一标识
     */
    @Id
    @Column(name = "UNID")
    private String unid;

    /**
     * 设备名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 设备代码
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 所属分组
     */
    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    /**
     * 设备状态 0 是不在线  1是在线
     */
    @Column(name = "STATUS")
    private Boolean status;

    /**
     * 最后一次修改时间
     */
    @Column(name = "LAST_DATETIME")
    private Date lastDatetime;

    /**
     * 创建时间
     */
    @Column(name = "SYSTEM_DATIME")
    private Date systemDatime;

    /**
     * 设备位置
     */
    @Column(name = "LOCATION")
    private String location;

    /**
     * 删除状态
     */
    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

    /**
     * 获取唯一标识
     *
     * @return UNID - 唯一标识
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置唯一标识
     *
     * @param unid 唯一标识
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取设备名称
     *
     * @return NAME - 设备名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置设备名称
     *
     * @param name 设备名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取设备代码
     *
     * @return CODE - 设备代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置设备代码
     *
     * @param code 设备代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取所属分组
     *
     * @return DOMAIN_UNID - 所属分组
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
     * 获取设备状态 0 是不在线  1是在线
     *
     * @return STATUS - 设备状态 0 是不在线  1是在线
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置设备状态 0 是不在线  1是在线
     *
     * @param status 设备状态 0 是不在线  1是在线
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取最后一次修改时间
     *
     * @return LAST_DATETIME - 最后一次修改时间
     */
    public Date getLastDatetime() {
        return lastDatetime;
    }

    /**
     * 设置最后一次修改时间
     *
     * @param lastDatetime 最后一次修改时间
     */
    public void setLastDatetime(Date lastDatetime) {
        this.lastDatetime = lastDatetime;
    }

    /**
     * 获取创建时间
     *
     * @return SYSTEM_DATIME - 创建时间
     */
    public Date getSystemDatime() {
        return systemDatime;
    }

    /**
     * 设置创建时间
     *
     * @param systemDatime 创建时间
     */
    public void setSystemDatime(Date systemDatime) {
        this.systemDatime = systemDatime;
    }

    /**
     * 获取设备位置
     *
     * @return LOCATION - 设备位置
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置设备位置
     *
     * @param location 设备位置
     */
    public void setLocation(String location) {
        this.location = location;
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
}