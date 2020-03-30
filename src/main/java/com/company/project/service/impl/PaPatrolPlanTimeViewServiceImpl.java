package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPlanTimeViewMapper;
import com.company.project.model.PaPatrolPlanTimeView;
import com.company.project.service.PaPatrolPlanTimeViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/07.
 */
@Service
@Transactional
public class PaPatrolPlanTimeViewServiceImpl extends AbstractService<PaPatrolPlanTimeView> implements PaPatrolPlanTimeViewService {
    @Resource
    private PaPatrolPlanTimeViewMapper paPatrolPlanTimeViewMapper;

}
