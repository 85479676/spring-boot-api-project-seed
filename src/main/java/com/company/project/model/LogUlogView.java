package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "LOG_ULOG_VIEW")
public class LogUlogView {
    @Column(name = "AIID")
    private Long aiid;

    /**
     * 操作人UNID
     */
    @Id
    @Column(name = "UNID")
    private String unid;

    /**
     * 操作时间
     */
    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    /**
     * 页面路径
     */
    @Column(name = "URL")
    private String url;

    /**
     * 操作内容
     */
    @Column(name = "LOCATION")
    private String location;

    /**
     * 日志状态
     */
    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    @Column(name = "NAME_LOGIN")
    private String nameLogin;

    /**
     * @return AIID
     */
    public Long getAiid() {
        return aiid;
    }

    /**
     * @param aiid
     */
    public void setAiid(Long aiid) {
        this.aiid = aiid;
    }

    /**
     * 获取操作人UNID
     *
     * @return UNID - 操作人UNID
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置操作人UNID
     *
     * @param unid 操作人UNID
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取操作时间
     *
     * @return DATIME_SYS - 操作时间
     */
    public Date getDatimeSys() {
        return datimeSys;
    }

    /**
     * 设置操作时间
     *
     * @param datimeSys 操作时间
     */
    public void setDatimeSys(Date datimeSys) {
        this.datimeSys = datimeSys;
    }

    /**
     * 获取页面路径
     *
     * @return URL - 页面路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置页面路径
     *
     * @param url 页面路径
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取操作内容
     *
     * @return LOCATION - 操作内容
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置操作内容
     *
     * @param location 操作内容
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取日志状态
     *
     * @return FLAG_DEL - 日志状态
     */
    public Boolean getFlagDel() {
        return flagDel;
    }

    /**
     * 设置日志状态
     *
     * @param flagDel 日志状态
     */
    public void setFlagDel(Boolean flagDel) {
        this.flagDel = flagDel;
    }

    /**
     * @return NAME_LOGIN
     */
    public String getNameLogin() {
        return nameLogin;
    }

    /**
     * @param nameLogin
     */
    public void setNameLogin(String nameLogin) {
        this.nameLogin = nameLogin;
    }
}