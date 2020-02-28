package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "LOG_RAW_202002_VIEW")
public class LogRaw202002View {
    @Column(name = "AIID")
    private Long aiid;
    @Id
    @Column(name = "UNID")
    private String unid;

    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    @Column(name = "DATIME_DATA")
    private Date datimeData;

    @Column(name = "RAW")
    private String raw;

    @Column(name = "IP4")
    private String ip4;

    @Column(name = "POST")
    private String post;

    @Column(name = "ID_HOST")
    private String idHost;

    @Column(name = "UPORDOWN")
    private String upordown;

    @Column(name = "PROTOCOL_TYPE")
    private Integer protocolType;

    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    @Column(name = "FACILITY_NAME")
    private String facilityName;

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
     * @return DATIME_DATA
     */
    public Date getDatimeData() {
        return datimeData;
    }

    /**
     * @param datimeData
     */
    public void setDatimeData(Date datimeData) {
        this.datimeData = datimeData;
    }

    /**
     * @return RAW
     */
    public String getRaw() {
        return raw;
    }

    /**
     * @param raw
     */
    public void setRaw(String raw) {
        this.raw = raw;
    }

    /**
     * @return IP4
     */
    public String getIp4() {
        return ip4;
    }

    /**
     * @param ip4
     */
    public void setIp4(String ip4) {
        this.ip4 = ip4;
    }

    /**
     * @return POST
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * @return ID_HOST
     */
    public String getIdHost() {
        return idHost;
    }

    /**
     * @param idHost
     */
    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }

    /**
     * @return UPORDOWN
     */
    public String getUpordown() {
        return upordown;
    }

    /**
     * @param upordown
     */
    public void setUpordown(String upordown) {
        this.upordown = upordown;
    }

    /**
     * @return PROTOCOL_TYPE
     */
    public Integer getProtocolType() {
        return protocolType;
    }

    /**
     * @param protocolType
     */
    public void setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
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
     * @return FACILITY_NAME
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * @param facilityName
     */
    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
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