package com.company.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "MD_MODEL")
public class MdModel {
    /**
     * 唯一编号
     */
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

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    @Column(name = "ID_TYPE")
    private Short idType;

    /**
     * 厂家一编号
     */
    @Column(name = "UNID_VENDOR")
    private String unidVendor;

    @Column(name = "UNID_PROTO")
    private String unidProto;

    @Column(name = "TAG")
    private String tag;

    @Column(name = "FLAG_PRIV")
    private Boolean flagPriv;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    /**
     * 获取唯一编号
     *
     * @return UNID - 唯一编号
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置唯一编号
     *
     * @param unid 唯一编号
     */
    public void setUnid(String unid) {
        this.unid = unid;
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
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return ID_TYPE
     */
    public Short getIdType() {
        return idType;
    }

    /**
     * @param idType
     */
    public void setIdType(Short idType) {
        this.idType = idType;
    }

    /**
     * 获取厂家一编号
     *
     * @return UNID_VENDOR - 厂家一编号
     */
    public String getUnidVendor() {
        return unidVendor;
    }

    /**
     * 设置厂家一编号
     *
     * @param unidVendor 厂家一编号
     */
    public void setUnidVendor(String unidVendor) {
        this.unidVendor = unidVendor;
    }

    /**
     * @return UNID_PROTO
     */
    public String getUnidProto() {
        return unidProto;
    }

    /**
     * @param unidProto
     */
    public void setUnidProto(String unidProto) {
        this.unidProto = unidProto;
    }

    /**
     * @return TAG
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return FLAG_PRIV
     */
    public Boolean getFlagPriv() {
        return flagPriv;
    }

    /**
     * @param flagPriv
     */
    public void setFlagPriv(Boolean flagPriv) {
        this.flagPriv = flagPriv;
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