package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "SYS_MENU")
public class SysMenu {

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

    /**
     * 排序
     */
    @Column(name = "INX")
    private Integer inx;

    @Column(name = "UNID_SUPER")
    private String unidSuper;

    @Column(name = "PRIV_UNID")
    private String privUnid;

    @Column(name = "ID_TYPE")
    private Integer idType;

    @Column(name = "TAG")
    private String tag;

    @Column(name = "AVATAR")
    private String avatar;

    @Column(name = "ATTA")
    private String atta;

    @Column(name = "ICON_URI")
    private String iconUri;

    @Column(name = "REDIRECT_URI")
    private String redirectUri;

    @Column(name = "FLAG_CACHE")
    private Boolean flagCache;

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
     * 获取排序
     *
     * @return INX - 排序
     */
    public Integer getInx() {
        return inx;
    }

    /**
     * 设置排序
     *
     * @param inx 排序
     */
    public void setInx(Integer inx) {
        this.inx = inx;
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
     * @return PRIV_UNID
     */
    public String getPrivUnid() {
        return privUnid;
    }

    /**
     * @param privUnid
     */
    public void setPrivUnid(String privUnid) {
        this.privUnid = privUnid;
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
     * @return ATTA
     */
    public String getAtta() {
        return atta;
    }

    /**
     * @param atta
     */
    public void setAtta(String atta) {
        this.atta = atta;
    }

    /**
     * @return ICON_URI
     */
    public String getIconUri() {
        return iconUri;
    }

    /**
     * @param iconUri
     */
    public void setIconUri(String iconUri) {
        this.iconUri = iconUri;
    }

    /**
     * @return REDIRECT_URI
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    /**
     * @param redirectUri
     */
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /**
     * @return FLAG_CACHE
     */
    public Boolean getFlagCache() {
        return flagCache;
    }

    /**
     * @param flagCache
     */
    public void setFlagCache(Boolean flagCache) {
        this.flagCache = flagCache;
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