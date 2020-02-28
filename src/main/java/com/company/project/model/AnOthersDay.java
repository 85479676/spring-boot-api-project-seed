package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "AN_OTHERS_DAY")
public class AnOthersDay {
    /**
     * 唯一标识
     */
    @Id
    @Column(name = "UNID")
    private String unid;

    /**
     * 报警日期
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 报警次数
     */
    @Column(name = "ALARM_COUNT")
    private Integer alarmCount;

    /**
     * 系统时间
     */
    @Column(name = "SYSTEM_DATIME")
    private Date systemDatime;

    /**
     * 获取唯一标识
     *
     * @return UNID - 唯一标识
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
     * 获取报警日期
     *
     * @return NAME - 报警日期
     */
    public String getName() {
        return name;
    }

    /**
     * 设置报警日期
     *
     * @param name 报警日期
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取报警次数
     *
     * @return ALARM_COUNT - 报警次数
     */
    public Integer getAlarmCount() {
        return alarmCount;
    }

    /**
     * 设置报警次数
     *
     * @param alarmCount 报警次数
     */
    public void setAlarmCount(Integer alarmCount) {
        this.alarmCount = alarmCount;
    }

    /**
     * 获取系统时间
     *
     * @return SYSTEM_DATIME - 系统时间
     */
    public Date getSystemDatime() {
        return systemDatime;
    }

    /**
     * 设置系统时间
     *
     * @param systemDatime 系统时间
     */
    public void setSystemDatime(Date systemDatime) {
        this.systemDatime = systemDatime;
    }
}