package com.company.project.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Table(name = "LOG_ALARM_HISTORY")
@Data
public class LogAlarmHistory {
    @JSONField(serialize = false)
    private String unid;

    /**
     * 设备唯一标识
     */
    @Id
    @JSONField(serialize = false)
    @Column(name = "facility_unid")
    private String facilityUnid;

    /**
     * 事件开始时间
     */
    @JSONField(serialize = false)
    private Date start;

    /**
     * 事件结束时间
     */
    @JSONField(serialize = false)
    private Date end;

    /**
     * 系统时间
     */
    @JSONField(serialize = false)
    @Column(name = "system_dtime")
    private Date systemDtime;

    /**
     * 事件描述
     */
    @JSONField(serialize = false)
    @Column(name = "event_comment")
    private String eventComment;

    /**
     * 主机地址
     */
    @JSONField(serialize = false)
    @Column(name = "id_host")
    private String idHost;

    /**
     * 事件别名
     */
    private String alias;

    @JSONField(serialize = false)
    private Boolean status;

    @Transient
    private String amount;
    @Transient

    private Date key;

    @Transient
    @JSONField(serialize = false)
    private String name;

    @Transient
    @JSONField(serialize = false)
    private double percent;

    @Transient
    @JSONField(serialize = false)
    private double totalAmount;
    @Transient
    @JSONField(serialize = false)
    private double weight;

}