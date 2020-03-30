package com.company.project.service;

import com.company.project.model.FmRisk;
import com.company.project.core.Service;
import com.company.project.model.FmRisks;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/19.
 */
public interface FmRiskService extends Service<FmRisk> {
    List<FmRisks> getRisk(@Param("domainUnid") String domainUnid, @Param("flagDone") double flagDone);
}
