package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "LOG_SYSLOG")
public class LogSyslog {
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    @Column(name = "UNID")
    private String unid;

    @Column(name = "AIID")
    private Integer aiid;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    /**
     * 事件
     */
    @Column(name = "INCIDENT")
    private String incident;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

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
     * @return AIID
     */
    public Integer getAiid() {
        return aiid;
    }

    /**
     * @param aiid
     */
    public void setAiid(Integer aiid) {
        this.aiid = aiid;
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return DATIME_SYS
     */
    public Date getDatimeSys() {
        return datimeSys;
    }

    /**
     * @param datimeSys
     */
    public void setDatimeSys(Date datimeSys) {
        this.datimeSys = datimeSys;
    }

    /**
     * 获取事件
     *
     * @return INCIDENT - 事件
     */
    public String getIncident() {
        return incident;
    }

    /**
     * 设置事件
     *
     * @param incident 事件
     */
    public void setIncident(String incident) {
        this.incident = incident;
    }

    /**
     * @return FLAG_DEL
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