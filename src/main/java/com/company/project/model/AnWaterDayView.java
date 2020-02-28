package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "AN_WATER_DAY_VIEW")
public class AnWaterDayView {
    /**
     * 唯一标识
     */
    @Id
    @Column(name = "UNID")
    private String unid;

    /**
     * 表示日期 如果20200220
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 最大值
     */
    @Column(name = "MAX")
    private Double max;

    /**
     * 最小值
     */
    @Column(name = "MIN")
    private Double min;

    /**
     * 平均值
     */
    @Column(name = "AVE")
    private Double ave;

    /**
     * 0标识水压 1标识液位
     */
    @Column(name = "TYPE")
    private Boolean type;

    /**
     * 预警或报警次数
     */
    @Column(name = "ALARMCOUNT")
    private Short alarmcount;

    /**
     * 系统时间
     */
    @Column(name = "SYSTEM_DATIME")
    private Date systemDatime;

    /**
     * 分组唯一标识
     */
    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

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
     * 获取表示日期 如果20200220
     *
     * @return NAME - 表示日期 如果20200220
     */
    public String getName() {
        return name;
    }

    /**
     * 设置表示日期 如果20200220
     *
     * @param name 表示日期 如果20200220
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取最大值
     *
     * @return MAX - 最大值
     */
    public Double getMax() {
        return max;
    }

    /**
     * 设置最大值
     *
     * @param max 最大值
     */
    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * 获取最小值
     *
     * @return MIN - 最小值
     */
    public Double getMin() {
        return min;
    }

    /**
     * 设置最小值
     *
     * @param min 最小值
     */
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * 获取平均值
     *
     * @return AVE - 平均值
     */
    public Double getAve() {
        return ave;
    }

    /**
     * 设置平均值
     *
     * @param ave 平均值
     */
    public void setAve(Double ave) {
        this.ave = ave;
    }

    /**
     * 获取0标识水压 1标识液位
     *
     * @return TYPE - 0标识水压 1标识液位
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置0标识水压 1标识液位
     *
     * @param type 0标识水压 1标识液位
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * 获取预警或报警次数
     *
     * @return ALARMCOUNT - 预警或报警次数
     */
    public Short getAlarmcount() {
        return alarmcount;
    }

    /**
     * 设置预警或报警次数
     *
     * @param alarmcount 预警或报警次数
     */
    public void setAlarmcount(Short alarmcount) {
        this.alarmcount = alarmcount;
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

    /**
     * 获取分组唯一标识
     *
     * @return DOMAIN_UNID - 分组唯一标识
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * 设置分组唯一标识
     *
     * @param domainUnid 分组唯一标识
     */
    public void setDomainUnid(String domainUnid) {
        this.domainUnid = domainUnid;
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