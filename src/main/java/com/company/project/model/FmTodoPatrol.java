package com.company.project.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "FM_TODO_PATROL")
public class FmTodoPatrol {
    @Column(name = "AIID")
    private Integer aiid;
    @Id
    @Column(name = "UNID")
    private String unid;

    @Column(name = "DATIME_SYS")
    private Date datimeSys;

    @Column(name = "DATIME_MOD")
    private Date datimeMod;

    @Column(name = "DOMAIN_UNID")
    private String domainUnid;

    @Column(name = "LEFT_INX")
    private Integer leftInx;

    @Column(name = "RIGHT_INX")
    private Integer rightInx;

    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_FLOW")
    private Byte idFlow;

    @Column(name = "ID_STATUS")
    private Short idStatus;

    @Column(name = "ID_PRIORITY")
    private Byte idPriority;

    @Column(name = "OPEN_ID_REPORTER")
    private String openIdReporter;

    @Column(name = "OPEN_ID_CREATOR")
    private String openIdCreator;

    @Column(name = "OPEN_ID_ASSIGNEE")
    private String openIdAssignee;

    @Column(name = "UNID_BUSINESS_UNIT")
    private String unidBusinessUnit;

    @Column(name = "UNID_CHECKPOINT")
    private String unidCheckpoint;

    @Column(name = "DATIME_HIT")
    private Date datimeHit;

    @Column(name = "DATIME_BEGIN")
    private Date datimeBegin;

    @Column(name = "DATIME_DUE")
    private Date datimeDue;

    @Column(name = "FLAG_DONE")
    private Boolean flagDone;

    @Column(name = "FLAG_EXP")
    private Boolean flagExp;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    /**
     * @return AIID
     */
    public Integer getAiid() {
        return aiid;
    }

    /**
     * @param aiid
     */
    public void setAiid(Integer aiid) {
        this.aiid = aiid;
    }

    /**
     * @return UNID
     */
    public String getUnid() {
        return unid;
    }

    /**
     * @param unid
     */
    public void setUnid(String unid) {
        this.unid = unid;
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
     * @return DATIME_MOD
     */
    public Date getDatimeMod() {
        return datimeMod;
    }

    /**
     * @param datimeMod
     */
    public void setDatimeMod(Date datimeMod) {
        this.datimeMod = datimeMod;
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
    public Integer getLeftInx() {
        return leftInx;
    }

    /**
     * @param leftInx
     */
    public void setLeftInx(Integer leftInx) {
        this.leftInx = leftInx;
    }

    /**
     * @return RIGHT_INX
     */
    public Integer getRightInx() {
        return rightInx;
    }

    /**
     * @param rightInx
     */
    public void setRightInx(Integer rightInx) {
        this.rightInx = rightInx;
    }

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return ID_FLOW
     */
    public Byte getIdFlow() {
        return idFlow;
    }

    /**
     * @param idFlow
     */
    public void setIdFlow(Byte idFlow) {
        this.idFlow = idFlow;
    }

    /**
     * @return ID_STATUS
     */
    public Short getIdStatus() {
        return idStatus;
    }

    /**
     * @param idStatus
     */
    public void setIdStatus(Short idStatus) {
        this.idStatus = idStatus;
    }

    /**
     * @return ID_PRIORITY
     */
    public Byte getIdPriority() {
        return idPriority;
    }

    /**
     * @param idPriority
     */
    public void setIdPriority(Byte idPriority) {
        this.idPriority = idPriority;
    }

    /**
     * @return OPEN_ID_REPORTER
     */
    public String getOpenIdReporter() {
        return openIdReporter;
    }

    /**
     * @param openIdReporter
     */
    public void setOpenIdReporter(String openIdReporter) {
        this.openIdReporter = openIdReporter;
    }

    /**
     * @return OPEN_ID_CREATOR
     */
    public String getOpenIdCreator() {
        return openIdCreator;
    }

    /**
     * @param openIdCreator
     */
    public void setOpenIdCreator(String openIdCreator) {
        this.openIdCreator = openIdCreator;
    }

    /**
     * @return OPEN_ID_ASSIGNEE
     */
    public String getOpenIdAssignee() {
        return openIdAssignee;
    }

    /**
     * @param openIdAssignee
     */
    public void setOpenIdAssignee(String openIdAssignee) {
        this.openIdAssignee = openIdAssignee;
    }

    /**
     * @return UNID_BUSINESS_UNIT
     */
    public String getUnidBusinessUnit() {
        return unidBusinessUnit;
    }

    /**
     * @param unidBusinessUnit
     */
    public void setUnidBusinessUnit(String unidBusinessUnit) {
        this.unidBusinessUnit = unidBusinessUnit;
    }

    /**
     * @return UNID_CHECKPOINT
     */
    public String getUnidCheckpoint() {
        return unidCheckpoint;
    }

    /**
     * @param unidCheckpoint
     */
    public void setUnidCheckpoint(String unidCheckpoint) {
        this.unidCheckpoint = unidCheckpoint;
    }

    /**
     * @return DATIME_HIT
     */
    public Date getDatimeHit() {
        return datimeHit;
    }

    /**
     * @param datimeHit
     */
    public void setDatimeHit(Date datimeHit) {
        this.datimeHit = datimeHit;
    }

    /**
     * @return DATIME_BEGIN
     */
    public Date getDatimeBegin() {
        return datimeBegin;
    }

    /**
     * @param datimeBegin
     */
    public void setDatimeBegin(Date datimeBegin) {
        this.datimeBegin = datimeBegin;
    }

    /**
     * @return DATIME_DUE
     */
    public Date getDatimeDue() {
        return datimeDue;
    }

    /**
     * @param datimeDue
     */
    public void setDatimeDue(Date datimeDue) {
        this.datimeDue = datimeDue;
    }

    /**
     * @return FLAG_DONE
     */
    public Boolean getFlagDone() {
        return flagDone;
    }

    /**
     * @param flagDone
     */
    public void setFlagDone(Boolean flagDone) {
        this.flagDone = flagDone;
    }

    /**
     * @return FLAG_EXP
     */
    public Boolean getFlagExp() {
        return flagExp;
    }

    /**
     * @param flagExp
     */
    public void setFlagExp(Boolean flagExp) {
        this.flagExp = flagExp;
    }

    /**
     * @return FLAG_DEL
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