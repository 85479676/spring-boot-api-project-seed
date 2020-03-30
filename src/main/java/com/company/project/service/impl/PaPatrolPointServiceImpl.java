package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPointMapper;
import com.company.project.model.PaPatrolPoint;
import com.company.project.service.PaPatrolPointService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/05.
 */
@Service
@Transactional
public class PaPatrolPointServiceImpl extends AbstractService<PaPatrolPoint> implements PaPatrolPointService {
    @Resource
    private PaPatrolPointMapper paPatrolPointMapper;

    @Override
    public PaPatrolPoint selectGetName(String name) {
        return paPatrolPointMapper.selectGetName(name);
    }
}
