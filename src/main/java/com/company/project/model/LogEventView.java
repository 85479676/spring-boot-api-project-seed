package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "LOG_EVENT_VIEW")
public class LogEventView {
    @Column(name = "AIID")
    private Integer aiid;
    @Id
    @Column(name = "UNID")
    private String unid;

    @Column(name = "MILLI_EPOCH")
    private Long milliEpoch;

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

    @Column(name = "AIID_ENTITY")
    private Integer aiidEntity;

    @Column(name = "UNID_ENTITY")
    private String unidEntity;

    @Column(name = "UNID_BUSINESS_UNIT")
    private String unidBusinessUnit;

    @Column(name = "ID_TYPE_0")
    private Integer idType0;

    @Column(name = "ID_TYPE")
    private Integer idType;

    @Column(name = "SUMMARY")
    private String summary;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "UNID_CELL")
    private String unidCell;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "LEVEL")
    private Byte level;

    @Column(name = "ID_FLOW")
    private Integer idFlow;

    @Column(name = "ID_SYSTEM")
    private Integer idSystem;

    @Column(name = "DATIME_BEGIN")
    private Date datimeBegin;

    @Column(name = "DATIME_END")
    private Date datimeEnd;

    @Column(name = "FLAG_END")
    private Boolean flagEnd;

    @Column(name = "FLAG_DONE")
    private Boolean flagDone;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    @Column(name = "FACILITY_NAME")
    private String facilityName;

    @Column(name = "CELL_NAME")
    private String cellName;

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
     * @return UNID_ENTITY
     */
    public String getUnidEntity() {
        return unidEntity;
    }

    /**
     * @param unidEntity
     */
    public void setUnidEntity(String unidEntity) {
        this.unidEntity = unidEntity;
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
     * @return ID_TYPE_0
     */
    public Integer getIdType0() {
        return idType0;
    }

    /**
     * @param idType0
     */
    public void setIdType0(Integer idType0) {
        this.idType0 = idType0;
    }

    /**
     * @return ID_TYPE
     */
    public Integer getIdType() {
        return idType;
    }

    /**
     * @param idType
     */
    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    /**
     * @return SUMMARY
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return UNID_CELL
     */
    public String getUnidCell() {
        return unidCell;
    }

    /**
     * @param unidCell
     */
    public void setUnidCell(String unidCell) {
        this.unidCell = unidCell;
    }

    /**
     * @return LOCATION
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return LEVEL
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * @return ID_FLOW
     */
    public Integer getIdFlow() {
        return idFlow;
    }

    /**
     * @param idFlow
     */
    public void setIdFlow(Integer idFlow) {
        this.idFlow = idFlow;
    }

    /**
     * @return ID_SYSTEM
     */
    public Integer getIdSystem() {
        return idSystem;
    }

    /**
     * @param idSystem
     */
    public void setIdSystem(Integer idSystem) {
        this.idSystem = idSystem;
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
     * @return DATIME_END
     */
    public Date getDatimeEnd() {
        return datimeEnd;
    }

    /**
     * @param datimeEnd
     */
    public void setDatimeEnd(Date datimeEnd) {
        this.datimeEnd = datimeEnd;
    }

    /**
     * @return FLAG_END
     */
    public Boolean getFlagEnd() {
        return flagEnd;
    }

    /**
     * @param flagEnd
     */
    public void setFlagEnd(Boolean flagEnd) {
        this.flagEnd = flagEnd;
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

    /**
     * @return CELL_NAME
     */
    public String getCellName() {
        return cellName;
    }

    /**
     * @param cellName
     */
    public void setCellName(String cellName) {
        this.cellName = cellName;
    }
}