package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPlanMapper;
import com.company.project.model.PaPatrolPlan;
import com.company.project.service.PaPatrolPlanService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/05.
 */
@Service
@Transactional
public class PaPatrolPlanServiceImpl extends AbstractService<PaPatrolPlan> implements PaPatrolPlanService {
    @Resource
    private PaPatrolPlanMapper paPatrolPlanMapper;

}
