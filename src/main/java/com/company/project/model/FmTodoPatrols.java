package com.company.project.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Transient;
import java.util.Date;

@Data
public class FmTodoPatrols {
    @JSONField(serialize = false)
    @Column(name = "AIID")
    private Integer aiid;
    @JSONField(serialize = false)
    @Column(name = "DATIME_SYS")
    private Date datimeSys;
    @JSONField(serialize = false)
    @Column(name = "FLAG_DONE")
    private Boolean flagDone;
    @Column(name = "FLAG_DEL")
    @JSONField(serialize = false)
    private Boolean flagDel;
    @Transient
    private double amount;
    @Transient
//    @JSONField(serialize = false)
    private String key;

    @Transient
    @JSONField(serialize = false)
    private String name;

    @Transient
    @JSONField(serialize = false)
    private double percent;
    @Transient
    @JSONField(serialize = false)
    private double totalAmount;


    public Integer getAiid() {
        return aiid;
    }

    public void setAiid(Integer aiid) {
        this.aiid = aiid;
    }

    public Date getDatimeSys() {
        return datimeSys;
    }

    public void setDatimeSys(Date datimeSys) {
        this.datimeSys = datimeSys;
    }

    public Boolean getFlagDone() {
        return flagDone;
    }

    public void setFlagDone(Boolean flagDone) {
        this.flagDone = flagDone;
    }

    public Boolean getFlagDel() {
        return flagDel;
    }

    public void setFlagDel(Boolean flagDel) {
        this.flagDel = flagDel;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
