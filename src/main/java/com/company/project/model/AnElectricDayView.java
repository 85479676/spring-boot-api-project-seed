package com.company.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "AN_ELECTRIC_DAY_VIEW")
public class AnElectricDayView {
    /**
     * 设备唯一标识
     */
    @Id
    @Column(name = "UNID")
    private String unid;

    /**
     * 日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @Column(name = "NAME_DATE")
    private Date nameDate;
    @Column(name = "ALARM_COUNT")
    private Integer alarmCount;

    /**
     * 电流最大值
     */
    @Column(name = "ELEC_A_MAX")
    private Double elecAMax;

    /**
     * 电流最小值
     */
    @Column(name = "ELEC_A_MIN")
    private Double elecAMin;

    /**
     * 电流平均值
     */
    @Column(name = "ELEC_A_AVE")
    private Double elecAAve;

    @Column(name = "TEML_MAX")
    private Double temlMax;

    @Column(name = "TEML_MIN")
    private Double temlMin;

    @Column(name = "TEML_AVE")
    private Double temlAve;

    @Column(name = "TEM2_MAX")
    private Double tem2Max;

    @Column(name = "TEM2_MIN")
    private Double tem2Min;

    @Column(name = "TEM2_AVE")
    private Double tem2Ave;

    @Column(name = "TEM3_MAX")
    private Double tem3Max;

    @Column(name = "TEM3_MIN")
    private Double tem3Min;

    @Column(name = "TEM3_AVE")
    private Double tem3Ave;

    @Column(name = "TEM4_MAX")
    private Double tem4Max;

    @Column(name = "TEM4_MIN")
    private Double tem4Min;

    @Column(name = "TEM4_AVE")
    private Double tem4Ave;

    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

    @Column(name = "SYSTEM_DATIME")
    private Date systemDatime;

    @Column(name = "ELEC_V_MAX")
    private Double elecVMax;

    @Column(name = "ELEC_V_MIN")
    private Double elecVMin;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    public Integer getAlarmCount() {
        return alarmCount;
    }

    public void setAlarmCount(Integer alarmCount) {
        this.alarmCount = alarmCount;
    }

    /**
     * 获取设备唯一标识
     *
     * @return UNID - 设备唯一标识
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置设备唯一标识
     *
     * @param unid 设备唯一标识
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    public Date getNameDate() {
        return nameDate;
    }

    public void setNameDate(Date nameDate) {
        this.nameDate = nameDate;
    }

    /**
     * 获取电流最大值
     *
     * @return ELEC_A_MAX - 电流最大值
     */
    public Double getElecAMax() {
        return elecAMax;
    }

    /**
     * 设置电流最大值
     *
     * @param elecAMax 电流最大值
     */
    public void setElecAMax(Double elecAMax) {
        this.elecAMax = elecAMax;
    }

    /**
     * 获取电流最小值
     *
     * @return ELEC_A_MIN - 电流最小值
     */
    public Double getElecAMin() {
        return elecAMin;
    }

    /**
     * 设置电流最小值
     *
     * @param elecAMin 电流最小值
     */
    public void setElecAMin(Double elecAMin) {
        this.elecAMin = elecAMin;
    }

    /**
     * 获取电流平均值
     *
     * @return ELEC_A_AVE - 电流平均值
     */
    public Double getElecAAve() {
        return elecAAve;
    }

    /**
     * 设置电流平均值
     *
     * @param elecAAve 电流平均值
     */
    public void setElecAAve(Double elecAAve) {
        this.elecAAve = elecAAve;
    }

    /**
     * @return TEML_MAX
     */
    public Double getTemlMax() {
        return temlMax;
    }

    /**
     * @param temlMax
     */
    public void setTemlMax(Double temlMax) {
        this.temlMax = temlMax;
    }

    /**
     * @return TEML_MIN
     */
    public Double getTemlMin() {
        return temlMin;
    }

    /**
     * @param temlMin
     */
    public void setTemlMin(Double temlMin) {
        this.temlMin = temlMin;
    }

    /**
     * @return TEML_AVE
     */
    public Double getTemlAve() {
        return temlAve;
    }

    /**
     * @param temlAve
     */
    public void setTemlAve(Double temlAve) {
        this.temlAve = temlAve;
    }

    /**
     * @return TEM2_MAX
     */
    public Double getTem2Max() {
        return tem2Max;
    }

    /**
     * @param tem2Max
     */
    public void setTem2Max(Double tem2Max) {
        this.tem2Max = tem2Max;
    }

    /**
     * @return TEM2_MIN
     */
    public Double getTem2Min() {
        return tem2Min;
    }

    /**
     * @param tem2Min
     */
    public void setTem2Min(Double tem2Min) {
        this.tem2Min = tem2Min;
    }

    /**
     * @return TEM2_AVE
     */
    public Double getTem2Ave() {
        return tem2Ave;
    }

    /**
     * @param tem2Ave
     */
    public void setTem2Ave(Double tem2Ave) {
        this.tem2Ave = tem2Ave;
    }

    /**
     * @return TEM3_MAX
     */
    public Double getTem3Max() {
        return tem3Max;
    }

    /**
     * @param tem3Max
     */
    public void setTem3Max(Double tem3Max) {
        this.tem3Max = tem3Max;
    }

    /**
     * @return TEM3_MIN
     */
    public Double getTem3Min() {
        return tem3Min;
    }

    /**
     * @param tem3Min
     */
    public void setTem3Min(Double tem3Min) {
        this.tem3Min = tem3Min;
    }

    /**
     * @return TEM3_AVE
     */
    public Double getTem3Ave() {
        return tem3Ave;
    }

    /**
     * @param tem3Ave
     */
    public void setTem3Ave(Double tem3Ave) {
        this.tem3Ave = tem3Ave;
    }

    /**
     * @return TEM4_MAX
     */
    public Double getTem4Max() {
        return tem4Max;
    }

    /**
     * @param tem4Max
     */
    public void setTem4Max(Double tem4Max) {
        this.tem4Max = tem4Max;
    }

    /**
     * @return TEM4_MIN
     */
    public Double getTem4Min() {
        return tem4Min;
    }

    /**
     * @param tem4Min
     */
    public void setTem4Min(Double tem4Min) {
        this.tem4Min = tem4Min;
    }

    /**
     * @return TEM4_AVE
     */
    public Double getTem4Ave() {
        return tem4Ave;
    }

    /**
     * @param tem4Ave
     */
    public void setTem4Ave(Double tem4Ave) {
        this.tem4Ave = tem4Ave;
    }

    /**
     * @return DOMAIN_UNID
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * @param domainUnid
     */
    public void setDomainUnid(String domainUnid) {
        this.domainUnid = domainUnid;
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
     * @return SYSTEM_DATIME
     */
    public Date getSystemDatime() {
        return systemDatime;
    }

    /**
     * @param systemDatime
     */
    public void setSystemDatime(Date systemDatime) {
        this.systemDatime = systemDatime;
    }

    /**
     * @return ELEC_V_MAX
     */
    public Double getElecVMax() {
        return elecVMax;
    }

    /**
     * @param elecVMax
     */
    public void setElecVMax(Double elecVMax) {
        this.elecVMax = elecVMax;
    }

    /**
     * @return ELEC_V_MIN
     */
    public Double getElecVMin() {
        return elecVMin;
    }

    /**
     * @param elecVMin
     */
    public void setElecVMin(Double elecVMin) {
        this.elecVMin = elecVMin;
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