package com.company.project.model;

import javax.persistence.*;

@Table(name = "LEG_USER_GROUP_PRIVILEGE_MAP")
public class LegUserGroupPrivilegeMap {
    @Id
    @Column(name = "USER_GROUP_USER")
    private String userGroupUser;

    @Column(name = "PRIVILEGE_UNID")
    private String privilegeUnid;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

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
}