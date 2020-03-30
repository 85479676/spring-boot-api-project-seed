package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "pa_patrol_point_item_wx_view")
public class PaPatrolPointItemWxView {
    /**
     * 序号
     */
    private Long aiid;
    @Id
    private String unid;

    /**
     * 巡检名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 结果
     */
    private String result;

    /**
     * 分组
     */
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

    /**
     * 巡检点唯一标识
     */
    @Column(name = "patrol_point_unid")
    private String patrolPointUnid;

    /**
     * 巡检点位名称
     */
    @Column(name = "point_name")
    private String pointName;

    @Column(name = "result_name")
    private String resultName;

    @Column(name = "domain_name")
    private String domainName;

    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

    /**
     * 获取序号
     *
     * @return aiid - 序号
     */
    public Long getAiid() {
        return aiid;
    }

    /**
     * 设置序号
     *
     * @param aiid 序号
     */
    public void setAiid(Long aiid) {
        this.aiid = aiid;
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
     * 获取巡检名称
     *
     * @return name - 巡检名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置巡检名称
     *
     * @param name 巡检名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取结果
     *
     * @return result - 结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置结果
     *
     * @param result 结果
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取分组
     *
     * @return domain_unid - 分组
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * 设置分组
     *
     * @param domainUnid 分组
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

    /**
     * 获取巡检点唯一标识
     *
     * @return patrol_point_unid - 巡检点唯一标识
     */
    public String getPatrolPointUnid() {
        return patrolPointUnid;
    }

    /**
     * 设置巡检点唯一标识
     *
     * @param patrolPointUnid 巡检点唯一标识
     */
    public void setPatrolPointUnid(String patrolPointUnid) {
        this.patrolPointUnid = patrolPointUnid;
    }

    /**
     * 获取巡检点位名称
     *
     * @return point_name - 巡检点位名称
     */
    public String getPointName() {
        return pointName;
    }

    /**
     * 设置巡检点位名称
     *
     * @param pointName 巡检点位名称
     */
    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    /**
     * @return result_name
     */
    public String getResultName() {
        return resultName;
    }

    /**
     * @param resultName
     */
    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    /**
     * @return domain_name
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
}