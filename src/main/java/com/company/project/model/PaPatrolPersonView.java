package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pa_patrol_person_view")
public class PaPatrolPersonView {
    @Id
    private String unid;
    @Column(name = "CELLPHONE")
    private String cellPhone;
    @Column(name = "user_unid")
    private String userUnid;

    @Column(name = "system_dtime")
    private Date systemDtime;

    @Column(name = "update_dtime")
    private Date updateDtime;

    @Column(name = "flag_del")
    private Boolean flagDel;
    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

    @Column(name = "NAME_LOGIN")
    private String nameLogin;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
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