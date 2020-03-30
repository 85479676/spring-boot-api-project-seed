package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "FM_RISK")
public class FmRisk {
    @Id
    @Column(name = "AIID")
    private Integer aiid;

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

    @Column(name = "LEVEL")
    private Byte level;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ID_TYPE")
    private Integer idType;

    @Column(name = "ID_STATUS")
    private Short idStatus;

    @Column(name = "OPEN_ID_REPORTER")
    private String openIdReporter;

    @Column(name = "OPEN_ID_ASSIGNEE")
    private String openIdAssignee;

    @Column(name = "UNID_CELL")
    private String unidCell;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "FLAG_DONE")
    private Boolean flagDone;

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
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
}