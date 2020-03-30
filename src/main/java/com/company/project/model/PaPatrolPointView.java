package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "pa_patrol_point_view")
public class PaPatrolPointView {
    @Id
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
    private boolean state;
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



    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "shops_name")
    private String shopsName;

    @Column(name = "doomain_name")
    private String doomainName;

    @Column(name = "layer_unid_name")
    private String layerUnidName;

    @Column(name = "PointItemCount")
    private Integer pointitemcount;

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
     * @return state
     */
    public Boolean getState() {
        return state;
    }


    /**
     * @param state
     */
    public void setState(Boolean state) {
        this.state = state;
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

    /**
     * @return LEFT_INX
     */
    public Long getLeftInx() {
        return leftInx;
    }

    /**
     * @param leftInx
     */
    public void setLeftInx(Long leftInx) {
        this.leftInx = leftInx;
    }

    /**
     * @return RIGHT_INX
     */
    public Long getRightInx() {
        return rightInx;
    }

    /**
     * @param rightInx
     */
    public void setRightInx(Long rightInx) {
        this.rightInx = rightInx;
    }

    /**
     * @return company_name
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return shops_name
     */
    public String getShopsName() {
        return shopsName;
    }

    /**
     * @param shopsName
     */
    public void setShopsName(String shopsName) {
        this.shopsName = shopsName;
    }

    /**
     * @return doomain_name
     */
    public String getDoomainName() {
        return doomainName;
    }

    /**
     * @param doomainName
     */
    public void setDoomainName(String doomainName) {
        this.doomainName = doomainName;
    }

    /**
     * @return layer_unid_name
     */
    public String getLayerUnidName() {
        return layerUnidName;
    }

    /**
     * @param layerUnidName
     */
    public void setLayerUnidName(String layerUnidName) {
        this.layerUnidName = layerUnidName;
    }

    /**
     * @return PointItemCount
     */
    public Integer getPointitemcount() {
        return pointitemcount;
    }

    /**
     * @param pointitemcount
     */
    public void setPointitemcount(Integer pointitemcount) {
        this.pointitemcount = pointitemcount;
    }
}