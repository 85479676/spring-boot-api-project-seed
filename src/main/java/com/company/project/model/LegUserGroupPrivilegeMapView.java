package com.company.project.model;

import javax.persistence.*;

@Table(name = "LEG_USER_GROUP_PRIVILEGE_MAP_VIEW")
public class LegUserGroupPrivilegeMapView {
    @Id
    @Column(name = "USER_GROUP_USER")
    private String userGroupUser;

    @Column(name = "PRIVILEGE_UNID")
    private String privilegeUnid;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    /**
     * 用户组名称
     */
    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "PRIVILE_NAME")
    private String privileName;

    /**
     * @return USER_GROUP_USER
     */
    public String getUserGroupUser() {
        return userGroupUser;
    }

    /**
     * @param userGroupUser
     */
    public void setUserGroupUser(String userGroupUser) {
        this.userGroupUser = userGroupUser;
    }

    /**
     * @return PRIVILEGE_UNID
     */
    public String getPrivilegeUnid() {
        return privilegeUnid;
    }

    /**
     * @param privilegeUnid
     */
    public void setPrivilegeUnid(String privilegeUnid) {
        this.privilegeUnid = privilegeUnid;
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
     * @return PRIVILE_NAME
     */
    public String getPrivileName() {
        return privileName;
    }

    /**
     * @param privileName
     */
    public void setPrivileName(String privileName) {
        this.privileName = privileName;
    }
}