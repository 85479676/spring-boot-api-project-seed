package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pa_patrol_plan_date_view")
public class PaPatrolPlanDateView {
    @Id
    private String unid;

    /**
     * 巡检周期名称
     */
    private String name;

    /**
     * 巡检周期编号
     */
    private Integer num;

    /**
     * 删除标识
     */
    @Column(name = "flag_del")
    private Boolean flagDel;

    /**
     * 分组名称
     */
    @Column(name = "domain_unid")
    private String domainUnid;

    /**
     * 新增日期
     */
    @Column(name = "system_dtime")
    private Date systemDtime;

    /**
     * 修改日期
     */
    @Column(name = "update_dtime")
    private Date updateDtime;

    /**
     * 开始
     */
    private Date start;

    /**
     * 结束
     */
    private Date end;

    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

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
     * 获取巡检周期名称
     *
     * @return name - 巡检周期名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置巡检周期名称
     *
     * @param name 巡检周期名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取巡检周期编号
     *
     * @return num - 巡检周期编号
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置巡检周期编号
     *
     * @param num 巡检周期编号
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取删除标识
     *
     * @return flag_del - 删除标识
     */
    public Boolean getFlagDel() {
        return flagDel;
    }

    /**
     * 设置删除标识
     *
     * @param flagDel 删除标识
     */
    public void setFlagDel(Boolean flagDel) {
        this.flagDel = flagDel;
    }

    /**
     * 获取分组名称
     *
     * @return domain_unid - 分组名称
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * 设置分组名称
     *
     * @param domainUnid 分组名称
     */
    public void setDomainUnid(String domainUnid) {
        this.domainUnid = domainUnid;
    }

    /**
     * 获取新增日期
     *
     * @return system_dtime - 新增日期
     */
    public Date getSystemDtime() {
        return systemDtime;
    }

    /**
     * 设置新增日期
     *
     * @param systemDtime 新增日期
     */
    public void setSystemDtime(Date systemDtime) {
        this.systemDtime = systemDtime;
    }

    /**
     * 获取修改日期
     *
     * @return update_dtime - 修改日期
     */
    public Date getUpdateDtime() {
        return updateDtime;
    }

    /**
     * 设置修改日期
     *
     * @param updateDtime 修改日期
     */
    public void setUpdateDtime(Date updateDtime) {
        this.updateDtime = updateDtime;
    }

    /**
     * 获取开始
     *
     * @return start - 开始
     */
    public Date getStart() {
        return start;
    }

    /**
     * 设置开始
     *
     * @param start 开始
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * 获取结束
     *
     * @return end - 结束
     */
    public Date getEnd() {
        return end;
    }

    /**
     * 设置结束
     *
     * @param end 结束
     */
    public void setEnd(Date end) {
        this.end = end;
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