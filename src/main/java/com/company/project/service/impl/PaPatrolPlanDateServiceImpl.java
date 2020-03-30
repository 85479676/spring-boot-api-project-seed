package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPlanDateMapper;
import com.company.project.model.PaPatrolPlanDate;
import com.company.project.service.PaPatrolPlanDateService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/05.
 */
@Service
@Transactional
public class PaPatrolPlanDateServiceImpl extends AbstractService<PaPatrolPlanDate> implements PaPatrolPlanDateService {
    @Resource
    private PaPatrolPlanDateMapper paPatrolPlanDateMapper;

}
