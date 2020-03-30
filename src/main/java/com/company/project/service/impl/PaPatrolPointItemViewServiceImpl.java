package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPointItemViewMapper;
import com.company.project.model.PaPatrolPointItemView;
import com.company.project.service.PaPatrolPointItemViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/09.
 */
@Service
@Transactional
public class PaPatrolPointItemViewServiceImpl extends AbstractService<PaPatrolPointItemView> implements PaPatrolPointItemViewService {
    @Resource
    private PaPatrolPointItemViewMapper paPatrolPointItemViewMapper;

}
