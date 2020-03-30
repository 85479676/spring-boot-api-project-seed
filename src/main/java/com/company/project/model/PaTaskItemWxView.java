package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "pa_task_item_wx_view")
public class PaTaskItemWxView {
    /**
     * 唯一
     */
    @Id
    private String unid;

    /**
     * 巡检人
     */
    @Column(name = "user_unid")
    private String userUnid;

    /**
     * 巡检时间
     */
    @Column(name = "task_item_dtime")
    private Date taskItemDtime;

    /**
     * 系统时间
     */
    @Column(name = "update_dtime")
    private Date updateDtime;

    @Column(name = "flag_del")
    private Boolean flagDel;

    /**
     * 任务唯一标识
     */
    @Column(name = "task_unid")
    private String taskUnid;

    /**
     * 巡检点唯一标识
     */
    @Column(name = "patrol_point_unid")
    private String patrolPointUnid;
    /**
     * 名称
     * 完成状态
     */
    @Column(name = "status_name")
    private String statusName;
    /**
     * 完成状态
     */
    private Integer status;


    @Column(name = "task_name")
    private String taskName;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * 完成情况
     */
    private Boolean cena;

    /**
     * 巡检点位名称
     */
    @Column(name = "point_name")
    private String pointName;

    @Column(name = "NAME_LOGIN")
    private String nameLogin;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

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


    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取唯一
     *
     * @return unid - 唯一
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置唯一
     *
     * @param unid 唯一
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取巡检人
     *
     * @return user_unid - 巡检人
     */
    public String getUserUnid() {
        return userUnid;
    }

    /**
     * 设置巡检人
     *
     * @param userUnid 巡检人
     */
    public void setUserUnid(String userUnid) {
        this.userUnid = userUnid;
    }

    /**
     * 获取巡检时间
     *
     * @return task_item_dtime - 巡检时间
     */
    public Date getTaskItemDtime() {
        return taskItemDtime;
    }

    /**
     * 设置巡检时间
     *
     * @param taskItemDtime 巡检时间
     */
    public void setTaskItemDtime(Date taskItemDtime) {
        this.taskItemDtime = taskItemDtime;
    }

    /**
     * 获取系统时间
     *
     * @return update_dtime - 系统时间
     */
    public Date getUpdateDtime() {
        return updateDtime;
    }

    /**
     * 设置系统时间
     *
     * @param updateDtime 系统时间
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
     * 获取任务唯一标识
     *
     * @return task_unid - 任务唯一标识
     */
    public String getTaskUnid() {
        return taskUnid;
    }

    /**
     * 设置任务唯一标识
     *
     * @param taskUnid 任务唯一标识
     */
    public void setTaskUnid(String taskUnid) {
        this.taskUnid = taskUnid;
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
     * 获取完成情况
     *
     * @return cena - 完成情况
     */
    public Boolean getCena() {
        return cena;
    }

    /**
     * 设置完成情况
     *
     * @param cena 完成情况
     */
    public void setCena(Boolean cena) {
        this.cena = cena;
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
     * @return NAME_LOGIN
     */
    public String getNameLogin() {
        return nameLogin;
    }

    /**
     * @param nameLogin
     */
    public void setNameLogin(String nameLogin) {
        this.nameLogin = nameLogin;
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
}