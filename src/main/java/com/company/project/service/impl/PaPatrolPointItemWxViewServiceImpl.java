package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPointItemWxViewMapper;
import com.company.project.model.PaPatrolPointItemWxView;
import com.company.project.service.PaPatrolPointItemWxViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/11.
 */
@Service
@Transactional
public class PaPatrolPointItemWxViewServiceImpl extends AbstractService<PaPatrolPointItemWxView> implements PaPatrolPointItemWxViewService {
    @Resource
    private PaPatrolPointItemWxViewMapper paPatrolPointItemWxViewMapper;

}
