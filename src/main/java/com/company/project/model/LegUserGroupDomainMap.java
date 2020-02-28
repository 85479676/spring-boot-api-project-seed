package com.company.project.model;

import javax.persistence.*;

@Table(name = "LEG_USER_GROUP_DOMAIN_MAP")
public class LegUserGroupDomainMap {
    @Id
    @Column(name = "USER_GROUP_UNID")
    private String userGroupUnid;

    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

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