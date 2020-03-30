package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "pm_pa_task_item_view")
public class PmPaTaskItemView {
    @Id
    private String unid;

    /**
     * 巡检日期
     */
    @Column(name = "task_date")
    private Date taskDate;

    /**
     * 任务名称
     */
    private String name;

    /**
     * 开始时间
     */
    @Column(name = "task_time_start")
    private Date taskTimeStart;

    /**
     * 结束时间
     */
    @Column(name = "task_time_end")
    private Date taskTimeEnd;

    /**
     * 所属分组
     */
    @Column(name = "domain_unid")
    private String domainUnid;

    @Column(name = "point_unid")
    private String pointUnid;
    /**
     * 创建时间
     */
    @Column(name = "system_dtime")
    private Date systemDtime;

    @Column(name = "flag_del")
    private Boolean flagDel;

    @Column(name = "domain_name")
    private String domainName;

    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

    @Column(name = "point_name")
    private String pointName;
    @Column(name = "statas")
    private Integer status;
    @Column(name = "unDone")
            private Integer unDone;
    @Column(name = "statusCount")
    private Integer statusCount;


    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUnDone() {
        return unDone;
    }

    public void setUnDone(Integer unDone) {
        this.unDone = unDone;
    }

    public Integer getStatusCount() {
        return statusCount;
    }

    public void setStatusCount(Integer statusCount) {
        this.statusCount = statusCount;
    }

    public String getPointUnid() {
        return pointUnid;
    }

    public void setPointUnid() {
        this.pointUnid = pointUnid;
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
     * 获取巡检日期
     *
     * @return task_date - 巡检日期
     */
    public Date getTaskDate() {
        return taskDate;
    }

    /**
     * 设置巡检日期
     *
     * @param taskDate 巡检日期
     */
    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    /**
     * 获取任务名称
     *
     * @return name - 任务名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置任务名称
     *
     * @param name 任务名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取开始时间
     *
     * @return task_time_start - 开始时间
     */
    public Date getTaskTimeStart() {
        return taskTimeStart;
    }

    /**
     * 设置开始时间
     *
     * @param taskTimeStart 开始时间
     */
    public void setTaskTimeStart(Date taskTimeStart) {
        this.taskTimeStart = taskTimeStart;
    }

    /**
     * 获取结束时间
     *
     * @return task_time_end - 结束时间
     */
    public Date getTaskTimeEnd() {
        return taskTimeEnd;
    }

    /**
     * 设置结束时间
     *
     * @param taskTimeEnd 结束时间
     */
    public void setTaskTimeEnd(Date taskTimeEnd) {
        this.taskTimeEnd = taskTimeEnd;
    }

    /**
     * 获取所属分组
     *
     * @return domain_unid - 所属分组
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * 设置所属分组
     *
     * @param domainUnid 所属分组
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