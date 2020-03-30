package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Table(name = "LOG_RAW_202002_VIEW")
public class LogRaw202002View {
    @Column(name = "AIID")
    private Long aiid;

    /**
     * 对应设备UNID
     */
    @Id
    @Column(name = "UNID")
    private String unid;

    /**
     * 日期
     */
    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    @Column(name = "DATIME_DATA")
    private Date datimeData;
    @Transient
    private  String valueData;

    public String getValueData() {
        return valueData;
    }

    public void setValueData(String valueData) {
        this.valueData = valueData;
    }

    /**
     * 码流
     */
    @Column(name = "RAW")
    private String raw;

    /**
     * ip
     */
    @Column(name = "IP4")
    private String ip4;

    /**
     * 布置
     */
    @Column(name = "POST")
    private String post;

    /**
     * 通道号
     */
    @Column(name = "ID_HOST")
    private String idHost;

    /**
     * 排序
     */
    @Column(name = "UPORDOWN")
    private String upordown;

    /**
     * 协议类型
     */
    @Column(name = "PROTOCOL_TYPE")
    private Integer protocolType;

    /**
     * 分组ID
     */
    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    @Column(name = "ORDERS")
    private Integer orders;

    @Column(name = "FACILITY_NAME")
    private String facilityName;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

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
     * 获取对应设备UNID
     *
     * @return UNID - 对应设备UNID
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置对应设备UNID
     *
     * @param unid 对应设备UNID
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取日期
     *
     * @return DATIME_SYS - 日期
     */
    public Date getDatimeSys() {
        return datimeSys;
    }

    /**
     * 设置日期
     *
     * @param datimeSys 日期
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
     * 获取码流
     *
     * @return RAW - 码流
     */
    public String getRaw() {
        return raw;
    }

    /**
     * 设置码流
     *
     * @param raw 码流
     */
    public void setRaw(String raw) {
        this.raw = raw;
    }

    /**
     * 获取ip
     *
     * @return IP4 - ip
     */
    public String getIp4() {
        return ip4;
    }

    /**
     * 设置ip
     *
     * @param ip4 ip
     */
    public void setIp4(String ip4) {
        this.ip4 = ip4;
    }

    /**
     * 获取布置
     *
     * @return POST - 布置
     */
    public String getPost() {
        return post;
    }

    /**
     * 设置布置
     *
     * @param post 布置
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * 获取通道号
     *
     * @return ID_HOST - 通道号
     */
    public String getIdHost() {
        return idHost;
    }

    /**
     * 设置通道号
     *
     * @param idHost 通道号
     */
    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }

    /**
     * 获取排序
     *
     * @return UPORDOWN - 排序
     */
    public String getUpordown() {
        return upordown;
    }

    /**
     * 设置排序
     *
     * @param upordown 排序
     */
    public void setUpordown(String upordown) {
        this.upordown = upordown;
    }

    /**
     * 获取协议类型
     *
     * @return PROTOCOL_TYPE - 协议类型
     */
    public Integer getProtocolType() {
        return protocolType;
    }

    /**
     * 设置协议类型
     *
     * @param protocolType 协议类型
     */
    public void setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * 获取分组ID
     *
     * @return DOMAIN_UNID - 分组ID
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * 设置分组ID
     *
     * @param domainUnid 分组ID
     */
    public void setDomainUnid(String domainUnid) {
        this.domainUnid = domainUnid;
    }

    /**
     * @return ORDERS
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * @param orders
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
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
}