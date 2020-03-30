package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "LOG_ALARM_HISTORY_VIEW")
public class LogAlarmHistoryViews {

    @Column(name = "STATUS")
    private Integer status;
    /**
     * 事件别名
     */
    @Column(name = "ALIAS")
    private String alias;

    @Column(name = "AlarmInfo")
    private String alarminfo;

    /**
     * @return STATUS
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
     * 获取事件别名
     *
     * @return ALIAS - 事件别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置事件别名
     *
     * @param alias 事件别名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }


    /**
     * @return AlarmInfo
     */
    public String getAlarminfo() {
        return alarminfo;
    }

    /**
     * @param alarminfo
     */
    public void setAlarminfo(String alarminfo) {
        this.alarminfo = alarminfo;
    }


}
