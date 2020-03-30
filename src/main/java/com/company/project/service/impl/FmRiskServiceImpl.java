package com.company.project.service.impl;

import com.company.project.dao.FmRiskMapper;
import com.company.project.model.FmRisk;
import com.company.project.model.FmRisks;
import com.company.project.service.FmRiskService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/19.
 */
@Service
@Transactional
public class FmRiskServiceImpl extends AbstractService<FmRisk> implements FmRiskService {
    @Resource
    private FmRiskMapper fmRiskMapper;


    @Override
    public List<FmRisks> getRisk(String domainUnid, double flagDone) {
        return fmRiskMapper.getRisk(domainUnid, flagDone);
    }
}
