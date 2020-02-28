package com.company.project.service.impl;

import com.company.project.dao.LegUserGroupViewMapper;
import com.company.project.model.LegUserGroupView;
import com.company.project.service.LegUserGroupViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/20.
 */
@Service
@Transactional
public class LegUserGroupViewServiceImpl extends AbstractService<LegUserGroupView> implements LegUserGroupViewService {
    @Resource
    private LegUserGroupViewMapper legUserGroupViewMapper;

}
