package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "ma_deduction_item")
public class MaDeductionItems {
//    @Column(name = "domain_unid")
//    private String domainUnid;
    /**
     * 扣分值
     */
    @Column(name = "mark_value")
    private Double markValue;
    @Transient
    private Double total;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * 报警等级
     */
    private Integer level;

//    public String getDomainUnid() {
//        return domainUnid;
//    }
//
//    public void setDomainUnid(String domainUnid) {
//        this.domainUnid = domainUnid;
//    }

    public Double getMarkValue() {
        return markValue;
    }

    public void setMarkValue(Double markValue) {
        this.markValue = markValue;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
