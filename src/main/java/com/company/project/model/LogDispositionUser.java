package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "log_disposition_user")
public class LogDispositionUser {
    /**
     * 设备UNID
     */
    @Id
    private String unid;

    /**
     * 处置原因
     */
    private Integer reason;

    /**
     * 详情描述
     */
    private String description;

    /**
     * 处置人
     */
    @Column(name = "user_unid")
    private String userUnid;

    /**
     * 处置时间
     */
    @Column(name = "datime_sys")
    private Date datimeSys;

    @Column(name = "flag_del")
    private Boolean flagDel;

    @Column(name = "NAME_LOGIN")
    private String nameLogin;

    /**
     * 获取设备UNID
     *
     * @return unid - 设备UNID
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置设备UNID
     *
     * @param unid 设备UNID
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取处置原因
     *
     * @return reason - 处置原因
     */
    public Integer getReason() {
        return reason;
    }

    /**
     * 设置处置原因
     *
     * @param reason 处置原因
     */
    public void setReason(Integer reason) {
        this.reason = reason;
    }

    /**
     * 获取详情描述
     *
     * @return description - 详情描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置详情描述
     *
     * @param description 详情描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取处置人
     *
     * @return user_unid - 处置人
     */
    public String getUserUnid() {
        return userUnid;
    }

    /**
     * 设置处置人
     *
     * @param userUnid 处置人
     */
    public void setUserUnid(String userUnid) {
        this.userUnid = userUnid;
    }

    /**
     * 获取处置时间
     *
     * @return datime_sys - 处置时间
     */
    public Date getDatimeSys() {
        return datimeSys;
    }

    /**
     * 设置处置时间
     *
     * @param datimeSys 处置时间
     */
    public void setDatimeSys(Date datimeSys) {
        this.datimeSys = datimeSys;
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