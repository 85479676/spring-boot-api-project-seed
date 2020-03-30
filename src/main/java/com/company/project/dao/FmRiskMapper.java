package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.FmRisk;
import com.company.project.model.FmRisks;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FmRiskMapper extends Mapper<FmRisk> {
    List<FmRisks> getRisk(@Param("domainUnid") String domainUnid, @Param("flagDone") double flagDone);
}