package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "MD_GRID")
public class MdGrid {

    @Column(name = "AIID")
    private Long aiid;
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    @Column(name = "UNID")
    private String unid;

    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    @Column(name = "DATIME_MOD")
    private Date datimeMod;

    @Column(name = "OPEN_ID")
    private String openId;

    @Column(name = "ID_TYPE")
    private Short idType;

    @Column(name = "NAME")
    private String name;

    @Column(name = "K")
    private String page_id;

    @Column(name = "PATH")
    private String path;

    @Column(name = "FLAG_PRIV")
    private Boolean flagPriv;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    @Column(name = "GRID_COLUMN")
    private String gridColumn;

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
     * @return K
     */
    public String getPage_id() {
        return page_id;
    }

    /**
     * @param page_id
     */
    public void setK(String page_id) {
        this.page_id = page_id;
    }

    /**
     * @return PATH
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
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

    /**
     * @return GRID_COLUMN
     */
    public String getGridColumn() {
        return gridColumn;
    }

    /**
     * @param gridColumn
     */
    public void setGridColumn(String gridColumn) {
        this.gridColumn = gridColumn;
    }
}