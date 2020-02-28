package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "LEG_PRIVILEGE_VIEW")
public class LegPrivilegeView {
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    @Column(name = "UNID")
    private String unid;

    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    @Column(name = "DATIME_MOD")
    private Date datimeMod;

    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    @Column(name = "LEFT_INX")
    private Integer leftInx;

    @Column(name = "RIGHT_INX")
    private Integer rightInx;


    @Column(name = "NAME")
    private String name;

    @Column(name = "INX")
    private Integer inx;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    @Column(name = "DOMAIN_NAME")
    private String domainName;


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
     * @return DOMAIN_UNID
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * @param domainUnid
     */
    public void setDomainUnid(String domainUnid) {
        this.domainUnid = domainUnid;
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
     * @return INX
     */
    public Integer getInx() {
        return inx;
    }

    /**
     * @param inx
     */
    public void setInx(Integer inx) {
        this.inx = inx;
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