package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "pa_task_item_point_item_map")
public class PaTaskItemPointItemMap {
    private String unid;
    @Id
    @Column(name = "task_item_unid")
    private String taskItemUnid;

    @Column(name = "point_item_unid")
    private String pointItemUnid;

    private Integer status;

    /**
     * 点位完成时间
     */
    @Column(name = "system_dtime")
    private Date systemDtime;

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
     * @return task_item_unid
     */
    public String getTaskItemUnid() {
        return taskItemUnid;
    }

    /**
     * @param taskItemUnid
     */
    public void setTaskItemUnid(String taskItemUnid) {
        this.taskItemUnid = taskItemUnid;
    }

    /**
     * @return point_item_unid
     */
    public String getPointItemUnid() {
        return pointItemUnid;
    }

    /**
     * @param pointItemUnid
     */
    public void setPointItemUnid(String pointItemUnid) {
        this.pointItemUnid = pointItemUnid;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取点位完成时间
     *
     * @return system_dtime - 点位完成时间
     */
    public Date getSystemDtime() {
        return systemDtime;
    }

    /**
     * 设置点位完成时间
     *
     * @param systemDtime 点位完成时间
     */
    public void setSystemDtime(Date systemDtime) {
        this.systemDtime = systemDtime;
    }
}