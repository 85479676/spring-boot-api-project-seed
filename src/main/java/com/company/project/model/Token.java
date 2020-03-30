package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "Token")
public class Token {
    @Column(name = "AIID")
    private Long aiid;
    @Id
    @Column(name = "UNID")
    private String unid;

    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    @Column(name = "DATIME_MOD")
    private Date datimeMod;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ID_TYPE")
    private Integer idType;

    @Column(name = "ID_TREE")
    private Byte idTree;

    @Column(name = "ID_TENANT")
    private Integer idTenant;

    @Column(name = "INX")
    private Short inx;

    @Column(name = "CAPA")
    private Integer capa;

    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

    @Column(name = "UNID_SUPER")
    private String unidSuper;

    @Column(name = "UNID_TREE_A")
    private String unidTreeA;

    @Column(name = "UNID_CIRCLE")
    private String unidCircle;

    @Column(name = "URL")
    private String url;

    @Column(name = "FLAG_AVA")
    private Boolean flagAva;

    @Column(name = "FLAG_TENANT")
    private Boolean flagTenant;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    @Column(name = "TOKEN")
    private String token;

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
     * @return ID_TYPE
     */
    public Integer getIdType() {
        return idType;
    }

    /**
     * @param idType
     */
    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    /**
     * @return ID_TREE
     */
    public Byte getIdTree() {
        return idTree;
    }

    /**
     * @param idTree
     */
    public void setIdTree(Byte idTree) {
        this.idTree = idTree;
    }

    /**
     * @return ID_TENANT
     */
    public Integer getIdTenant() {
        return idTenant;
    }

    /**
     * @param idTenant
     */
    public void setIdTenant(Integer idTenant) {
        this.idTenant = idTenant;
    }

    /**
     * @return INX
     */
    public Short getInx() {
        return inx;
    }

    /**
     * @param inx
     */
    public void setInx(Short inx) {
        this.inx = inx;
    }

    /**
     * @return CAPA
     */
    public Integer getCapa() {
        return capa;
    }

    /**
     * @param capa
     */
    public void setCapa(Integer capa) {
        this.capa = capa;
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
     * @return UNID_SUPER
     */
    public String getUnidSuper() {
        return unidSuper;
    }

    /**
     * @param unidSuper
     */
    public void setUnidSuper(String unidSuper) {
        this.unidSuper = unidSuper;
    }

    /**
     * @return UNID_TREE_A
     */
    public String getUnidTreeA() {
        return unidTreeA;
    }

    /**
     * @param unidTreeA
     */
    public void setUnidTreeA(String unidTreeA) {
        this.unidTreeA = unidTreeA;
    }

    /**
     * @return UNID_CIRCLE
     */
    public String getUnidCircle() {
        return unidCircle;
    }

    /**
     * @param unidCircle
     */
    public void setUnidCircle(String unidCircle) {
        this.unidCircle = unidCircle;
    }

    /**
     * @return URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
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
     * @return FLAG_TENANT
     */
    public Boolean getFlagTenant() {
        return flagTenant;
    }

    /**
     * @param flagTenant
     */
    public void setFlagTenant(Boolean flagTenant) {
        this.flagTenant = flagTenant;
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
     * @return TOKEN
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }
}