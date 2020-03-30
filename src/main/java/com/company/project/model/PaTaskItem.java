package com.company.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "pa_task_item")
public class PaTaskItem {
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
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "task_item_dtime")
    private Date taskItemDtime;

    /**
     * 系统时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "update_dtime")
    private Date updateDtime;

    @Column(name = "flag_del")
    private Boolean flagDel;
    private Integer status;

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
     * 完成情况
     */
    private Boolean cena;

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
}