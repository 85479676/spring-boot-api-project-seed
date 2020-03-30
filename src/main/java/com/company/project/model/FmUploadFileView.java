package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "FM_UPLOAD_FILE_VIEW")
public class FmUploadFileView {
    @Column(name = "AIID")
    private Long aiid;
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

    @Column(name = "OPEN_ID")
    private String openId;

    @Column(name = "UNID_ENTITY")
    private String unidEntity;

    @Column(name = "MD5")
    private String md5;

    @Column(name = "LON")
    private BigDecimal lon;

    @Column(name = "LAT")
    private BigDecimal lat;

    @Column(name = "TAG")
    private String tag;

    @Column(name = "PATH")
    private String path;

    @Column(name = "URI_1X")
    private String uri1x;

    @Column(name = "URI_2X")
    private String uri2x;

    @Column(name = "URI_3X")
    private String uri3x;

    @Column(name = "URI_4X")
    private String uri4x;

    @Column(name = "URI")
    private String uri;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

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
     * @return MD5
     */
    public String getMd5() {
        return md5;
    }

    /**
     * @param md5
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * @return LON
     */
    public BigDecimal getLon() {
        return lon;
    }

    /**
     * @param lon
     */
    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    /**
     * @return LAT
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
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
     * @return URI_1X
     */
    public String getUri1x() {
        return uri1x;
    }

    /**
     * @param uri1x
     */
    public void setUri1x(String uri1x) {
        this.uri1x = uri1x;
    }

    /**
     * @return URI_2X
     */
    public String getUri2x() {
        return uri2x;
    }

    /**
     * @param uri2x
     */
    public void setUri2x(String uri2x) {
        this.uri2x = uri2x;
    }

    /**
     * @return URI_3X
     */
    public String getUri3x() {
        return uri3x;
    }

    /**
     * @param uri3x
     */
    public void setUri3x(String uri3x) {
        this.uri3x = uri3x;
    }

    /**
     * @return URI_4X
     */
    public String getUri4x() {
        return uri4x;
    }

    /**
     * @param uri4x
     */
    public void setUri4x(String uri4x) {
        this.uri4x = uri4x;
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