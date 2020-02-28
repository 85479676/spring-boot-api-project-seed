package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "LEG_MENU__VIEW")
public class LegMenuView {
    @Column(name = "AIID")
    private Integer aiid;

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
    @Id
    @Column(name = "UNID")
    private String unid;

    @Column(name = "NAME")
    private String name;

    @Column(name = "INX")
    private Integer inx;

    @Column(name = "SUPER_UNID")
    private String superUnid;

    @Column(name = "MENU_TYPE")
    private String menuType;

    @Column(name = "ICON_URI")
    private String iconUri;

    @Column(name = "REDIRECT_URI")
    private String redirectUri;

    @Column(name = "ATTA")
    private String atta;

    @Column(name = "FLAG_PRIV")
    private Boolean flagPriv;

    @Column(name = "FLAG_CACHE")
    private Boolean flagCache;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

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
     * @return INX
     */
    public Integer getInx() {
        return inx;
    }

    /**
     * @param inx
     */
    public void setInx(Integer inx) {
        this.inx = inx;
    }

    /**
     * @return SUPER_UNID
     */
    public String getSuperUnid() {
        return superUnid;
    }

    /**
     * @param superUnid
     */
    public void setSuperUnid(String superUnid) {
        this.superUnid = superUnid;
    }

    /**
     * @return MENU_TYPE
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * @param menuType
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType;
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