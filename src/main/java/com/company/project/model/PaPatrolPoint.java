package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pa_patrol_point")
public class PaPatrolPoint {
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    private String unid;

    /**
     * 巡检点位名称
     */
    private String name;

    /**
     * 所属公司
     */
    @Column(name = "company_unid")
    private String companyUnid;

    /**
     * 层id
     */
    @Column(name = "layer_unid")
    private String layerUnid;

    /**
     * 所属商铺
     */
    @Column(name = "shops_unid")
    private String shopsUnid;

    /**
     * 位置
     */
    private String location;
    private Boolean state;

    /**
     * 二维码code
     */
    @Column(name = "point_qr")
    private String pointQr;

    @Column(name = "domain_unid")
    private String domainUnid;

    /**
     * 创建时间
     */
    @Column(name = "system_dtime")
    private Date systemDtime;

    /**
     * 修改时间
     */
    @Column(name = "update_dtime")
    private Date updateDtime;

    @Column(name = "flag_del")
    private Boolean flagDel;

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * @return unid
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
     * 获取巡检点位名称
     *
     * @return name - 巡检点位名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置巡检点位名称
     *
     * @param name 巡检点位名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取所属公司
     *
     * @return company_unid - 所属公司
     */
    public String getCompanyUnid() {
        return companyUnid;
    }

    /**
     * 设置所属公司
     *
     * @param companyUnid 所属公司
     */
    public void setCompanyUnid(String companyUnid) {
        this.companyUnid = companyUnid;
    }

    /**
     * 获取层id
     *
     * @return layer_unid - 层id
     */
    public String getLayerUnid() {
        return layerUnid;
    }

    /**
     * 设置层id
     *
     * @param layerUnid 层id
     */
    public void setLayerUnid(String layerUnid) {
        this.layerUnid = layerUnid;
    }

    /**
     * 获取所属商铺
     *
     * @return shops_unid - 所属商铺
     */
    public String getShopsUnid() {
        return shopsUnid;
    }

    /**
     * 设置所属商铺
     *
     * @param shopsUnid 所属商铺
     */
    public void setShopsUnid(String shopsUnid) {
        this.shopsUnid = shopsUnid;
    }

    /**
     * 获取位置
     *
     * @return location - 位置
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置位置
     *
     * @param location 位置
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取二维码code
     *
     * @return point_qr - 二维码code
     */
    public String getPointQr() {
        return pointQr;
    }

    /**
     * 设置二维码code
     *
     * @param pointQr 二维码code
     */
    public void setPointQr(String pointQr) {
        this.pointQr = pointQr;
    }

    /**
     * @return domain_unid
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
     * 获取创建时间
     *
     * @return system_dtime - 创建时间
     */
    public Date getSystemDtime() {
        return systemDtime;
    }

    /**
     * 设置创建时间
     *
     * @param systemDtime 创建时间
     */
    public void setSystemDtime(Date systemDtime) {
        this.systemDtime = systemDtime;
    }

    /**
     * 获取修改时间
     *
     * @return update_dtime - 修改时间
     */
    public Date getUpdateDtime() {
        return updateDtime;
    }

    /**
     * 设置修改时间
     *
     * @param updateDtime 修改时间
     */
    public void setUpdateDtime(Date updateDtime) {
        this.updateDtime = updateDtime;
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