package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pm_protocol")
public class PmProtocol {
    /**
     *
     */
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    private String unid;

    /**
     * Э??????
     */
    private String name;

    /**
     * Э???汾
     */
    private String vesion;

    /**
     * ????ʱ??
     */
    @Column(name = "system_dtime")
    private Date systemDtime;

    /**
     * Э??????
     */
    private Short num;

    @Column(name = "flag_del")
    private Boolean flagDel;

    /**
     * 获取Э??Ψһ????
     *
     * @return unid - Э??Ψһ????
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置Э??Ψһ????
     *
     * @param unid Э??Ψһ????
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取Э??????
     *
     * @return name - Э??????
     */
    public String getName() {
        return name;
    }

    /**
     * 设置Э??????
     *
     * @param name Э??????
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取Э???汾
     *
     * @return vesion - Э???汾
     */
    public String getVesion() {
        return vesion;
    }

    /**
     * 设置Э???汾
     *
     * @param vesion Э???汾
     */
    public void setVesion(String vesion) {
        this.vesion = vesion;
    }

    /**
     * 获取????ʱ??
     *
     * @return system_dtime - ????ʱ??
     */
    public Date getSystemDtime() {
        return systemDtime;
    }

    /**
     * 设置????ʱ??
     *
     * @param systemDtime ????ʱ??
     */
    public void setSystemDtime(Date systemDtime) {
        this.systemDtime = systemDtime;
    }

    /**
     * 获取Э??????
     *
     * @return num - Э??????
     */
    public Short getNum() {
        return num;
    }

    /**
     * 设置
     *
     * @param num
     */
    public void setNum(Short num) {
        this.num = num;
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