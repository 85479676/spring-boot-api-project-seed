package com.company.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pa_patrol_plan_time")
public class PaPatrolPlanTime {

    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    @Column(name = "unid")
    private String unid;

    @Column(name = "pa_plan_date_unid")
    private String paPlanDateUnid;


    @Column(name = "pa_plan_unid")
    private String paPlanUnid;

    /**
     * 开始
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date start;

    /**
     * 结束
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date end;

    @Column(name = "flag_del")
    private Boolean flagDel;

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * @return pa_plan_date_unid
     */
    public String getPaPlanDateUnid() {
        return paPlanDateUnid;
    }

    /**
     * @param paPlanDateUnid
     */
    public void setPaPlanDateUnid(String paPlanDateUnid) {
        this.paPlanDateUnid = paPlanDateUnid;
    }

    /**
     * @return pa_plan_unid
     */
    public String getPaPlanUnid() {
        return paPlanUnid;
    }

    /**
     * @param paPlanUnid
     */
    public void setPaPlanUnid(String paPlanUnid) {
        this.paPlanUnid = paPlanUnid;
    }

    /**
     * 获取开始
     *
     * @return start - 开始
     */
    public Date getStart() {
        return start;
    }

    /**
     * 设置开始
     *
     * @param start 开始
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * 获取结束
     *
     * @return end - 结束
     */
    public Date getEnd() {
        return end;
    }

    /**
     * 设置结束
     *
     * @param end 结束
     */
    public void setEnd(Date end) {
        this.end = end;
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