package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "BS_MOTICEFICATION_STRATEGY_FM_FACILITY_MAP")
public class BsMoticeficationStrategyFmFacilityMap {

    @Column(name = "FMF_UNID")
    private String fmfUnid;

    @Id
    @Column(name = "NS_UNID")
    private String nsUnid;

    @Column(name = "SYSTEM_DTIME")
    private Date systemDtime;

    /**
     * @return FMF_UNID
     */
    public String getFmfUnid() {
        return fmfUnid;
    }

    /**
     * @param fmfUnid
     */
    public void setFmfUnid(String fmfUnid) {
        this.fmfUnid = fmfUnid;
    }

    /**
     * @return NS_UNID
     */
    public String getNsUnid() {
        return nsUnid;
    }

    /**
     * @param nsUnid
     */
    public void setNsUnid(String nsUnid) {
        this.nsUnid = nsUnid;
    }

    /**
     * @return SYSTEM_DTIME
     */
    public Date getSystemDtime() {
        return systemDtime;
    }

    /**
     * @param systemDtime
     */
    public void setSystemDtime(Date systemDtime) {
        this.systemDtime = systemDtime;
    }
}