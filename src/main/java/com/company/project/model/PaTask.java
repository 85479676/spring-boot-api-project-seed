package com.company.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pa_task")
public class PaTask {
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
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
//    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "task_time_start")
    private Date taskTimeStart;

    /**
     * 结束时间
     */
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "task_time_end")
    private Date taskTimeEnd;

    /**
     * 所属分组
     */
    @Column(name = "domain_unid")
    private String domainUnid;

    /**
     * 创建时间
     */
    @Column(name = "system_dtime")
    private Date systemDtime;

    @Column(name = "flag_del")
    private Boolean flagDel;

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
}