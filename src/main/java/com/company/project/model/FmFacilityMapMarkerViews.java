package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "FM_FACILITY_MAP_MARKER_VIEWS")
public class FmFacilityMapMarkerViews {
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

    @Column(name = "NAME")
    private String name;

    /**
     * 火灾报警联动控制系统
     */
    @Column(name = "ID_SYSTEM")
    private Short idSystem;

    @Column(name = "ID_TYPE")
    private Short idType;

    @Column(name = "ID_MODEL")
    private Short idModel;

    @Column(name = "UNID_CELL")
    private String unidCell;

    @Column(name = "UNID_GROUP")
    private String unidGroup;

    @Column(name = "UNID_MOUNT")
    private String unidMount;

    @Column(name = "UNID_BUSINESS_UNIT")
    private String unidBusinessUnit;

    /**
     * 机号
     */
    @Column(name = "ID_HOST")
    private String idHost;

    /**
     * 分机号
     */
    @Column(name = "ID_CHANNEL")
    private String idChannel;

    /**
     * 区号
     */
    @Column(name = "ID_ZONE")
    private String idZone;

    /**
     * 位号
     */
    @Column(name = "ID_SLOT")
    private String idSlot;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "DATIME_LAST_CHECK")
    private Date datimeLastCheck;

    @Column(name = "DATIME_LAST_MTN")
    private Date datimeLastMtn;

    @Column(name = "COUNT_EVENT")
    private Integer countEvent;

    @Column(name = "BITS")
    private byte[] bits;

    @Column(name = "STATUS")
    private Integer status;

    /**
     * 是否被分层图关联
     */
    @Column(name = "FLAG_AVA")
    private Boolean flagAva;

    @Column(name = "FLAG_DEL")
    private Boolean flagDel;
    @Id
    @Column(name = "UNID_MAP")
    private String unidMap;

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
     * 获取火灾报警联动控制系统
     *
     * @return ID_SYSTEM - 火灾报警联动控制系统
     */
    public Short getIdSystem() {
        return idSystem;
    }

    /**
     * 设置火灾报警联动控制系统
     *
     * @param idSystem 火灾报警联动控制系统
     */
    public void setIdSystem(Short idSystem) {
        this.idSystem = idSystem;
    }

    /**
     * @return ID_TYPE
     */
    public Short getIdType() {
        return idType;
    }

    /**
     * @param idType
     */
    public void setIdType(Short idType) {
        this.idType = idType;
    }

    /**
     * @return ID_MODEL
     */
    public Short getIdModel() {
        return idModel;
    }

    /**
     * @param idModel
     */
    public void setIdModel(Short idModel) {
        this.idModel = idModel;
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
     * @return UNID_GROUP
     */
    public String getUnidGroup() {
        return unidGroup;
    }

    /**
     * @param unidGroup
     */
    public void setUnidGroup(String unidGroup) {
        this.unidGroup = unidGroup;
    }

    /**
     * @return UNID_MOUNT
     */
    public String getUnidMount() {
        return unidMount;
    }

    /**
     * @param unidMount
     */
    public void setUnidMount(String unidMount) {
        this.unidMount = unidMount;
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
     * 获取机号
     *
     * @return ID_HOST - 机号
     */
    public String getIdHost() {
        return idHost;
    }

    /**
     * 设置机号
     *
     * @param idHost 机号
     */
    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }

    /**
     * 获取分机号
     *
     * @return ID_CHANNEL - 分机号
     */
    public String getIdChannel() {
        return idChannel;
    }

    /**
     * 设置分机号
     *
     * @param idChannel 分机号
     */
    public void setIdChannel(String idChannel) {
        this.idChannel = idChannel;
    }

    /**
     * 获取区号
     *
     * @return ID_ZONE - 区号
     */
    public String getIdZone() {
        return idZone;
    }

    /**
     * 设置区号
     *
     * @param idZone 区号
     */
    public void setIdZone(String idZone) {
        this.idZone = idZone;
    }

    /**
     * 获取位号
     *
     * @return ID_SLOT - 位号
     */
    public String getIdSlot() {
        return idSlot;
    }

    /**
     * 设置位号
     *
     * @param idSlot 位号
     */
    public void setIdSlot(String idSlot) {
        this.idSlot = idSlot;
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
     * @return DATIME_LAST_CHECK
     */
    public Date getDatimeLastCheck() {
        return datimeLastCheck;
    }

    /**
     * @param datimeLastCheck
     */
    public void setDatimeLastCheck(Date datimeLastCheck) {
        this.datimeLastCheck = datimeLastCheck;
    }

    /**
     * @return DATIME_LAST_MTN
     */
    public Date getDatimeLastMtn() {
        return datimeLastMtn;
    }

    /**
     * @param datimeLastMtn
     */
    public void setDatimeLastMtn(Date datimeLastMtn) {
        this.datimeLastMtn = datimeLastMtn;
    }

    /**
     * @return COUNT_EVENT
     */
    public Integer getCountEvent() {
        return countEvent;
    }

    /**
     * @param countEvent
     */
    public void setCountEvent(Integer countEvent) {
        this.countEvent = countEvent;
    }

    /**
     * @return BITS
     */
    public byte[] getBits() {
        return bits;
    }

    /**
     * @param bits
     */
    public void setBits(byte[] bits) {
        this.bits = bits;
    }

    /**
     * @return STATUS
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取是否被分层图关联
     *
     * @return FLAG_AVA - 是否被分层图关联
     */
    public Boolean getFlagAva() {
        return flagAva;
    }

    /**
     * 设置是否被分层图关联
     *
     * @param flagAva 是否被分层图关联
     */
    public void setFlagAva(Boolean flagAva) {
        this.flagAva = flagAva;
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
     * @return UNID_MAP
     */
    public String getUnidMap() {
        return unidMap;
    }

    /**
     * @param unidMap
     */
    public void setUnidMap(String unidMap) {
        this.unidMap = unidMap;
    }
}