package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPlanPointMapMapper;
import com.company.project.model.PaPatrolPlanPointMap;
import com.company.project.service.PaPatrolPlanPointMapService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/06.
 */
@Service
@Transactional
public class PaPatrolPlanPointMapServiceImpl extends AbstractService<PaPatrolPlanPointMap> implements PaPatrolPlanPointMapService {
    @Resource
    private PaPatrolPlanPointMapMapper paPatrolPlanPointMapMapper;

}
