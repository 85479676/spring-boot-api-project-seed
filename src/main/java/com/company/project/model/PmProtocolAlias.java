package com.company.project.model;

import javax.persistence.*;

@Table(name = "pm_protocol_alias")
public class PmProtocolAlias {
    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    private String unid;

    /**
     * 名称
     */
    private String name;

    /**
     * code
     */
    private String code;

    @Column(name = "flag_del")
    private Boolean flagDel;

    /**
     * 获取唯一标识
     *
     * @return unid - 唯一标识
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置唯一标识
     *
     * @param unid 唯一标识
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取code
     *
     * @return code - code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code
     *
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return flag_del
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