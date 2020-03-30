package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "FM_FACILITY_VIEW")
public class FmFacilityViews {

    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    @Column(name = "UNID")
    private String unid;

    /**
     * 火灾报警联动控制系统
     */
    @Column(name = "ID_SYSTEM")
    private Short idSystem;

    @Column(name = "ID_TYPE")
    private Short idType;


    @Column(name = "UNID_MOUNT")
    private String unidMount;


    @Column(name = "TYPE_NAME")
    private String typeName;

    @Column(name = "SYSTEM_NAME")
    private String systemName;


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
     * @return TYPE_NAME
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return SYSTEM_NAME
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * @param systemName
     */
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
}