package com.company.project.service.impl;

import com.company.project.dao.LegUserGroupMapper;
import com.company.project.model.LegUserGroup;
import com.company.project.service.LegUserGroupService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/20.
 */
@Service
@Transactional
public class LegUserGroupServiceImpl extends AbstractService<LegUserGroup> implements LegUserGroupService {
    @Resource
    private LegUserGroupMapper legUserGroupMapper;

    @Override
    public LegUserGroup selectByName(String name) {
        return legUserGroupMapper.selectGetName(name);
    }
}
