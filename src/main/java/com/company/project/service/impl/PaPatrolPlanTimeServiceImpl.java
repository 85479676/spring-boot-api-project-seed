package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPlanTimeMapper;
import com.company.project.model.PaPatrolPlanTime;
import com.company.project.service.PaPatrolPlanTimeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/05.
 */
@Service
@Transactional
public class PaPatrolPlanTimeServiceImpl extends AbstractService<PaPatrolPlanTime> implements PaPatrolPlanTimeService {
    @Resource
    private PaPatrolPlanTimeMapper paPatrolPlanTimeMapper;

}
