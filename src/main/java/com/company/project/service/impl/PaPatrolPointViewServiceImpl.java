package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPointViewMapper;
import com.company.project.model.PaPatrolPointView;
import com.company.project.service.PaPatrolPointViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/06.
 */
@Service
@Transactional
public class PaPatrolPointViewServiceImpl extends AbstractService<PaPatrolPointView> implements PaPatrolPointViewService {
    @Resource
    private PaPatrolPointViewMapper paPatrolPointViewMapper;

}
