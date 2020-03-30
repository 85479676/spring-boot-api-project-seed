package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pa_patrol_person")
public class PaPatrolPerson {
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    private String unid;

    @Column(name = "user_unid")
    private String userUnid;

    @Column(name = "system_dtime")
    private Date systemDtime;

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
     * @return user_unid
     */
    public String getUserUnid() {
        return userUnid;
    }

    /**
     * @param userUnid
     */
    public void setUserUnid(String userUnid) {
        this.userUnid = userUnid;
    }

    /**
     * @return system_dtime
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
     * @return update_dtime
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