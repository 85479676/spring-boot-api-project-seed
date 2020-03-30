package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPlanViewMapper;
import com.company.project.model.PaPatrolPlanView;
import com.company.project.service.PaPatrolPlanViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/05.
 */
@Service
@Transactional
public class PaPatrolPlanViewServiceImpl extends AbstractService<PaPatrolPlanView> implements PaPatrolPlanViewService {
    @Resource
    private PaPatrolPlanViewMapper paPatrolPlanViewMapper;

}
