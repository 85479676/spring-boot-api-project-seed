package com.company.project.model;

import javax.persistence.*;

@Table(name = "pa_patrol_plan_point_map")
public class PaPatrolPlanPointMap {
    @Column(name = "plan_unid")
    private String planUnid;

    @Id
    @Column(name = "point_unid")
    private String pointUnid;

    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return plan_unid
     */
    public String getPlanUnid() {
        return planUnid;
    }

    /**
     * @param planUnid
     */
    public void setPlanUnid(String planUnid) {
        this.planUnid = planUnid;
    }

    /**
     * @return point_unid
     */
    public String getPointUnid() {
        return pointUnid;
    }

    /**
     * @param pointUnid
     */
    public void setPointUnid(String pointUnid) {
        this.pointUnid = pointUnid;
    }
}