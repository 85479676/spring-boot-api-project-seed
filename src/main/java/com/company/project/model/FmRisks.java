package com.company.project.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Transient;

@Data
public class FmRisks {
    @Column(name = "AIID")
    @JSONField(serialize = false)
    private double aiid;
    @JSONField(serialize = false)
    @Column(name = "UNID")
    private String unid;
    @JSONField(serialize = false)
    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    @Column(name = "LEVEL")
    @JSONField(serialize = false)
    private double level;
    @JSONField(serialize = false)
    @Column(name = "ID_TYPE")
    private Integer idType;
    @JSONField(serialize = false)
    @Column(name = "ID_STATUS")
    private Short idStatus;

    @JSONField(serialize = false)
    @Column(name = "UNID_CELL")
    private String unidCell;
    @Transient
    @Column(name = "LOCATION")
    private String location;
    @JSONField(serialize = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @JSONField(serialize = false)
    @Column(name = "FLAG_DONE")
    private Boolean flagDone;
    @JSONField(serialize = false)
    @Column(name = "FLAG_DEL")
    private Boolean flagDel;


    @Transient
    private double amount;
    @Transient
//    @JSONField(serialize = false)
    private double key;

    @Transient
    @JSONField(serialize = false)
    private String name;

    @Transient
    @JSONField(serialize = false)
    private double percent;

    @Transient
    @JSONField(serialize = false)
    private double totalAmount;
}
