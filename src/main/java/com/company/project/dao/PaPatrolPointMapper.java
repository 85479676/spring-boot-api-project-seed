package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.PaPatrolPoint;
import org.apache.ibatis.annotations.Param;

public interface PaPatrolPointMapper extends Mapper<PaPatrolPoint> {
    PaPatrolPoint selectGetName(@Param("name") String name);
}