package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "MD_TYPE_VIEW")
public class MdTypeView {
    @Id
    @Column(name = "AIID")
    private Integer aiid;

    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    @Column(name = "DATIME_MOD")
    private Date datimeMod;

    @Column(name = "PREFIX")
    private String prefix;

    @Column(name = "CHANNEL")
    private String channel;

    @Column(name = "K")
    private String k;

    @Column(name = "NAME")
    private String name;

    /**
     * 协议UNID
     */
    @Column(name = "PROTOCOL_UNID")
    private String protocolUnid;

    @Column(name = "TAG")
    private String tag;

    @Column(name = "AVATAR")
    private String avatar;

    @Column(name = "CODE")
    private String code;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    /**
     * 协议名称
     */
    @Column(name = "proto_name")
    private String protoName;

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
     * @return PREFIX
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * @param prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * @return CHANNEL
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return K
     */
    public String getK() {
        return k;
    }

    /**
     * @param k
     */
    public void setK(String k) {
        this.k = k;
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
     * 获取协议UNID
     *
     * @return PROTOCOL_UNID - 协议UNID
     */
    public String getProtocolUnid() {
        return protocolUnid;
    }

    /**
     * 设置协议UNID
     *
     * @param protocolUnid 协议UNID
     */
    public void setProtocolUnid(String protocolUnid) {
        this.protocolUnid = protocolUnid;
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
     * @return CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
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
     * 获取协议名称
     *
     * @return proto_name - 协议名称
     */
    public String getProtoName() {
        return protoName;
    }

    /**
     * 设置协议名称
     *
     * @param protoName 协议名称
     */
    public void setProtoName(String protoName) {
        this.protoName = protoName;
    }
}