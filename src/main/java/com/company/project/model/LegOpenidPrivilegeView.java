package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "LEG_OPENID_PRIVILEGE_VIEW")
public class LegOpenidPrivilegeView {
    @Column(name = "AIID")
    private Integer aiid;

    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    @Column(name = "DATIME_MOD")
    private Date datimeMod;
    @Id
    @Column(name = "OPEN_ID")
    private String openId;

    @Column(name = "PRIVILEGE_UNID")
    private String privilegeUnid;

    @Column(name = "DATIME_BEGIN")
    private Date datimeBegin;

    @Column(name = "DATIME_END")
    private Date datimeEnd;

    @Column(name = "FLAG_AVA")
    private Boolean flagAva;

    @Column(name = "PRIVILE_NAME")
    private String privileName;

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
     * @return DATIME_MOD
     */
    public Date getDatimeMod() {
        return datimeMod;
    }

    /**
     * @param datimeMod
     */
    public void setDatimeMod(Date datimeMod) {
        this.datimeMod = datimeMod;
    }

    /**
     * @return OPEN_ID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * @return PRIVILEGE_UNID
     */
    public String getPrivilegeUnid() {
        return privilegeUnid;
    }

    /**
     * @param privilegeUnid
     */
    public void setPrivilegeUnid(String privilegeUnid) {
        this.privilegeUnid = privilegeUnid;
    }

    /**
     * @return DATIME_BEGIN
     */
    public Date getDatimeBegin() {
        return datimeBegin;
    }

    /**
     * @param datimeBegin
     */
    public void setDatimeBegin(Date datimeBegin) {
        this.datimeBegin = datimeBegin;
    }

    /**
     * @return DATIME_END
     */
    public Date getDatimeEnd() {
        return datimeEnd;
    }

    /**
     * @param datimeEnd
     */
    public void setDatimeEnd(Date datimeEnd) {
        this.datimeEnd = datimeEnd;
    }

    /**
     * @return FLAG_AVA
     */
    public Boolean getFlagAva() {
        return flagAva;
    }

    /**
     * @param flagAva
     */
    public void setFlagAva(Boolean flagAva) {
        this.flagAva = flagAva;
    }

    /**
     * @return PRIVILE_NAME
     */
    public String getPrivileName() {
        return privileName;
    }

    /**
     * @param privileName
     */
    public void setPrivileName(String privileName) {
        this.privileName = privileName;
    }
}