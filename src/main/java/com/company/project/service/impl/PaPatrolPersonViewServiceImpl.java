package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPersonViewMapper;
import com.company.project.model.PaPatrolPersonView;
import com.company.project.service.PaPatrolPersonViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/09.
 */
@Service
@Transactional
public class PaPatrolPersonViewServiceImpl extends AbstractService<PaPatrolPersonView> implements PaPatrolPersonViewService {
    @Resource
    private PaPatrolPersonViewMapper paPatrolPersonViewMapper;

}
