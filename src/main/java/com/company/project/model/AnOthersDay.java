package com.company.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "AN_OTHERS_DAY")
@Data
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
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @Column(name = "DATIME_TIME")
    private Date datimeTime;

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
     * 故障次数
     */
    @Column(name = "FAULT_COUNT")
    private Integer faultCount;

    /**
     * 设备唯一标识
     */
    @Column(name = "FACILITY_UNID")
    private String facilityUnid;

}