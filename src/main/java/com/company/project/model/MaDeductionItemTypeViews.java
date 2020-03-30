package com.company.project.model;

import javax.persistence.Column;

public class MaDeductionItemTypeViews {
    @Column(name = "mark_value")
    private Double markValue;
    @Column(name = "max_mark")
    private Double maxMark;
    private Integer type;

    public Double getMarkValue() {
        return markValue;
    }

    public void setMarkValue(Double markValue) {
        this.markValue = markValue;
    }

    public Double getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(Double maxMark) {
        this.maxMark = maxMark;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
