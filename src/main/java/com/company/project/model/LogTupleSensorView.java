package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "LOG_TUPLE_SENSOR_VIEW")
public class LogTupleSensorView {
    @Id
    @Column(name = "AIID")
    private Long aiid;

    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    @Column(name = "MILLI_EPOCH")
    private Long milliEpoch;

    @Column(name = "AIID_ENTITY")
    private Integer aiidEntity;

    @Column(name = "ID_CHANNEL")
    private Short idChannel;

    @Column(name = "ID_HOST")
    private String idHost;

    @Column(name = "T0")
    private BigDecimal t0;

    @Column(name = "T1")
    private BigDecimal t1;

    @Column(name = "T2")
    private BigDecimal t2;

    @Column(name = "T3")
    private BigDecimal t3;

    @Column(name = "T4")
    private BigDecimal t4;

    @Column(name = "T5")
    private BigDecimal t5;

    @Column(name = "T6")
    private BigDecimal t6;

    @Column(name = "T7")
    private BigDecimal t7;

    @Column(name = "T8")
    private BigDecimal t8;

    @Column(name = "T9")
    private BigDecimal t9;

    @Column(name = "FACILITY_NAME")
    private String facilityName;

    /**
     * @return AIID
     */
    public Long getAiid() {
        return aiid;
    }

    /**
     * @param aiid
     */
    public void setAiid(Long aiid) {
        this.aiid = aiid;
    }

    /**
     * @return DATIME_SYS
     */
    public Date getDatimeSys() {
        return datimeSys;
    }

    /**
     * @param datimeSys
     */
    public void setDatimeSys(Date datimeSys) {
        this.datimeSys = datimeSys;
    }

    /**
     * @return MILLI_EPOCH
     */
    public Long getMilliEpoch() {
        return milliEpoch;
    }

    /**
     * @param milliEpoch
     */
    public void setMilliEpoch(Long milliEpoch) {
        this.milliEpoch = milliEpoch;
    }

    /**
     * @return AIID_ENTITY
     */
    public Integer getAiidEntity() {
        return aiidEntity;
    }

    /**
     * @param aiidEntity
     */
    public void setAiidEntity(Integer aiidEntity) {
        this.aiidEntity = aiidEntity;
    }

    /**
     * @return ID_CHANNEL
     */
    public Short getIdChannel() {
        return idChannel;
    }

    /**
     * @param idChannel
     */
    public void setIdChannel(Short idChannel) {
        this.idChannel = idChannel;
    }

    /**
     * @return ID_HOST
     */
    public String getIdHost() {
        return idHost;
    }

    /**
     * @param idHost
     */
    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }

    /**
     * @return T0
     */
    public BigDecimal getT0() {
        return t0;
    }

    /**
     * @param t0
     */
    public void setT0(BigDecimal t0) {
        this.t0 = t0;
    }

    /**
     * @return T1
     */
    public BigDecimal getT1() {
        return t1;
    }

    /**
     * @param t1
     */
    public void setT1(BigDecimal t1) {
        this.t1 = t1;
    }

    /**
     * @return T2
     */
    public BigDecimal getT2() {
        return t2;
    }

    /**
     * @param t2
     */
    public void setT2(BigDecimal t2) {
        this.t2 = t2;
    }

    /**
     * @return T3
     */
    public BigDecimal getT3() {
        return t3;
    }

    /**
     * @param t3
     */
    public void setT3(BigDecimal t3) {
        this.t3 = t3;
    }

    /**
     * @return T4
     */
    public BigDecimal getT4() {
        return t4;
    }

    /**
     * @param t4
     */
    public void setT4(BigDecimal t4) {
        this.t4 = t4;
    }

    /**
     * @return T5
     */
    public BigDecimal getT5() {
        return t5;
    }

    /**
     * @param t5
     */
    public void setT5(BigDecimal t5) {
        this.t5 = t5;
    }

    /**
     * @return T6
     */
    public BigDecimal getT6() {
        return t6;
    }

    /**
     * @param t6
     */
    public void setT6(BigDecimal t6) {
        this.t6 = t6;
    }

    /**
     * @return T7
     */
    public BigDecimal getT7() {
        return t7;
    }

    /**
     * @param t7
     */
    public void setT7(BigDecimal t7) {
        this.t7 = t7;
    }

    /**
     * @return T8
     */
    public BigDecimal getT8() {
        return t8;
    }

    /**
     * @param t8
     */
    public void setT8(BigDecimal t8) {
        this.t8 = t8;
    }

    /**
     * @return T9
     */
    public BigDecimal getT9() {
        return t9;
    }

    /**
     * @param t9
     */
    public void setT9(BigDecimal t9) {
        this.t9 = t9;
    }

    /**
     * @return FACILITY_NAME
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * @param facilityName
     */
    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }
}