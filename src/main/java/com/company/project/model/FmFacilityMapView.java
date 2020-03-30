package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "FM_FACILITY_MAP_VIEW")
public class FmFacilityMapView {
    @Column(name = "AIID")
    private Integer aiid;
    @Id
    @Column(name = "UNID")
    private String unid;

    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    @Column(name = "DATIME_MOD")
    private Date datimeMod;

    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

    @Column(name = "NAME")
    private String name;

    @Column(name = "X_MAX")
    private Integer xMax;

    @Column(name = "Y_MAX")
    private Integer yMax;

    @Column(name = "ZOOM")
    private Integer zoom;

    @Column(name = "COUNT_ALERT")
    private Integer countAlert;

    @Column(name = "COUNT_FACILITY")
    private Integer countFacility;

    @Column(name = "FLAG_PRMY")
    private Boolean flagPrmy;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    @Column(name = "URI")
    private String uri;

    @Column(name = "TAG")
    private String tag;

    @Column(name = "FILE_DATIME_SYS")
    private Date fileDatimeSys;

    @Column(name = "FILE_UNID")
    private String fileUnid;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

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
     * @return X_MAX
     */
    public Integer getxMax() {
        return xMax;
    }

    /**
     * @param xMax
     */
    public void setxMax(Integer xMax) {
        this.xMax = xMax;
    }

    /**
     * @return Y_MAX
     */
    public Integer getyMax() {
        return yMax;
    }

    /**
     * @param yMax
     */
    public void setyMax(Integer yMax) {
        this.yMax = yMax;
    }

    /**
     * @return ZOOM
     */
    public Integer getZoom() {
        return zoom;
    }

    /**
     * @param zoom
     */
    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    /**
     * @return COUNT_ALERT
     */
    public Integer getCountAlert() {
        return countAlert;
    }

    /**
     * @param countAlert
     */
    public void setCountAlert(Integer countAlert) {
        this.countAlert = countAlert;
    }

    /**
     * @return COUNT_FACILITY
     */
    public Integer getCountFacility() {
        return countFacility;
    }

    /**
     * @param countFacility
     */
    public void setCountFacility(Integer countFacility) {
        this.countFacility = countFacility;
    }

    /**
     * @return FLAG_PRMY
     */
    public Boolean getFlagPrmy() {
        return flagPrmy;
    }

    /**
     * @param flagPrmy
     */
    public void setFlagPrmy(Boolean flagPrmy) {
        this.flagPrmy = flagPrmy;
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
     * @return URI
     */
    public String getUri() {
        return uri;
    }

    /**
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri;
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
     * @return FILE_DATIME_SYS
     */
    public Date getFileDatimeSys() {
        return fileDatimeSys;
    }

    /**
     * @param fileDatimeSys
     */
    public void setFileDatimeSys(Date fileDatimeSys) {
        this.fileDatimeSys = fileDatimeSys;
    }

    /**
     * @return FILE_UNID
     */
    public String getFileUnid() {
        return fileUnid;
    }

    /**
     * @param fileUnid
     */
    public void setFileUnid(String fileUnid) {
        this.fileUnid = fileUnid;
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