package com.company.project.model;

import javax.persistence.*;

@Table(name = "LEG_USER_GROUP_DOMAIN_MAP_VIEW")
public class LegUserGroupDomainMapView {
    @Id
    @Column(name = "USER_GROUP_UNID")
    private String userGroupUnid;

    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    /**
     * 用户组名称
     */
    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

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

    /**
     * 获取用户组名称
     *
     * @return GROUP_NAME - 用户组名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置用户组名称
     *
     * @param groupName 用户组名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
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