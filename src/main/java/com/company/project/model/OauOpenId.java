package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "OAU_OPEN_ID")
public class OauOpenId {
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    @Column(name = "UNID")
    private String unid;

    @Column(name = "AIID")
    private Long aiid;

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

    @Column(name = "NAME_LOGIN")
    private String nameLogin;

    @Column(name = "CELLPHONE")
    private String cellphone;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ALIAS")
    private String alias;

    @Column(name = "NAME_FIRST")
    private String nameFirst;

    @Column(name = "USER_GROUP_UNID")
    private String userGroupUnid;

    @Column(name = "NAME_LAST")
    private String nameLast;

    @Column(name = "GENDER")
    private Integer gender;

    @Column(name = "DATIME_LAST")
    private Date datimeLast;

    @Column(name = "CREDENTIAL")
    private String credential;

    @Column(name = "AVATAR")
    private String avatar;

    @Column(name = "SALT")
    private String salt;

    @Column(name = "IP6")
    private String ip6;

    @Column(name = "IP4")
    private String ip4;

    @Column(name = "SOURCE")
    private String source;

    @Column(name = "FLAG_AVA")
    private Boolean flagAva;

    /**
     * 锁定
     */
    @Column(name = "FLAG_LOCK")
    private Boolean flagLock;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

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
     * @return NAME_LOGIN
     */
    public String getNameLogin() {
        return nameLogin;
    }

    /**
     * @param nameLogin
     */
    public void setNameLogin(String nameLogin) {
        this.nameLogin = nameLogin;
    }

    /**
     * @return CELLPHONE
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return ALIAS
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return NAME_FIRST
     */
    public String getNameFirst() {
        return nameFirst;
    }

    /**
     * @param nameFirst
     */
    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    /**
     * @return USER_GROUP_UNID
     */
    public String getUserGroupUnid() {
        return userGroupUnid;
    }

    /**
     * @param userGroupUnid
     */
    public void setUserGroupUnid(String userGroupUnid) {
        this.userGroupUnid = userGroupUnid;
    }

    /**
     * @return NAME_LAST
     */
    public String getNameLast() {
        return nameLast;
    }

    /**
     * @param nameLast
     */
    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    /**
     * @return GENDER
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * @return DATIME_LAST
     */
    public Date getDatimeLast() {
        return datimeLast;
    }

    /**
     * @param datimeLast
     */
    public void setDatimeLast(Date datimeLast) {
        this.datimeLast = datimeLast;
    }

    /**
     * @return CREDENTIAL
     */
    public String getCredential() {
        return credential;
    }

    /**
     * @param credential
     */
    public void setCredential(String credential) {
        this.credential = credential;
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
     * @return SALT
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * @return IP6
     */
    public String getIp6() {
        return ip6;
    }

    /**
     * @param ip6
     */
    public void setIp6(String ip6) {
        this.ip6 = ip6;
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
     * @return SOURCE
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
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
     * 获取锁定
     *
     * @return FLAG_LOCK - 锁定
     */
    public Boolean getFlagLock() {
        return flagLock;
    }

    /**
     * 设置锁定
     *
     * @param flagLock 锁定
     */
    public void setFlagLock(Boolean flagLock) {
        this.flagLock = flagLock;
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