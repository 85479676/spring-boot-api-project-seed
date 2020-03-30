package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPlanDateViewMapper;
import com.company.project.model.PaPatrolPlanDateView;
import com.company.project.service.PaPatrolPlanDateViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/05.
 */
@Service
@Transactional
public class PaPatrolPlanDateViewServiceImpl extends AbstractService<PaPatrolPlanDateView> implements PaPatrolPlanDateViewService {
    @Resource
    private PaPatrolPlanDateViewMapper paPatrolPlanDateViewMapper;

}
