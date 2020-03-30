package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPlanPointMapViewMapper;
import com.company.project.model.PaPatrolPlanPointMapView;
import com.company.project.service.PaPatrolPlanPointMapViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/06.
 */
@Service
@Transactional
public class PaPatrolPlanPointMapViewServiceImpl extends AbstractService<PaPatrolPlanPointMapView> implements PaPatrolPlanPointMapViewService {
    @Resource
    private PaPatrolPlanPointMapViewMapper paPatrolPlanPointMapViewMapper;

}
