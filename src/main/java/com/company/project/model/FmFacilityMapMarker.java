package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "FM_FACILITY_MAP_MARKER")
public class FmFacilityMapMarker {
    @Column(name = "AIID")
    private Integer aiid;
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

    @Column(name = "UNID_MAP")
    private String unidMap;

    @Column(name = "UNID_ENTITY")
    private String unidEntity;

    @Column(name = "ID_TYPE")
    private Short idType;

    @Column(name = "X")
    private BigDecimal x;

    @Column(name = "Y")
    private BigDecimal y;

    @Column(name = "Z")
    private BigDecimal z;

    @Column(name = "COUNT_EVENT")
    private Integer countEvent;

    @Column(name = "AVATAR")
    private String avatar;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

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
     * @return UNID_MAP
     */
    public String getUnidMap() {
        return unidMap;
    }

    /**
     * @param unidMap
     */
    public void setUnidMap(String unidMap) {
        this.unidMap = unidMap;
    }

    /**
     * @return UNID_ENTITY
     */
    public String getUnidEntity() {
        return unidEntity;
    }

    /**
     * @param unidEntity
     */
    public void setUnidEntity(String unidEntity) {
        this.unidEntity = unidEntity;
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
     * @return X
     */
    public BigDecimal getX() {
        return x;
    }

    /**
     * @param x
     */
    public void setX(BigDecimal x) {
        this.x = x;
    }

    /**
     * @return Y
     */
    public BigDecimal getY() {
        return y;
    }

    /**
     * @param y
     */
    public void setY(BigDecimal y) {
        this.y = y;
    }

    /**
     * @return Z
     */
    public BigDecimal getZ() {
        return z;
    }

    /**
     * @param z
     */
    public void setZ(BigDecimal z) {
        this.z = z;
    }

    /**
     * @return COUNT_EVENT
     */
    public Integer getCountEvent() {
        return countEvent;
    }

    /**
     * @param countEvent
     */
    public void setCountEvent(Integer countEvent) {
        this.countEvent = countEvent;
    }

    /**
     * @return AVATAR
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
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