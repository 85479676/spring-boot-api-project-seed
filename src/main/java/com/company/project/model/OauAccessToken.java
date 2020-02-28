package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "OAU_ACCESS_TOKEN")
public class OauAccessToken {
    @Id
    @Column(name = "AIID")
    private Long aiid;

    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    @Column(name = "DATIME_UNIX")
    private Long datimeUnix;

    @Column(name = "TOKEN")
    private String token;

    @Column(name = "OPEN_ID")
    private String openId;

    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    @Column(name = "OAUTH_CLIENT_ID")
    private Long oauthClientId;

    @Column(name = "EXPIRES_IN")
    private Integer expiresIn;

    @Column(name = "TOKEN_TYPE")
    private String tokenType;

    @Column(name = "REFRESH_TOKEN")
    private String refreshToken;

    @Column(name = "AUTH_CODE")
    private String authCode;

    @Column(name = "ATTA")
    private String atta;

    @Column(name = "IP4")
    private String ip4;

    @Column(name = "IP6")
    private String ip6;

    @Column(name = "FLAG_EXPIRED")
    private Boolean flagExpired;

    @Column(name = "FLAG_AVA")
    private Boolean flagAva;

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
     * @return DATIME_UNIX
     */
    public Long getDatimeUnix() {
        return datimeUnix;
    }

    /**
     * @param datimeUnix
     */
    public void setDatimeUnix(Long datimeUnix) {
        this.datimeUnix = datimeUnix;
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
     * @return OAUTH_CLIENT_ID
     */
    public Long getOauthClientId() {
        return oauthClientId;
    }

    /**
     * @param oauthClientId
     */
    public void setOauthClientId(Long oauthClientId) {
        this.oauthClientId = oauthClientId;
    }

    /**
     * @return EXPIRES_IN
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * @param expiresIn
     */
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * @return TOKEN_TYPE
     */
    public String getTokenType() {
        return tokenType;
    }

    /**
     * @param tokenType
     */
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * @return REFRESH_TOKEN
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * @param refreshToken
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * @return AUTH_CODE
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * @param authCode
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
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
     * @return FLAG_EXPIRED
     */
    public Boolean getFlagExpired() {
        return flagExpired;
    }

    /**
     * @param flagExpired
     */
    public void setFlagExpired(Boolean flagExpired) {
        this.flagExpired = flagExpired;
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
}